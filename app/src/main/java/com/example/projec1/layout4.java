package com.example.projec1;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class layout4 extends layout3 {

    TextView tvfinish, tvnama, tvumur;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layoutkeempat);

        tvfinish = (TextView) findViewById(R.id.text_finish);
        tvnama = (TextView) findViewById(R.id.nama_finish);
        tvumur = (TextView) findViewById(R.id.umur_finish);


        tvnama.setText("Nama = " + getIntent().getStringExtra("nama"));
        tvfinish.setText("Beres!Sekarang " + getIntent().getStringExtra("nama") + "\nudah bisa ngecek\npengguna HP " + getIntent().getStringExtra("nama") + "\ntapi hari buat bantu kamu\nngulur waktu ");
        tvumur.setText("Umur = "+getIntent().getStringExtra("umur")+" Tahun");

    }
}
