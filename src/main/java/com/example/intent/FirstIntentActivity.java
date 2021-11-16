package com.example.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.intent.Model.Model;

public class FirstIntentActivity extends AppCompatActivity {

    Model hitung = new Model();

    TextView status;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_intent);

        EditText beratBadan = findViewById(R.id.et_berat_badan);

        EditText tinggiBadan = findViewById(R.id.et_tinggi_badan);

        Button btnHitung = findViewById(R.id.btn_hitung_bmi);

        TextView status = findViewById(R.id.tv_statu);


        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String etBeratBadan = beratBadan.getText().toString() ;
                String etTinggiBadan = tinggiBadan.getText().toString();

                double beratBadan = Double.parseDouble(etBeratBadan);
                double tinggiBadan = Double.parseDouble(etTinggiBadan);

                String statusBadan = hitung.hitung(beratBadan, tinggiBadan);
                status.setText(statusBadan);

            }
        });
    }
}