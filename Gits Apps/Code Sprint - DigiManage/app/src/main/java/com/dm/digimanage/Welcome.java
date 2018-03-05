package com.dm.digimanage;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ProgressBar;

public class Welcome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        ProgressBar simpleProgressBar = (ProgressBar) findViewById(R.id.progressBar); // initiate the progress bar
        int progressValue = simpleProgressBar.getProgress(); // get progress value from the progress bar

        setProgressValue(progressValue);
    }


    private void setProgressValue(final int progress) {
        //ProgressBar simpleProgressBar = (ProgressBar) findViewById(R.id.progressBar);
        // set the progress
        //simpleProgressBar.setProgress(progress);
        // thread is used to change the progress value
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                setProgressValue(progress + 20);
                if(progress==100)
                {
                    Intent intent= new Intent(Welcome.this,Form.class);
                    startActivity(intent);
                    finish();
                }
            }
        });
        thread.start();
    }
}
