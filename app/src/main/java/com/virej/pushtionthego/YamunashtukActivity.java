package com.virej.pushtionthego;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class YamunashtukActivity extends AppCompatActivity {

    // Initialise Buttons
    Button englishButton;
    Button gujratiButton;
    Button hindiButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yamunashtuk);

        englishButton = findViewById(R.id.englishButton);
        gujratiButton = findViewById(R.id.gujratiButton);
        hindiButton = findViewById(R.id.hindiButton);

        englishButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent englishIntent = new Intent(YamunashtukActivity.this, englishYamunashtukActivity.class);
                startActivity(englishIntent);
            }
        });

        gujratiButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gujratiIntent = new Intent(YamunashtukActivity.this, gujratiYamunashtukActivity.class);
                startActivity(gujratiIntent);
            }
        });

        hindiButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent hindiIntent = new Intent(YamunashtukActivity.this, hindiYamunashtukActivity.class);
                startActivity(hindiIntent);
            }
        });
    }
}








