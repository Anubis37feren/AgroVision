package com.perfectcorp.brift;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class accueil extends AppCompatActivity {

    Button suivant ;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_accueil);
            suivant = findViewById(R.id.suivant);
            suivant.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent call = new Intent(getApplicationContext(), Accueil.class);
                    startActivity(call);
                    finish();
                }
            });
        }
    }