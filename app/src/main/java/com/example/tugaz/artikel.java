package com.example.tugaz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class artikel extends AppCompatActivity {
    Button back;
    Button tobioBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artikel);

        // On Click Back Button
        back = findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toBack = new Intent(artikel.this, MainActivity.class);
                startActivity(toBack);
            }
        });

        // On Click Biodata Button
        tobioBtn = findViewById(R.id.bioButton);
        tobioBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toCv = new Intent(artikel.this, bio.class);
                startActivity(toCv);
            }
        });
    }
}