package com.infantlearning.infantlearning;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Alphabet13 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alphabet13);

        Button button127 = (Button) findViewById(R.id.button127);
        button127.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Alphabet13.this, Alphabet12.class);
                startActivity(i);
            }
        });

        Button button128 = (Button) findViewById(R.id.button128);
        button128.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Alphabet13.this, Alphabet14.class);
                startActivity(i);
            }
        });
    }
}
