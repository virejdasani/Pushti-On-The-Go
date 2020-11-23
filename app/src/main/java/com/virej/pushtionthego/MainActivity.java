package com.virej.pushtionthego;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    // Initialise buttons
    Button yamunashtukButton;
    Button haveliButton;
    Button calendarButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Assign views to buttons
        yamunashtukButton = findViewById(R.id.yamunashtukButton);
        haveliButton = findViewById(R.id.haveliButton);
        calendarButton = findViewById(R.id.calendarButton);

        // Yamunashtuk Intent
        yamunashtukButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent yamunashtukIntent = new Intent(MainActivity.this, YamunashtukActivity.class);
                startActivity(yamunashtukIntent);
            }
        });

        // Haveli Intent
        yamunashtukButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent yamunashtukIntent = new Intent(MainActivity.this, YamunashtukActivity.class);
                startActivity(yamunashtukIntent);
            }
        });

        // Calendar Intent
        yamunashtukButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent yamunashtukIntent = new Intent(MainActivity.this, YamunashtukActivity.class);
                startActivity(yamunashtukIntent);
            }
        });

    }
}