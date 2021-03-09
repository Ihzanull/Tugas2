package com.example.tugaz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

public class bio extends AppCompatActivity {
    Button back;
    Button toArtikelButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bio);

        back = findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toBack = new Intent(bio.this, MainActivity.class);
                startActivity(toBack);
            }
        });

        toArtikelButton = findViewById(R.id.articelButton);
        toArtikelButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toArtikel = new Intent(bio.this, artikel.class);
                startActivity(toArtikel);
            }
        });
    }
}