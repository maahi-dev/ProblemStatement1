package com.assignment.problemstatement1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class ProblemStatement5 extends AppCompatActivity {
    TextView textName, textAmount;
    Button btnShow;
    CheckBox chkPizza , chkBurger, chkCofee, chkTacoo;
    Integer value = 0;
    String name="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_problem_statement5);
        getSupportActionBar().setTitle("Problem Statement 5");
        textName = findViewById(R.id.txtName);
        textAmount = findViewById(R.id.txtAmount);
        btnShow = findViewById(R.id.btnShow);
        chkPizza = findViewById(R.id.chkPizza);
        chkBurger = findViewById(R.id.chkBurger);
        chkCofee = findViewById(R.id.chkCoffee);
        chkTacoo = findViewById(R.id.chkTacoo);

        btnShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                value = 0;
                name = "";
                if (chkPizza.isChecked()){
                    value += 520;
                    name += "Pizza";
                }
                if(chkBurger.isChecked()){
                    value += 250;
                    name += "\nBurger";
                }
                if (chkCofee.isChecked()){
                    value += 300;
                    name += "\nCofee";
                }
                if (chkTacoo.isChecked()){
                    value += 350;
                    name += "\nTacoo";
                }
                textName.setText(name);
                textAmount.setText(value.toString());

            }
        });

    }
}