package com.assignment.problemstatement1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ProblemStatement3 extends AppCompatActivity {
    EditText etNumber;
    TextView tvanswer;
    Integer number1 , number2 , result, flag;
    Button btnAdd, btnSub, btnMul, btndiv , btnAnswer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_problem_statement3);
        getSupportActionBar().setTitle("Problem Statement 3");
        etNumber = findViewById(R.id.edNumber);
        tvanswer = findViewById(R.id.textAnswer);
        btnAdd = findViewById(R.id.btnAdd);
        btnSub = findViewById(R.id.btnSub);
        btnMul = findViewById(R.id.btnMul);
        btndiv = findViewById(R.id.btnDiv);
        btnAnswer = findViewById(R.id.btnAnswer);


        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number1 = Integer.parseInt(etNumber.getText().toString());
                etNumber.setText("");
                flag = 1;

            }
        });

        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number1 = Integer.parseInt(etNumber.getText().toString());
                etNumber.setText("");
                flag = 2;
            }
        });

        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number1 = Integer.parseInt(etNumber.getText().toString());
                etNumber.setText("");
                flag = 3;
            }
        });

        btndiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number1 = Integer.parseInt(etNumber.getText().toString());
                etNumber.setText("");
                flag = 4;
            }
        });

        btnAnswer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number2 = Integer.parseInt(etNumber.getText().toString());
                if (flag == 1) {
                    result = number1 + number2;
                } else if (flag == 2){
                    result = number1 - number2;
                } else if(flag == 3){
                    result = number1 * number2;
                } else if(flag == 4){
                    result = number1 / number2;
                }

                etNumber.setText("");
                tvanswer.setText(result.toString());
            }
        });
    }
}