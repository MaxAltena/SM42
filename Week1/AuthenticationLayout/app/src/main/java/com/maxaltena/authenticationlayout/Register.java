package com.maxaltena.authenticationlayout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Register extends AppCompatActivity {
    public static final String MSG = "com.maxaltena.authenticationlayout.MSG";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
    }

    /** Called when the user taps the 'Log in' button */
    public void gotoLogin(View view) {
        Intent intent = new Intent(this, Login.class);
        startActivity(intent);
    }

    public void clickedRegister(View view){
        Intent intent = new Intent(this, show.class);
        Button b = (Button)view;
        String text = b.getText().toString();
        intent.putExtra(MSG, text);
        startActivity(intent);
    }
}
