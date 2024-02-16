package com.amel.multiamelia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class konversisuhu extends AppCompatActivity {
    private EditText suhuAwalEditText;
    private TextView suhuKonversiTextView;
    private RadioButton rbCelcius, rbFahrenheit, rbKelvin, rbCelcius2, rbFahrenheit2, rbKelvin2;
    private Button konversiButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_konversisuhu);

        suhuAwalEditText = findViewById(R.id.suhu_awal);
        suhuKonversiTextView = findViewById(R.id.suhu_konversi);
        rbCelcius = findViewById(R.id.rbcelcius);
        rbFahrenheit = findViewById(R.id.rbfahrenheit);
        rbKelvin = findViewById(R.id.rbkelvin);
        rbCelcius2 = findViewById(R.id.rbcelcius2);
        rbFahrenheit2 = findViewById(R.id.rbfahrenheit2);
        rbKelvin2 = findViewById(R.id.rbkelvin2);
        konversiButton = findViewById(R.id.btkonversi);

        konversiButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double suhuAwal = Double.parseDouble(suhuAwalEditText.getText().toString());
                double suhuKonversi = 0;

                if (rbCelcius.isChecked()) {
                    if (rbCelcius2.isChecked()) {
                        suhuKonversi = suhuAwal;
                    } else if (rbFahrenheit2.isChecked()) {
                        suhuKonversi = (suhuAwal * 1.8) + 32;
                    } else if (rbKelvin2.isChecked()) {
                        suhuKonversi = suhuAwal + 273.15;
                    }
                } else if (rbFahrenheit.isChecked()) {
                    if (rbCelcius2.isChecked()) {
                        suhuKonversi = (suhuAwal - 32) * 5/9.0;
                    } else if (rbFahrenheit2.isChecked()) {
                        suhuKonversi = suhuAwal;
                    } else if (rbKelvin2.isChecked()) {
                        suhuKonversi = (suhuAwal - 32) * 5/9.0 + 273.15;
                    }
                } else if (rbKelvin.isChecked()) {
                    if (rbCelcius2.isChecked()) {
                        suhuKonversi = suhuAwal - 273.15;
                    } else if (rbFahrenheit2.isChecked()) {
                        suhuKonversi = (suhuAwal - 273.15) * 1.8 + 32;
                    } else if (rbKelvin2.isChecked()) {
                        suhuKonversi = suhuAwal;
                    }
                }

                suhuKonversiTextView.setText(String.valueOf(suhuKonversi));
            }
        });
    }
    public void pindah1 (View view){
        Intent intent = new Intent(konversisuhu.this,MainActivity.class);
        startActivity(intent);
    }
    public void pindah2 (View view){
        Intent intent = new Intent(konversisuhu.this,bolabasket.class);
        startActivity(intent);
    }
    public void pindah3 (View view){
        Intent intent = new Intent(konversisuhu.this,kalkulator.class);
        startActivity(intent);
    }
    public void pindah4 (View view){
        Intent intent = new Intent(konversisuhu.this,datadiri.class);
        startActivity(intent);
    }
}