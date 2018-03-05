package com.infantlearning.infantlearning;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Alphabet19 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alphabet19);

        Button button139 = (Button) findViewById(R.id.button139);
        button139.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Alphabet19.this, Alphabet18.class);
                startActivity(i);
            }
        });

        Button button140 = (Button) findViewById(R.id.button140);
        button140.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Alphabet19.this, Alphabet20.class);
                startActivity(i);
            }
        });
    }
}
