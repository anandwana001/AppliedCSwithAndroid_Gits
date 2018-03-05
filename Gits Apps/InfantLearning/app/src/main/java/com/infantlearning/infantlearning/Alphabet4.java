package com.infantlearning.infantlearning;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Alphabet4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alphabet4);

        Button button109 = (Button) findViewById(R.id.button109);
        button109.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Alphabet4.this, Alphabet3.class);
                startActivity(i);
            }
        });

        Button button110 = (Button) findViewById(R.id.button110);
        button110.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Alphabet4.this, Alphabet5.class);
                startActivity(i);
            }
        });
    }
}
