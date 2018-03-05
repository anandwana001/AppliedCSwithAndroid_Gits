package com.infantlearning.infantlearning;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Alphabet15 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alphabet15);

        Button button131 = (Button) findViewById(R.id.button131);
        button131.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Alphabet15.this, Alphabet14.class);
                startActivity(i);
            }
        });

        Button button132 = (Button) findViewById(R.id.button132);
        button132.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Alphabet15.this, Alphabet16.class);
                startActivity(i);
            }
        });
    }
}
