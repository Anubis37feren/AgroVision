package com.perfectcorp.brift;

        import androidx.appcompat.app.AppCompatActivity;

        import android.content.Intent;
        import android.os.Bundle;
        import android.os.Handler;

        import com.perfectcorp.brift.R;

public class splash extends AppCompatActivity {



    private final int time = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(getApplicationContext(), prelogin.class);
                startActivity(intent);
                finish();

            }
        }, time);
    }
}