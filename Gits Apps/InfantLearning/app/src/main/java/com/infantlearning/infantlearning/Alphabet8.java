package com.infantlearning.infantlearning;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Alphabet8 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alphabet8);

        Button button117 = (Button) findViewById(R.id.button117);
        button117.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Alphabet8.this, Alphabet7.class);
                startActivity(i);
            }
        });

        Button button118 = (Button) findViewById(R.id.button118);
        button118.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Alphabet8.this, Alphabet9.class);
                startActivity(i);
            }
        });
    }
}
