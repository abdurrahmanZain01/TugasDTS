package com.dts.projectdts;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    Button catatanSaya, form;
    RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;

    public static ArrayList<String> dataCatatan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        catatanSaya = (Button) findViewById(R.id.MyNote);
        form = (Button) findViewById(R.id.TambahNote);
        recyclerView = findViewById(R.id.recycle);

//        catatanSaya.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                loadFragmen(new Catatan_saya());
//            }
//        });

        form.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, FormCatatan.class));
            }
        });

        catatanSaya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, LihatPengeluaran.class));
            }
        });

        if (dataCatatan==null){
            dataCatatan = new ArrayList<>();
            dataCatatan.add(" ");

        }

    }


}