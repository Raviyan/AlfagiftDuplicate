package com.example.alfagift;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Mie2 extends AppCompatActivity {
    public ImageView pindah1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mie2);
        pindah1 = findViewById(R.id.imageView82);

        pindah1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent itn = new Intent(getApplicationContext(),Beranda.class);
                startActivity(itn);
            }
        });
    }
}