package com.perfectcorp.brift;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class audio extends AppCompatActivity {

    Button button2, ext;

    private MediaPlayer mediaPlayer;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_audio);
       this.mediaPlayer=MediaPlayer.create(getApplicationContext(), R.raw.audio );

       button2 = findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent call = new Intent(getApplicationContext(), guide.class);
                startActivity(call);
                finish();
            }

        });

        ext = findViewById(R.id.back);
        ext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent call = new Intent(getApplicationContext(), Accueil.class);
                startActivity(call);
                finish();
            }
        });
    }

   public void playSound(View view) {
      mediaPlayer.start();}



}