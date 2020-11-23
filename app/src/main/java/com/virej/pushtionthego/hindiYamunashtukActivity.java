package com.virej.pushtionthego;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class hindiYamunashtukActivity extends AppCompatActivity {

    Button hindiBackButon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hindi_yamunashtuk);

        hindiBackButon = findViewById(R.id.hindiBackButton);

        hindiBackButon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent hindiBackIntent = new Intent(hindiYamunashtukActivity.this, YamunashtukActivity.class);
                startActivity(hindiBackIntent);
            }
        });

    }
}