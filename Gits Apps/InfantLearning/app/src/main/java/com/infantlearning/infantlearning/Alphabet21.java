package com.infantlearning.infantlearning;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Alphabet21 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alphabet21);

        Button button143 = (Button) findViewById(R.id.button143);
        button143.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Alphabet21.this, Alphabet20.class);
                startActivity(i);
            }
        });

        Button button144 = (Button) findViewById(R.id.button144);
        button144.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Alphabet21.this, Alphabet22.class);
                startActivity(i);
            }
        });
    }
}
