package com.infantlearning.infantlearning;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Alphabet23 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alphabet23);

        Button button147 = (Button) findViewById(R.id.button147);
        button147.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Alphabet23.this, Alphabet22.class);
                startActivity(i);
            }
        });

        Button button148 = (Button) findViewById(R.id.button148);
        button148.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Alphabet23.this, Alphabet24.class);
                startActivity(i);
            }
        });
    }
}
