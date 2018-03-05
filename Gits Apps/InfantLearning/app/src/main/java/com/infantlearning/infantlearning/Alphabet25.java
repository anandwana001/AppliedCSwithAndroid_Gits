package com.infantlearning.infantlearning;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Alphabet25 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alphabet25);

        Button button151 = (Button) findViewById(R.id.button151);
        button151.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Alphabet25.this, Alphabet24.class);
                startActivity(i);
            }
        });

        Button button152 = (Button) findViewById(R.id.button152);
        button152.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Alphabet25.this, Alphabet26.class);
                startActivity(i);
            }
        });
    }
}
