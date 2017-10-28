package com.example.carpooling_2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Sign_up_Activity extends AppCompatActivity {

    private View Email1;
    private View Password1;
    private View VPass;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Email1 = (EditText)findViewById(R.id.Email);
        Password1 = (EditText)findViewById(R.id.Password);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_);
    }
}
