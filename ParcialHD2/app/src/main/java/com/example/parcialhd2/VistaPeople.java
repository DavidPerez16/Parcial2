package com.example.parcialhd2;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class VistaPeople extends AppCompatActivity {


    Button btn_back;
    public static final String dataUserCache = "dataUser";
    private static final int modo_private = Context.MODE_PRIVATE;
    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;
    String datoShared;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vista_people);

        btn_back = findViewById(R.id.btn_back);

        sharedPreferences = getSharedPreferences(dataUserCache,modo_private);
        editor =sharedPreferences.edit();

        datoShared = getApplicationContext().getSharedPreferences(dataUserCache,modo_private).getString("usuario","0");


        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editor.clear();
                editor.commit();
                Intent i = new Intent(VistaPeople.this,Login.class);
                startActivity(i);
                finish();
            }
        });
    }

}
