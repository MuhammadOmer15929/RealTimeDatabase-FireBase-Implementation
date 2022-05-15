package com.example.projectdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {
    ImageView tx1;
    TextView tx2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Objects.requireNonNull(getSupportActionBar()).hide();
        setContentView(R.layout.activity_main);
        tx1= findViewById(R.id.icon);
        tx2= findViewById(R.id.textView);
        tx1.setVisibility(View.VISIBLE);
        tx2.setVisibility(View.VISIBLE);
        new Handler().postDelayed(() -> {
            Intent intent =new Intent(MainActivity.this,IntroActivity.class);
            startActivity(intent);
            onBackPressed();
        },3000);
    }
}