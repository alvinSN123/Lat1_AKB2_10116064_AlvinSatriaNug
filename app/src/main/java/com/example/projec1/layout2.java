package com.example.projec1;

import android.app.AppComponentFactory;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class layout2 extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layoutkedua);

        Button btn = (Button) findViewById(R.id.btn_masuk);

        btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId())
        {
            case R.id.btn_masuk :
                Intent intent = new Intent(layout2.this,layout3.class);
                startActivity(intent);
        }
    }
}