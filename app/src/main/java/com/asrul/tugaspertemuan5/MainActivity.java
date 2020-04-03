package com.asrul.tugaspertemuan5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    LinearLayout kenalBtn, cegahBtn, obatBtn, antisipasiBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        kenalBtn = findViewById(R.id.mengenal);
        cegahBtn = findViewById(R.id.mencegah);
        obatBtn = findViewById(R.id.mengobati);
        antisipasiBtn = findViewById(R.id.antisipasi);
        kenalBtn.setOnClickListener(this);
        cegahBtn.setOnClickListener(this);
        obatBtn.setOnClickListener(this);
        antisipasiBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.mengenal:
                Intent kenal = new Intent(this, MengenalActivity.class);
                startActivity(kenal);
                break;
            case R.id.mencegah:
                Intent cegah = new Intent(this, MencegahActivity.class);
                startActivity(cegah);
                break;
            case R.id.mengobati:
                Intent obat = new Intent(this, MengobatiActivity.class);
                startActivity(obat);
                break;
            case R.id.antisipasi:
                Intent antisipasi = new Intent(this, MengantisipasiActivity.class);
                startActivity(antisipasi);
                break;
        }
    }
}
