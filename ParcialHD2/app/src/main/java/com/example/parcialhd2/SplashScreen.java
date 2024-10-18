package com.example.parcialhd2;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

public class SplashScreen extends AppCompatActivity {

    public static final String dataUserCache = "dataUser";
    private static final int modo_pivate = Context.MODE_PRIVATE;
    String token;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);


        validarLogin();
    }

    private void validarLogin() {
        token = getApplicationContext().getSharedPreferences(dataUserCache,modo_pivate).getString("usuario","0");

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                if (token.equalsIgnoreCase("0")){
                    Intent i = new Intent(SplashScreen.this, Login.class);
                    startActivity(i);
                    finish();
                }else {

                    Intent i = new Intent(SplashScreen.this, MainActivity.class);
                    startActivity(i);
                    finish();
                }
            }
        },3000);


    }
}