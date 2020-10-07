package com.dts.projectdts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FormCatatan extends AppCompatActivity {

    EditText judul, jumlah;
    Button hapus, tambakan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_catatan);

        judul = findViewById(R.id.NamaAktivitas);
        jumlah = findViewById(R.id.Jumlah);

        hapus = findViewById(R.id.hapus);
        tambakan = findViewById(R.id.tambahkan);

        hapus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                judul.setText(null);
                jumlah.setText(null);
            }
        });

        tambakan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String a = judul.getText().toString().trim();
                String b = jumlah.getText().toString().trim();

                if (isAngka(b)){
                    String c =  a + "-" + b;
                    MainActivity.dataCatatan.add(c);

                    Toast.makeText(getApplicationContext(), c, Toast.LENGTH_SHORT).show();
                    judul.setText(null);
                    jumlah.setText(null);
                }else {
                    Toast.makeText(getApplicationContext(), "maaf jumlah tidak boleh huruf", Toast.LENGTH_SHORT).show();
                    jumlah.setText(null);
                }
            }
        });

        hapus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                judul.setText(null);
                jumlah.setText(null);
            }
        });
    }

    public boolean isAngka(String a){
        try {
            Double.parseDouble(a);

            return true;
        }catch (Exception e){
            return false;
        }
    }

}