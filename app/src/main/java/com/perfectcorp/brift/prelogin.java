package com.perfectcorp.brift;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class prelogin extends AppCompatActivity {

    Button csc;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prelogin);

        final Button login = findViewById(R.id.login);
        csc = findViewById(R.id.csc);
        final Button register = findViewById(R.id.register);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent call = new Intent(getApplicationContext(), login.class);
                startActivity(call);
            }
        });

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent call = new Intent(getApplicationContext(), register.class);
                startActivity(call);


            }
        });

        csc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent call = new Intent(getApplicationContext(), Accueil.class);
                startActivity(call);
                finish();

            }
        });


    }
    }
