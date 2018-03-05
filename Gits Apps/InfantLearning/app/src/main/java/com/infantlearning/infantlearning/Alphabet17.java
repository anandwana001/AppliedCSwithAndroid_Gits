package com.infantlearning.infantlearning;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Alphabet17 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alphabet17);

        Button button135 = (Button) findViewById(R.id.button135);
        button135.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Alphabet17.this, Alphabet16.class);
                startActivity(i);
            }
        });

        Button button136 = (Button) findViewById(R.id.button136);
        button136.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Alphabet17.this, Alphabet18.class);
                startActivity(i);
            }
        });
    }
}
