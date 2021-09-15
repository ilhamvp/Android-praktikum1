package com.example.praktikum1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnPertama;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnPertama = findViewById(R.id.btnProfile);
        btnPertama.setOnClickListener(v -> {
            Intent pp = new Intent(MainActivity.this, MainActivity2.class);
            Bundle bd = new Bundle();
            bd.putString("Nama", "Gading Sectio");
            bd.putString("Email","gadingsectio45@gmail.com");
            bd.putInt("Age",19);
            pp.putExtra("Profile",bd);
            startActivity(pp);
        });
    }
}