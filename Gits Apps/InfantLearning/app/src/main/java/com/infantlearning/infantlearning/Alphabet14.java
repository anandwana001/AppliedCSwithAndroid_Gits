package com.infantlearning.infantlearning;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Alphabet14 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alphabet14);

        Button button129 = (Button) findViewById(R.id.button129);
        button129.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Alphabet14.this, Alphabet13.class);
                startActivity(i);
            }
        });

        Button button130 = (Button) findViewById(R.id.button130);
        button130.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Alphabet14.this, Alphabet15.class);
                startActivity(i);
            }
        });
    }
}
