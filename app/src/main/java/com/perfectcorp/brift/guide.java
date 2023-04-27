package com.perfectcorp.brift;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class guide extends AppCompatActivity {
    Button bak;

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
    }
}