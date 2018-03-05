package com.infantlearning.infantlearning;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Alphabet10 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alphabet10);

        Button button121 = (Button) findViewById(R.id.button121);
        button121.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Alphabet10.this, Alphabet9.class);
                startActivity(i);
            }
        });

        Button button122 = (Button) findViewById(R.id.button122);
        button122.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Alphabet10.this, Alphabet11.class);
                startActivity(i);
            }
        });
    }
}
