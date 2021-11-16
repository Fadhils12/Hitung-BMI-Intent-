package com.example.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //private Button berpindahOnly;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //berpindahOnly = (Button) findViewById(R.id.btn_only_berpindah);

        //btnOnlyBerpindah.setOnClickListener(new View.OnClickListener() {
        //            @Override
        //            public void onClick(View v) {
        //
        //                Intent intent = new Intent(MainActivity.this, FirstIntentActivity.class)
        //
        //                  startActivity(intent);
        //            }
        //        });


        Button btnOnlyBerpindah = findViewById(R.id.btn_only_berpindah);

        ImageButton btnShare = findViewById(R.id.btn_for_share);


        btnOnlyBerpindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(MainActivity.this, FirstIntentActivity.class));

            }
        });

        btnShare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Intent.ACTION_SEND);

                startActivity(Intent.createChooser(intent, "Share to:"));

            }
        });
    }

    @SuppressLint("NonConstantResourceId")
    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        final EditText etUsername = (EditText) findViewById(R.id.et_username);
        final EditText etTugas = (EditText) findViewById(R.id.et_tugas);
        TextView tvTugas = findViewById(R.id.tv_2);
        TextView tvUsername = findViewById(R.id.tv_1);


        Bundle bundle = new Bundle();

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.rb_intent:
                if (checked)
                    bundle.putString("username", etUsername.getText().toString());
                bundle.putString("tugas", etTugas.getText().toString());

                tvUsername.setText(bundle.getString("username"));
                tvTugas.setText(bundle.getString("tugas"));

                break;
            case R.id.rb_bunding:
                if (checked)
                    tvTugas.setText(etTugas.getText().toString());
                tvUsername.setText(etUsername.getText().toString());
                break;
        }
    }
}