package com.example.tugaz;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button artikelButton;
    Button bioBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        artikelButton = findViewById(R.id.articelButton);
        artikelButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toArtikel = new Intent(MainActivity.this, artikel.class);
                startActivity(toArtikel);
            }
        });

        bioBtn = findViewById(R.id.bioButton);
        bioBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tobio = new Intent(MainActivity.this, bio.class);
                startActivity(tobio);
            }
        });
    }

}