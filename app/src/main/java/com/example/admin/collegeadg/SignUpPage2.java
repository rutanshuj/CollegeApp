package com.example.admin.collegeadg;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SignUpPage2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_page2);
    }

    public void clickhere(View view){
        Intent i= new Intent(this, MainActivity.class);
        startActivity(i);
    }
}
