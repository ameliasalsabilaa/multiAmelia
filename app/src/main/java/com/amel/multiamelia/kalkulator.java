package com.amel.multiamelia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class kalkulator extends AppCompatActivity {

    private EditText nilaiAEditText, nilaiBEditText, hasilEditText;
    private RadioGroup leftRadioGroup, rightRadioGroup;
    private RadioButton tambahRadioButton, kurangRadioButton, kaliRadioButton, bagiRadioButton;
    private Button hitungButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalkulator);

        // Initialize views
        nilaiAEditText = findViewById(R.id.eta);
        nilaiBEditText = findViewById(R.id.etb);
        hasilEditText = findViewById(R.id.eth);

        leftRadioGroup = findViewById(R.id.LeftRG);
        rightRadioGroup = findViewById(R.id.RightRG);

        // Initialize RadioButtons with respect to the RadioGroups
        tambahRadioButton = findViewById(R.id.tambah);
        kurangRadioButton = findViewById(R.id.kurang);
        kaliRadioButton = findViewById(R.id.kali);
        bagiRadioButton = findViewById(R.id.bagi);

        // Set OnCheckedChangeListener for the left RadioGroup
        leftRadioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                // Clear the other RadioButton in the same RadioGroup
                if (checkedId == R.id.tambah) {
                    rightRadioGroup.clearCheck();
                }
                if (checkedId == R.id.kali) {
                    rightRadioGroup.clearCheck();
                }
            }
        });

        // Set OnCheckedChangeListener for the right RadioGroup
        rightRadioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                // Clear the other RadioButton in the same RadioGroup
                if (checkedId == R.id.kurang) {
                    leftRadioGroup.clearCheck();
                }
                if (checkedId == R.id.bagi) {
                    leftRadioGroup.clearCheck();
                }
            }
        });

        hitungButton = findViewById(R.id.bthasil);

        // Set OnClickListener for the button
        hitungButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hitungOperasi();
            }
        });
    }

    private void hitungOperasi() {
        // Get values from EditTexts
        String nilaiAString = nilaiAEditText.getText().toString();
        String nilaiBString = nilaiBEditText.getText().toString();

        // Check if any of the EditTexts is empty
        if (nilaiAString.isEmpty() || nilaiBString.isEmpty()) {
            Toast.makeText(this, "Please enter values for Nilai A and Nilai B", Toast.LENGTH_SHORT).show();
            return;
        }

        // Parse values to double
        double nilaiA = Double.parseDouble(nilaiAString);
        double nilaiB = Double.parseDouble(nilaiBString);

        // Perform calculation based on selected operation
        double hasil = 0;

        // Check which operation is selected
        if (tambahRadioButton.isChecked()) {
            hasil = nilaiA + nilaiB;
        } else if (kurangRadioButton.isChecked()) {
            hasil = nilaiA - nilaiB;
        } else if (kaliRadioButton.isChecked()) {
            hasil = nilaiA * nilaiB;
        } else if (bagiRadioButton.isChecked()) {
            if (nilaiB != 0) {
                hasil = nilaiA / nilaiB;
            } else {
                Toast.makeText(this, "Cannot divide by zero", Toast.LENGTH_SHORT).show();
                return;
            }
        }

        // Display the result
        hasilEditText.setText(String.valueOf(hasil));
    }
    public void pindah1 (View view){
        Intent intent = new Intent(kalkulator.this,MainActivity.class);
        startActivity(intent);
    }
    public void pindah2 (View view){
        Intent intent = new Intent(kalkulator.this,bolabasket.class);
        startActivity(intent);
    }
    public void pindah3 (View view){
        Intent intent = new Intent(kalkulator.this,konversisuhu.class);
        startActivity(intent);
    }
    public void pindah4 (View view){
        Intent intent = new Intent(kalkulator.this,datadiri.class);
        startActivity(intent);
    }
}