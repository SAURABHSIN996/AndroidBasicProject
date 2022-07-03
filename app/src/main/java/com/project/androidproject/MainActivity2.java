package com.project.androidproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.button.MaterialButton;

public class MainActivity2 extends AppCompatActivity {

    private void startMyActivity(Intent intent) {
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        MaterialButton nandibtn = (MaterialButton) findViewById(R.id.nandibtn);
        MaterialButton chikmangalurbtn = (MaterialButton) findViewById(R.id.chikmangalurbtn);
        MaterialButton hampibtn = (MaterialButton) findViewById(R.id.hampibtn);
        MaterialButton coorgbtn = (MaterialButton) findViewById(R.id.coorgbtn);
        MaterialButton mangalorebtn = (MaterialButton) findViewById(R.id.mangalorebtn);
        MaterialButton jogFallsbtn = (MaterialButton) findViewById(R.id.jogFallsbtn);
        MaterialButton udupibtn = (MaterialButton) findViewById(R.id.udupibtn);
        MaterialButton gokarnabtn = (MaterialButton) findViewById(R.id.gokarnabtn);


        nandibtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int1 = new Intent(MainActivity2.this, nandiHills.class);
                startActivity(int1);
            }
        });

        chikmangalurbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int2 = new Intent(MainActivity2.this, chikmangalur.class);
                startActivity(int2);
            }
        });
        
        hampibtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int3 = new Intent(MainActivity2.this, hampi.class);
                startActivity(int3);
            }
        });

        coorgbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int4 = new Intent(MainActivity2.this, coorg.class);
                startActivity(int4);
            }
        });

        mangalorebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int5 = new Intent(MainActivity2.this, mangalore.class);
                startActivity(int5);            }
        });

        jogFallsbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int6 = new Intent(MainActivity2.this, jogFalls.class);
                startActivity(int6);            }
        });

        udupibtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int7 = new Intent(MainActivity2.this, udupi.class);
                startActivity(int7);            }
        });

        gokarnabtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int8 = new Intent(MainActivity2.this, gokarna.class);
                startActivity(int8);            }
        });
    }
}