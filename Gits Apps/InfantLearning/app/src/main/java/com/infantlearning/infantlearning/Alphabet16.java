package com.infantlearning.infantlearning;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Alphabet16 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alphabet16);

        Button button133 = (Button) findViewById(R.id.button133);
        button133.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Alphabet16.this, Alphabet15.class);
                startActivity(i);
            }
        });

        Button button134 = (Button) findViewById(R.id.button134);
        button134.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Alphabet16.this, Alphabet17.class);
                startActivity(i);
            }
        });
    }
}
