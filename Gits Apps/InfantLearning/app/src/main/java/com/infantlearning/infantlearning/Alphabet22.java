package com.infantlearning.infantlearning;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Alphabet22 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alphabet22);

        Button button145 = (Button) findViewById(R.id.button145);
        button145.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Alphabet22.this, Alphabet21.class);
                startActivity(i);
            }
        });

        Button button146 = (Button) findViewById(R.id.button146);
        button146.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Alphabet22.this, Alphabet23.class);
                startActivity(i);
            }
        });
    }
}
