package com.maxaltena.authenticationlayout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Login extends AppCompatActivity {
    public static final String MSG = "com.maxaltena.authenticationlayout.MSG";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    /** Called when the user taps the 'Register' button */
    public void gotoRegister(View view) {
        Intent intent = new Intent(this, Register.class);
        startActivity(intent);
    }

    public void clickedLogin(View view){
        Intent intent = new Intent(this, show.class);
        Button b = (Button)view;
        String text = b.getText().toString();
        intent.putExtra(MSG, text);
        startActivity(intent);
    }
}
