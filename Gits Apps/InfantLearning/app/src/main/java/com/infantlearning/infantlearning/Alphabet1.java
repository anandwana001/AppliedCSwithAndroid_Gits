package com.infantlearning.infantlearning;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Alphabet1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alphabet1);

        Button button103 = (Button) findViewById(R.id.button103);
        button103.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Alphabet1.this, Englishlang.class);
                startActivity(i);
            }
        });

        Button button104 = (Button) findViewById(R.id.button104);
        button104.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Alphabet1.this, Alphabet2.class);
                startActivity(i);
            }
        });
    }
}
