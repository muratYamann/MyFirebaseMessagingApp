package com.yamankod.mymessagingapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by macbookpro on 8.07.2017.
 */

public class Login extends Activity{

    EditText etUserNamee , etUserPass;
    Button btnLogin,btnSignUp;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        setupVariable();

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(i);
            }
        });

        btnSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),SignUp.class);
                startActivity(i);
            }
        });




    }

    public void  setupVariable(){
        etUserNamee = (EditText)findViewById(R.id.etUserName);
        etUserPass = (EditText)findViewById(R.id.etPass);
        btnLogin = (Button)findViewById(R.id.btnLogin);
        btnSignUp = (Button)findViewById(R.id.btnSignUp);

    }



}
