package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView filterQues = findViewById(R.id.filter_ques);
        filterQues.setOnClickListener(View ->{
            Intent intent = new Intent(MainActivity.this, PopUPActivity.class);
            startActivity(intent);
        });
    }
}