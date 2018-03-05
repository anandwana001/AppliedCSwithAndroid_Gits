package com.dm.digimanage;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.database.Cursor;
import android.graphics.BitmapFactory;
import android.widget.ImageView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.Spinner;
import android.provider.MediaStore;
import android.widget.SpinnerAdapter;
import android.widget.Toast;

public class Form extends AppCompatActivity {

    private static final int SELECT_PICTURE = 1;
    private static final String TAG = "Form";

    Spinner s1, s2, s3, s4, s5;
    public String emailaddr[] = new String[1];
    String emailstudent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);
        /*s1 = (Spinner) findViewById(R.id.spinner_college);
        s2 = (Spinner) findViewById(R.id.spinner_department);
        s3 = (Spinner) findViewById(R.id.spinner_category);
        s4 = (Spinner) findViewById(R.id.spinner_authority_name);
        s5 = (Spinner) findViewById(R.id.spinner_request);*/
        //s1.setOnItemSelectedListener(this);

        String[] arraySpinner = new String[]{"GITS"};
        Spinner s1 = (Spinner) findViewById(R.id.spinner_college);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, arraySpinner);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_item);
        s1.setAdapter(adapter);

        String[] arraySpinner1 = new String[]{"CSE"};
        Spinner s2 = (Spinner) findViewById(R.id.spinner_department);
        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, arraySpinner1);
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_item);
        s2.setAdapter(adapter1);


        String[] arraySpinner2 = new String[]{"Student"};
        Spinner s3 = (Spinner) findViewById(R.id.spinner_category);
        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, arraySpinner2);
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_item);
        s3.setAdapter(adapter2);

        String[] arraySpinner3 = new String[]{"Ruman Ahmed Rizvi"};
        Spinner s4 = (Spinner) findViewById(R.id.spinner_authority_name);
        ArrayAdapter<String> adapter3 = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, arraySpinner3);
        adapter3.setDropDownViewResource(android.R.layout.simple_spinner_item);
        s4.setAdapter(adapter3);

        String[] arraySpinner4 = new String[]{"Complaint", "Information", "Suggestion"};
        Spinner s5 = (Spinner) findViewById(R.id.spinner_request);
        ArrayAdapter<String> adapter4 = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, arraySpinner4);
        adapter4.setDropDownViewResource(android.R.layout.simple_spinner_item);
        s5.setAdapter(adapter4);
    }

    public void submitOrder(View view) {
        // Get user's name
        /*EditText nameField = (EditText) findViewById(R.id.edit_text);
        Editable nameEditable = nameField.getText();
        String name = nameEditable.toString();*/

        EditText email = (EditText) findViewById(R.id.edit_text_email);
        Editable emailEditable = email.getText();
        emailstudent = emailEditable.toString();

        Spinner authority = (Spinner) findViewById(R.id.spinner_authority_name);
        String authorityEditable = authority.getSelectedItem().toString();

        if (authorityEditable.equals("Ruman Ahmed Rizvi")) {
            emailaddr[0] = "example@gmail.com";
        }


        Spinner request = (Spinner) findViewById(R.id.spinner_request);
        String requestEditable = request.getSelectedItem().toString();

        EditText message = (EditText) findViewById(R.id.edit_text_message);
        Editable messageEditable = message.getText();

        String message1 = messageEditable.toString();

        // Display the order summary on the screen
        String completemessage = createOrderSummary(requestEditable, message1);

        // Use an intent to launch an email app.
        // Send the order summary in the email body.
        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setType("image/*");
        intent.setData(Uri.parse("mailto:")); // only email apps should handle this
        intent.putExtra(Intent.EXTRA_SUBJECT,
                getString(R.string.order_summary_email_subject));
        intent.putExtra(android.content.Intent.EXTRA_BCC, new String[]{"example@gmail.com"});
        intent.putExtra(Intent.EXTRA_CC, new String[]{"form@gmail.com"});
        intent.putExtra(Intent.EXTRA_TEXT, completemessage);

        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }

    @SuppressLint("StringFormatMatches")
    private String createOrderSummary(String requesta,
                                      String mess) {

        String FullMessage = getString(R.string.order_summary_name, requesta);
        FullMessage += "\n" + getString(R.string.addwhipped_cream, mess);
        FullMessage += "\n" + getString(R.string.thank_you);
        return FullMessage;
    }

    /* @Override
    public void onItemSelected(AdapterView<?> arg0, View arg1, int arg2,
                               long arg3) {
        String sp1= String.valueOf(s1.getSelectedItem());
        Toast.makeText(this, sp1, Toast.LENGTH_SHORT).show();
        if(sp1.contentEquals("GITS")) {
            List<String> list = new ArrayList<String>();
            list.add("Salary");
            list.add("Sales");
            list.add("Others");
            ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this,
                    android.R.layout.simple_spinner_item, list);
            dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            dataAdapter.notifyDataSetChanged();
            s2.setAdapter(dataAdapter);
        }*/

    /* Choose an image from Gallery */
    void openImageChooser() {
        Intent intent = new Intent();
        intent.setType("image/*");
        intent.setAction(Intent.ACTION_GET_CONTENT);
        startActivityForResult(Intent.createChooser(intent, "Select Picture"), SELECT_PICTURE);
    }

    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        Uri selectedImageUri;
        if (resultCode == RESULT_OK) {
            if (requestCode == SELECT_PICTURE) {
                // Get the url from data
                selectedImageUri = data.getData();
                if (null != selectedImageUri) {
                    // Get the path from the Uri
                    String path = getPathFromURI(selectedImageUri);
                    Log.i(TAG, "Image Path : " + path);
                    // Set the image in ImageView
                    ((ImageView) findViewById(R.id.image_chosen)).setImageURI(selectedImageUri);
                }
            }
        }
    }

    /* Get the real path from the URI */
    public String getPathFromURI(Uri contentUri) {
        String res = null;
        String[] proj = {MediaStore.Images.Media.DATA};
        Cursor cursor = getContentResolver().query(contentUri, proj, null, null, null);
        if (cursor.moveToFirst()) {
            int column_index = cursor.getColumnIndexOrThrow(MediaStore.Images.Media.DATA);
            res = cursor.getString(column_index);
        }
        cursor.close();
        return res;
    }

    public void onClick(View v) {
        openImageChooser();
    }
}