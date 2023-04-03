package com.example.alfagift;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Profil extends AppCompatActivity {
    public ImageView pindah1,pindah2,pindah3,pindah4,pindah5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profil);
        pindah1 = findViewById(R.id.imageView32);
        pindah2 = findViewById(R.id.imageView38);
        pindah3 = findViewById(R.id.imageView39);
        pindah4 = findViewById(R.id.imageView46);
        pindah5 = findViewById(R.id.imageView47);

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
                Intent itn = new Intent(getApplicationContext(),Aqua.class);
                startActivity(itn);
            }
        });
        pindah5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent itn = new Intent(getApplicationContext(),Ultra.class);
                startActivity(itn);
            }
        });
    }
}