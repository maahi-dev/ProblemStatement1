package com.assignment.problemstatement1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ProblemStatement6 extends AppCompatActivity {
    EditText etName , etNumber;
    Button btnSubmit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_problem_statement6);
        getSupportActionBar().setTitle("Problem Statement 6");
        etNumber = findViewById(R.id.etStudentNumber);
        etName = findViewById(R.id.etStudentName);
        btnSubmit = findViewById(R.id.btnSubmit);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Go to Second Activity
                Intent intent = new Intent(ProblemStatement6.this, StudentPS6.class);
                intent.putExtra("number",etNumber.getText().toString());
                intent.putExtra("name",etName.getText().toString());
                startActivity(intent);
            }
        });
    }
}