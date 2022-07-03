package com.project.androidproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.button.MaterialButton;

public class nandiHills extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nandi_hills);

        MaterialButton nandiloc = (MaterialButton) findViewById(R.id.nandiloc);
        nandiloc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent loc1 = new Intent(nandiHills.this, MapsActivity.class);
                startActivity(loc1);
            }
        });
    }
}