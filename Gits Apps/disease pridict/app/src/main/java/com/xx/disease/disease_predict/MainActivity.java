package com.xx.disease.disease_predict;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.nfc.Tag;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MainActivity extends AppCompatActivity
{

    String[] items = new String[]{"Select..","headache", "cold", "backpain","stomachache","jointpain"};
    ArrayList<String> selecteditems= new ArrayList<String>();
    HashMap<String,ArrayList<String>> des = new HashMap<>();
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<String> sym= new ArrayList<>();
        sym.add("headache");
        sym.add("cold");
        des.put("Swine Flu",sym);




        Spinner dropdown = findViewById(R.id.spinner1);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, items);

        dropdown.setAdapter(adapter);
        dropdown.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
        @Override
        public void onItemSelected(AdapterView<?> parent, View view, int position, long l) {
            if(position!=0) {
                String item = parent.getItemAtPosition(position).toString();
                System.out.print(item);
                selecteditems.add(item);
                listDisease();
            }
        }

        @Override
        public void onNothingSelected(AdapterView parent) {





        }
    });








    }
    public void clear(View v)
           {
               selecteditems.clear();
               listDisease();
           }

           private  void listDisease(){
               final ArrayAdapter<String> adapterlst = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, selecteditems);

               ListView listView = (ListView) findViewById(R.id.mobile_list);
               listView.setAdapter(adapterlst);

           }
    public void Predict(View v)
    {
       String disease="";
        boolean found= true;
        Iterator it = des.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry)it.next();
           ArrayList<String> st = (ArrayList<String>) pair.getValue();
            for (String selecteditem : selecteditems) {
                if(!st.contains(selecteditem))
                {
                    found=false;
                    break;
                }
            }
            if(found){
                disease=pair.getKey().toString();
                 Intent i=new Intent(this,MainActivity2.class);
                 i.putStringArrayListExtra("diseaselist",selecteditems);
                 i.putExtra("predictDisease",disease);
                startActivity(i);


            }else{
                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
                alertDialogBuilder.setMessage("No disease found!");
                        alertDialogBuilder.setPositiveButton("OK",
                                new DialogInterface.OnClickListener() {
                                    @Override
                                    public void onClick(DialogInterface arg0, int arg1) {

                                    }
                                });

                AlertDialog alertDialog = alertDialogBuilder.create();
                alertDialog.show();
            }

        }
    }

}
