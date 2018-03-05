package com.infantlearning.infantlearning;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Alphabet5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alphabet5);

        Button button112 = (Button) findViewById(R.id.button112);
        button112.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Alphabet5.this, Alphabet4.class);
                startActivity(i);
            }
        });

        Button button113 = (Button) findViewById(R.id.button113);
        button113.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Alphabet5.this, Alphabet6.class);
                startActivity(i);
            }
        });
    }
}
