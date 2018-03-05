package com.infantlearning.infantlearning;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Alphabet2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alphabet2);

        Button button105 = (Button) findViewById(R.id.button105);
        button105.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Alphabet2.this, Alphabet1.class);
                startActivity(i);
            }
        });

        Button button106 = (Button) findViewById(R.id.button106);
        button106.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Alphabet2.this, Alphabet3.class);
                startActivity(i);
            }
        });
    }
}
