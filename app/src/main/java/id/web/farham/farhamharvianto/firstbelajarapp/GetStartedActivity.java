package id.web.farham.farhamharvianto.firstbelajarapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class GetStartedActivity extends AppCompatActivity {

    String myEmail = "farham@gmail.com";
    Boolean kondisi = true;
    EditText emailAddress;
    Integer angka_satu = 100, angka_dua = 250, angka_tiga = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_started);

        emailAddress = findViewById(R.id.emailAddress);

        angka_tiga = angka_satu + angka_dua;
        if(angka_tiga == 10){
            // Jawaba salah Toas
            Toast.makeText(getApplicationContext(), "Salah Jumlah", Toast.LENGTH_SHORT).show();

        }else {
            //emailAddress.setText();
            Toast.makeText(getApplicationContext(), "Jumlah Benar", Toast.LENGTH_SHORT).show();

        }


    }
}
