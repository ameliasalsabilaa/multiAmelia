package com.amel.multiamelia;

import androidx.appcompat.app.AppCompatActivity;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.Button;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class datadiri extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datadiri);
    }

    public void pindah1 (View view){
        Intent intent = new Intent(datadiri.this,MainActivity.class);
        startActivity(intent);
    }
    public void pindah2 (View view){
        Intent intent = new Intent(datadiri.this,bolabasket.class);
        startActivity(intent);
    }
    public void pindah3 (View view){
        Intent intent = new Intent(datadiri.this,konversisuhu.class);
        startActivity(intent);
    }
    public void pindah4 (View view){
        Intent intent = new Intent(datadiri.this,kalkulator.class);
        startActivity(intent);
    }

}