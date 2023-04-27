package com.perfectcorp.brift;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;


public class audio extends AppCompatActivity {

    private MediaPlayer mediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       // this.mediaPlayer=MediaPlayer.create(getApplicationContext(), R.raw.gims );
    }

    public void playSound(View view) {
        mediaPlayer.start();
    }
}