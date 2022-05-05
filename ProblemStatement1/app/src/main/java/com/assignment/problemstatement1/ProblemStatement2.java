package com.assignment.problemstatement1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ProblemStatement2 extends AppCompatActivity {
    TextView textView;
    Button btnSmall , btnMedium, btnLarge;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_problem_statement2);
        getSupportActionBar().setTitle("Problem Statement 2");
        textView = findViewById(R.id.txtSize);
        btnSmall = findViewById(R.id.btnSmall);
        btnMedium = findViewById(R.id.btnMedium);
        btnLarge = findViewById(R.id.btnLarge);

        btnSmall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setTextSize(10.0F);
            }
        });

        btnMedium.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setTextSize(20.0F);
            }
        });

        btnLarge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 textView.setTextSize(30.0F);
            }
        });
    }
}