package com.infantlearning.infantlearning;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Alphabet11 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alphabet11);

        Button button123 = (Button) findViewById(R.id.button123);
        button123.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Alphabet11.this, Alphabet10.class);
                startActivity(i);
            }
        });

        Button button124 = (Button) findViewById(R.id.button124);
        button124.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Alphabet11.this, Alphabet12.class);
                startActivity(i);
            }
        });
    }
}
