package com.infantlearning.infantlearning;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Alphabet12 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alphabet12);

        Button button125 = (Button) findViewById(R.id.button125);
        button125.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Alphabet12.this, Alphabet11.class);
                startActivity(i);
            }
        });

        Button button126 = (Button) findViewById(R.id.button126);
        button126.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Alphabet12.this, Alphabet13.class);
                startActivity(i);
            }
        });
    }
}
