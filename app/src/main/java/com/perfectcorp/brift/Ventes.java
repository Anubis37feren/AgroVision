package com.perfectcorp.brift;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;

public class Ventes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ventes);

        Button b = findViewById(R.id.bt1);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Ventes.this, Fournisseurs.class);
                startActivity(intent);
            }
        });

        Button b1 = findViewById(R.id.bt2);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Ventes.this, Fournisseurs.class);
                startActivity(intent);
            }
        });

        Button b2 = findViewById(R.id.bt3);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Ventes.this, Fournisseurs.class);
                startActivity(intent);
            }
        });
    }
}