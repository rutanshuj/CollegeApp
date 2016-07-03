package com.example.admin.collegeadg;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void signup(View v)
    {
        Intent i=new Intent();
        i.setClass(this,SignUpP1.class);
        startActivity(i);
    }


    public void signin(View view) {
        final Intent i =new Intent(this, NavigationActivity.class);
        final ProgressDialog progress = new ProgressDialog(this);
        progress.setTitle("Logging In");
        progress.setMessage("Setting Up Profile");
        long delay = 5000;
        progress.show();

        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                progress.dismiss();
                startActivity(i);
            }
        }, delay);

    }

}
