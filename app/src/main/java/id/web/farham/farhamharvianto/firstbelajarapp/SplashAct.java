package id.web.farham.farhamharvianto.firstbelajarapp;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class SplashAct extends AppCompatActivity {

    ImageView applogo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);


        // Mendapatkan ID dari XML
        applogo.findViewById(R.id.applogo);

        // Memberikan Event pada Button
        applogo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Menuji Halaman Lainya
                Intent abc = new Intent(SplashAct.this, GetStartedActivity.class);
                startActivity(abc);
                finish();
            }
        });
    }
}
