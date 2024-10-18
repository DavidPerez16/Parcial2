package com.example.parcialhd2;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;


public class Login extends AppCompatActivity {

    EditText edt_usuario, edt_pass;
    Button btn_ingresar;
    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;
    public static final String dataUserCache = "dataUser";
    private static final int modo_pivate = Context.MODE_PRIVATE;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edt_usuario = findViewById(R.id.edt_user);
        edt_pass = findViewById(R.id.edt_pass);
        btn_ingresar = findViewById(R.id.btn_login);


        sharedPreferences = getSharedPreferences(dataUserCache,modo_pivate);
        editor =sharedPreferences.edit();

        btn_ingresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (edt_usuario.getText().toString().equals("")||edt_pass.getText().toString().equals("")){
                    Toast.makeText(Login.this,"Check the fields, none of them should be empty",Toast.LENGTH_LONG).show();
                }else{

                }
            }
        });


    }
}