package com.xx.disease.disease_predict;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        ArrayList<String> listDisease = this.getIntent().getStringArrayListExtra("diseaselist");
       String predictDisease =this.getIntent().getStringExtra("predictDisease");
        LayoutInflater inflater = (LayoutInflater)getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        TextView symp1 = (TextView)findViewById(R.id.textView5);
        TextView symp2 = (TextView)findViewById(R.id.textView6);
        TextView symp3 = (TextView)findViewById(R.id.textView7);
        for(int i = 0; i< listDisease.size(); i++){
            String name = listDisease.get(i);
            if(i==0){
                symp1.setText (name);
            }else if(i==1){
                symp2.setText(name);
            } if(i==2){
                symp3.setText(listDisease.get(i));
            }
        }

        TextView symp4 = (TextView)findViewById(R.id.textView9);
            symp4.setText(predictDisease);
        

    }
}
