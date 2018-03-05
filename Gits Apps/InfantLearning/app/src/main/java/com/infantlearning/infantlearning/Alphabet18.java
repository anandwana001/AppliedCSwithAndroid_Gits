package com.infantlearning.infantlearning;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Alphabet18 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alphabet18);

        Button button137 = (Button) findViewById(R.id.button137);
        button137.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Alphabet18.this, Alphabet17.class);
                startActivity(i);
            }
        });

        Button button138 = (Button) findViewById(R.id.button138);
        button138.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Alphabet18.this, Alphabet19.class);
                startActivity(i);
            }
        });
    }
}
