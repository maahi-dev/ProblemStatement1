package com.assignment.problemstatement1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class ProblemStatement4 extends AppCompatActivity {

    RadioGroup rg;
    RadioButton rb;
    EditText etSome;
    TextView tvAns;
    Button btnConvert;
    Integer next,result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_problem_statement4);
        getSupportActionBar().setTitle("Problem Statement 4");
        etSome = findViewById(R.id.etConInput);
        tvAns = findViewById(R.id.tvAns);
        rg = findViewById(R.id.radioGroup);
        btnConvert = findViewById(R.id.btnConvert);

        btnConvert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int selectId = rg.getCheckedRadioButtonId();
                rb = findViewById(selectId);
                if(rb.getId()==R.id.rbKmToM){
                    next = Integer.parseInt(etSome.getText().toString());
                    result = next*1000;
                    tvAns.setText(result.toString());
                }
                else if(rb.getId()==R.id.rbMtoCm){
                    next = Integer.parseInt(etSome.getText().toString());
                    result = next*100;
                    tvAns.setText(result.toString());
                }
                else if(rb.getId()==R.id.rbCmToMm){
                    next = Integer.parseInt(etSome.getText().toString());
                    result = next*10;
                    tvAns.setText(result.toString());
                }
                else{
                    Toast.makeText(getApplicationContext(),"Please Make a choice",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}