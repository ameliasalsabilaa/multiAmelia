package com.amel.multiamelia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
Button basket;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void pindah1  (View view){
        Intent intent = new Intent(MainActivity.this,bolabasket.class);
        startActivity(intent);
    }
    public void pindah2 (View view){
        Intent intent = new Intent(MainActivity.this,konversisuhu.class);
        startActivity(intent);
    }
    public void pindah3 (View view){
        Intent intent = new Intent(MainActivity.this,kalkulator.class);
        startActivity(intent);
    }
    public void pindah4 (View view){
        Intent intent = new Intent(MainActivity.this,datadiri.class);
        startActivity(intent);
    }
}