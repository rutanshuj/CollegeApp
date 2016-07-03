package com.example.admin.collegeadg;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class SignUpP1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_p1);
    }

    public void button(View view){
        Intent i= new Intent(this, SignUpPage2.class);
        startActivity(i);
    }
}
