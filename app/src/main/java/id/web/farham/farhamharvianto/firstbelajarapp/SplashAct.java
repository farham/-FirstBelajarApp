package id.web.farham.farhamharvianto.firstbelajarapp;

import android.content.Intent;
import android.graphics.Color;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class SplashAct extends AppCompatActivity {

    ImageView splashLogo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        // Mendapati ID pada XML
        splashLogo = findViewById(R.id.splashLogo);

        // Memberikan Event Kepada Button App Logo
        /*
        splashLogo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Menuju Halaman Lainn
                Intent pindah = new Intent(SplashAct.this, GetStartedActivity.class);
                startActivity(pindah);
                finish();
            }
        });*/

        // Membuat Timer untuk Pindah Activity secara OTomatis
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                // Melakukan sesuatu setelah 2 Detik
                Intent pindah = new Intent(SplashAct.this, GetStartedActivity.class);
                startActivity(pindah);
                finish();
            }
        }, 2000);

    }
}
