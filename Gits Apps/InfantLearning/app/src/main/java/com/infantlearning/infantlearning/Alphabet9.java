package com.infantlearning.infantlearning;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Alphabet9 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alphabet9);

        Button button119 = (Button) findViewById(R.id.button119);
        button119.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Alphabet9.this, Alphabet8.class);
                startActivity(i);
            }
        });

        Button button120 = (Button) findViewById(R.id.button120);
        button120.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Alphabet9.this, Alphabet10.class);
                startActivity(i);
            }
        });
    }
}
