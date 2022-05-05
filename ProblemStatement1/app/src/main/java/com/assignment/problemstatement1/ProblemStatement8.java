package com.assignment.problemstatement1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ProblemStatement8 extends AppCompatActivity {
    Button btnNext;
    EditText etFName, etLName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_problem_statement8);
        getSupportActionBar().setTitle("Problem Statement 8");
        btnNext = findViewById(R.id.btnNext);
        etFName = findViewById(R.id.etFName);
        etLName = findViewById(R.id.etLName);

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ProblemStatement8.this,CombinePS8.class);
                intent.putExtra("fname",etFName.getText().toString());
                intent.putExtra("lname",etLName.getText().toString());
                startActivity(intent);
            }
        });
    }
}