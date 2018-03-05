package com.infantlearning.infantlearning;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Alphabet24 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alphabet24);

        Button button149 = (Button) findViewById(R.id.button149);
        button149.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Alphabet24.this, Alphabet23.class);
                startActivity(i);
            }
        });

        Button button150 = (Button) findViewById(R.id.button150);
        button150.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Alphabet24.this, Alphabet25.class);
                startActivity(i);
            }
        });
    }
}
