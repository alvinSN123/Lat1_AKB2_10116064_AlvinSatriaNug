package com.example.projec1;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
/*
    Alvin Satria Nugaraha
    10116064
    IF-2
    Change Log Kamis 4 April 2019 16.30
    1.membuat tampilan awal

    change Log Jumat 5 April 2019 13.30
    2.membuat yang belum di buat

    Chage Log Sabtu 6 April 2019 13.00
    3.Membuat PutIntent Extra
 */

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button btn = (Button) findViewById(R.id.btn_mulai);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i1 = new Intent(MainActivity.this, layout2.class);
                startActivity(i1);
            }
        });


    }
}
