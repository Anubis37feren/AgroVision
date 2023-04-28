package com.perfectcorp.brift;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class Specilaistes extends AppCompatActivity {

    @SuppressLint("WrongConstant")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_specilaistes);


        LinearLayout l = findViewById(R.id.l1);
        l.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Specilaistes.this, ChatSpecialiste.class);
                startActivity(intent);
            }
        });

        LinearLayout l1 = findViewById(R.id.l2);
        l1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Specilaistes.this, ChatSpecialiste.class);
                startActivity(intent);
            }
        });

        LinearLayout l2 = findViewById(R.id.l3);
        l2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Specilaistes.this, ChatSpecialiste.class);
                startActivity(intent);
            }
        });

        LinearLayout l3 = findViewById(R.id.l4);
        l3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Specilaistes.this, ChatSpecialiste.class);
                startActivity(intent);
            }
        });

        LinearLayout l4 = findViewById(R.id.l5);
        l4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Specilaistes.this, ChatSpecialiste.class);
                startActivity(intent);
            }
        });

        LinearLayout l5 = findViewById(R.id.l6);
        l5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Specilaistes.this, ChatSpecialiste.class);
                startActivity(intent);
            }
        });
    }
}