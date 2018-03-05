package com.infantlearning.infantlearning;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Alphabet7 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alphabet7);

        Button button115 = (Button) findViewById(R.id.button115);
        button115.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Alphabet7.this, Alphabet6.class);
                startActivity(i);
            }
        });

        Button button116 = (Button) findViewById(R.id.button116);
        button116.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Alphabet7.this, Alphabet8.class);
                startActivity(i);
            }
        });
    }
}
