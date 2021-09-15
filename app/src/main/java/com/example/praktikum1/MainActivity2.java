package com.example.praktikum1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView ff = (TextView) findViewById(R.id.buka_profile);
        Bundle bundle = getIntent().getBundleExtra("Profile");
        String name = bundle.getString("Nama");
        String email = bundle.getString("Email");
        int age = bundle.getInt("Age");

        String text = "Nama : " + name + "\n" + "Email : " + email + "\n" + " Age : "
                + age ;
        ff.setText(text);
    }
}