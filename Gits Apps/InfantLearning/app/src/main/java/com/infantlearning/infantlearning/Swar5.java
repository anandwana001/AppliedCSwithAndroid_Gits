package com.infantlearning.infantlearning;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Swar5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_swar5);

        Button button86 = (Button) findViewById(R.id.button86);
        button86.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Swar5.this, Swar4.class);
                startActivity(i);
            }
        });

        Button button87 = (Button) findViewById(R.id.button87);
        button87.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Swar5.this, Swar6.class);
                startActivity(i);
            }
        });
    }
}
