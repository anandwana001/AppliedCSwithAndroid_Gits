package com.infantlearning.infantlearning;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Alphabet20 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alphabet20);

        Button button141 = (Button) findViewById(R.id.button141);
        button141.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Alphabet20.this, Alphabet19.class);
                startActivity(i);
            }
        });

        Button button142 = (Button) findViewById(R.id.button142);
        button142.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Alphabet20.this, Alphabet21.class);
                startActivity(i);
            }
        });
    }
}
