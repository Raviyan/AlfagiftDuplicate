package com.example.alfagift;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;


public class Beranda extends AppCompatActivity {
    public ImageView pindah1,pindah2,pindah3,pindah4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beranda);

         pindah1 = findViewById(R.id.imageView33);
         pindah2 = findViewById(R.id.imageView38);
         pindah3 = findViewById(R.id.imageView39);
         pindah4 = findViewById(R.id.imageView16);
         //Ini Beranda

         pindah1.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 Intent itn = new Intent(getApplicationContext(),Profil.class);
                 startActivity(itn);
             }
         });
        pindah2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent itn = new Intent(getApplicationContext(),Promo.class);
                startActivity(itn);
            }
        });
        pindah3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent itn = new Intent(getApplicationContext(),Akun.class);
                startActivity(itn);
            }
        });
        pindah4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent itn = new Intent(getApplicationContext(),Ramadhan.class);
                startActivity(itn);
            }
        });
    }
}