package com.virej.pushtionthego;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class englishYamunashtukActivity extends AppCompatActivity {

    Button englishBackButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_english_yamunashtuk);

        englishBackButton = findViewById(R.id.englishBackButton);

        englishBackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent englishBackIntent = new Intent(englishYamunashtukActivity.this, YamunashtukActivity.class);
                startActivity(englishBackIntent);
            }
        });

    }
}