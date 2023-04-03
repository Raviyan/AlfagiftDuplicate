package com.example.alfagift;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Ramadhan extends AppCompatActivity {

    public ImageView pindah1,pindah2,pindah3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ramadhan);
        pindah1 = findViewById(R.id.imageView63);
        pindah2 = findViewById(R.id.imageView47);
        pindah3 = findViewById(R.id.imageView72);

        pindah1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent itn = new Intent(getApplicationContext(),Beranda.class);
                startActivity(itn);
            }
        });
        pindah2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent itn = new Intent(getApplicationContext(),Mie1.class);
                startActivity(itn);
            }
        });
        pindah3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent itn = new Intent(getApplicationContext(),Mie2.class);
                startActivity(itn);
            }
        });
    }
}