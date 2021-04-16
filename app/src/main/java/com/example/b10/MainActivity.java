package com.example.b10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity {
    private Button profile;
    private Button about;
    public void button(View view) {
        FirebaseAuth.getInstance().signOut();
        startActivity(new Intent(getApplicationContext(),LOGIN.class));
        finish();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        profile = findViewById(R.id.profile);
        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent categoryIntent = new Intent(MainActivity.this,PROFILE.class);
                startActivity(categoryIntent);
                finish();
            }
        });
         about = findViewById(R.id.about);
         about.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Intent categoryIntent = new Intent(MainActivity.this,ABOUT.class);
                 startActivity(categoryIntent);
                 finish();
             }

         });


    }
}