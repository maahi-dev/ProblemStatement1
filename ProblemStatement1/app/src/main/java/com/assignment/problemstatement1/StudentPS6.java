package com.assignment.problemstatement1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class StudentPS6 extends AppCompatActivity {
    TextView tvSNumber , tvSName;
    private Object Intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_ps6);
        getSupportActionBar().setTitle("Student Detail");

        tvSNumber = findViewById(R.id.txtView);
        tvSName = findViewById(R.id.txtView2);

        android.content.Intent intent = getIntent();
        tvSNumber.setText(intent.getStringExtra("number"));
        tvSName.setText(intent.getStringExtra("name"));
    }
}