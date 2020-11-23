package com.virej.pushtionthego;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class gujratiYamunashtukActivity extends AppCompatActivity {

    Button gujratiBackButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gujrati_yamunashtuk);

        gujratiBackButton = findViewById(R.id.gujratiBackButton);

        gujratiBackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gujratiBackIntent = new Intent(gujratiYamunashtukActivity.this, YamunashtukActivity.class);
                startActivity(gujratiBackIntent);
            }
        });

    }
}