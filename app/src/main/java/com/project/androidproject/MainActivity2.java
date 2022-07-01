package com.project.androidproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.button.MaterialButton;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        MaterialButton nandibtn = (MaterialButton) findViewById(R.id.nandibtn);
        nandibtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity2.this,nandiHills.class));
            }
        });

        MaterialButton chikmangalurbtn = (MaterialButton) findViewById(R.id.chikmangalurbtn);
        nandibtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity2.this,chikmangalur.class));
            }
        });

        MaterialButton hampibtn = (MaterialButton) findViewById(R.id.hampibtn);
        nandibtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity2.this,hampi.class));
            }
        });

        MaterialButton coorgbtn = (MaterialButton) findViewById(R.id.coorgbtn);
        nandibtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity2.this,coorg.class));
            }
        });

        MaterialButton mangalorebtn = (MaterialButton) findViewById(R.id.mangalorebtn);
        nandibtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity2.this,mangalore.class));
            }
        });

        MaterialButton jogFallsbtn = (MaterialButton) findViewById(R.id.jogFallsbtn);
        nandibtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity2.this,jogFalls.class));
            }
        });

        MaterialButton udupibtn = (MaterialButton) findViewById(R.id.udupibtn);
        nandibtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity2.this,udupi.class));
            }
        });

        MaterialButton gokarnabtn = (MaterialButton) findViewById(R.id.gokarnabtn);
        nandibtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity2.this,gokarna.class));
            }
        });
    }
}