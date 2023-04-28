package com.perfectcorp.brift;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class guide extends AppCompatActivity {
    Button bak, french, anglais, langloc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guide);

        bak = findViewById(R.id.back);
        bak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            Intent call = new Intent(getApplicationContext(), Accueil.class);
            startActivity(call);
            finish();
            }
        });

        french = findViewById(R.id.francais);
        french.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent call = new Intent(getApplicationContext(), guide1.class);
                startActivity(call);
            }
        });


        anglais = findViewById(R.id.anglais);
        anglais.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent call = new Intent(getApplicationContext(), enguide1.class);
                startActivity(call);
            }
        });

        langloc = findViewById(R.id.langueloc);
        langloc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent call = new Intent(getApplicationContext(), audio.class);
                startActivity(call);
            }
        });
    }
}