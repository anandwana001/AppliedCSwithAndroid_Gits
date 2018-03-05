package com.sakku.quizzeria;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {


    //EditText name = (EditText) findViewById(R.id.textname);
    // Editable nameedit= name.getText();
    ///String name1= nameedit.toString();
    //EditText name = (EditText)findViewById(R.id.textname);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //EditText name = (EditText)findViewById(R.id.textname);
        findViewById(R.id.java).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivityTwo.class);
                intent.putExtra("test", 0);
                intent.putExtra("name1", getUserName());
                startActivity(intent);
            }
        });

        findViewById(R.id.android).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivityTwo.class);
                intent.putExtra("test", 1);
                intent.putExtra("name1", getUserName());
                startActivity(intent);
            }
        });

        findViewById(R.id.cplus).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivityTwo.class);
                intent.putExtra("test", 2);
                intent.putExtra("name1", getUserName());
                startActivity(intent);
            }
        });



    }

    private String getUserName()
    {
        EditText name = findViewById(R.id.textname);
        return name.getText().toString();
    }
//    public void android_quiz(View view)
//    {

//    }


}
