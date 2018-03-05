package com.infantlearning.infantlearning;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Swar10 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_swar10);

        Button button96 = (Button) findViewById(R.id.button96);
        button96.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Swar10.this, Swar9.class);
                startActivity(i);
            }
        });
        Button button97 = (Button) findViewById(R.id.button97);
        button97.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Swar10.this, Swar11.class);
                startActivity(i);
            }
        });
    }
}
