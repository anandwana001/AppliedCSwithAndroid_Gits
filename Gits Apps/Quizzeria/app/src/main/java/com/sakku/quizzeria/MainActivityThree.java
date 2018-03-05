package com.sakku.quizzeria;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by sakina on 2/9/2018.
 */

public class MainActivityThree extends AppCompatActivity
{

    TextView score_text;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_three);
       int score =  getIntent().getIntExtra("score",0);
       score_text= (TextView) findViewById(R.id.score);
       score_text.setText(getIntent().getStringExtra("name1") + ", your score is : " + score);




    }

}
