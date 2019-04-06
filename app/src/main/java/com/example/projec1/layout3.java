package com.example.projec1;

import android.app.AppComponentFactory;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class layout3 extends layout2 {

    private EditText nama,umur;
    private Button btn_next;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layoutketiga);

        nama = (EditText) findViewById(R.id.editText2);
        umur = (EditText) findViewById(R.id.editText3);
        btn_next = (Button) findViewById(R.id.btn_selanjutnya);

        btn_next.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_selanjutnya :
                Intent intent = new Intent(layout3.this,layout4.class);
                String tvNama = nama.getText().toString();
                String tvUmur = umur.getText().toString();
                intent.putExtra("nama",tvNama);
                intent.putExtra("umur",tvUmur);
                startActivity(intent);

        }

    }
}