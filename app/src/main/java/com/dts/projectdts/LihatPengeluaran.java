package com.dts.projectdts;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class LihatPengeluaran extends AppCompatActivity {

    private ListView listView;
    private ArrayAdapter<String> stringArrayAdapter;
    Button hapus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lihat_pengeluaran);

        listView = findViewById(R.id.list_item);
        hapus = findViewById(R.id.hapusCatatan);
        this.stringArrayAdapter = new ArrayAdapter<>(this, R.layout.list_view,MainActivity.dataCatatan);
        listView.setAdapter(this.stringArrayAdapter);

        hapus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity.dataCatatan.clear();
                startActivity(new Intent(LihatPengeluaran.this, LihatPengeluaran.class));
                finish();
            }
        });
    }
}