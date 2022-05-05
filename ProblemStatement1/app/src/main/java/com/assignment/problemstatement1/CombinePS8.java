package com.assignment.problemstatement1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class CombinePS8 extends AppCompatActivity {
    TextView tvCombineName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_combine_ps8);
        getSupportActionBar().setTitle("Combine Name");
        tvCombineName = findViewById(R.id.tvCombineName);
        Intent intent = getIntent();
        tvCombineName.setText(intent.getStringExtra("fname")+" "+intent.getStringExtra("lname"));
    }
}