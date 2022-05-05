package com.assignment.problemstatement1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Index extends AppCompatActivity {
    ListView lvPSList;
    public static ArrayList<String> mylist = new ArrayList<String>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_problem_statemen1);
        lvPSList = findViewById(R.id.lvpList);
        mylist.add("Problem Statement 1");
        mylist.add("Problem Statement 2");
        mylist.add("Problem Statement 3");
        mylist.add("Problem Statement 4");
        mylist.add("Problem Statement 5");
        mylist.add("Problem Statement 6");
        mylist.add("Problem Statement 7");
        mylist.add("Problem Statement 8");
        mylist.add("Problem Statement 9");
        mylist.add("Problem Statement 10");

        ArrayAdapter<String> arr;
        arr = new ArrayAdapter<String>(
                this,
                androidx.constraintlayout.widget.R.layout.support_simple_spinner_dropdown_item,
                mylist);
        lvPSList.setAdapter(arr);

        lvPSList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                switch (position){
                    case 0 :
                        Intent intent0 = new Intent(Index.this,MainActivity.class);
                        startActivity(intent0);
                        break;
                    case 1 :
                        Intent intent1 = new Intent(Index.this,ProblemStatement2.class);
                        startActivity(intent1);
                        break;
                    case 2 :
                        Intent intent2 = new Intent(Index.this,ProblemStatement3.class);
                        startActivity(intent2);
                        break;
                    case 3 :
                        Intent intent3 = new Intent(Index.this,ProblemStatement4.class);
                        startActivity(intent3);
                        break;
                    case 4 :
                        Intent intent4 = new Intent(Index.this,ProblemStatement5.class);
                        startActivity(intent4);
                        break;
                    case 5 :
                        Intent intent5 = new Intent(Index.this,ProblemStatement6.class);
                        startActivity(intent5);
                        break;
                    case 6 :
                        Intent intent6 = new Intent(Index.this, ProblemStatement7.class);
                        startActivity(intent6);
                        break;
                    case 7 :
                        Intent intent7 = new Intent(Index.this,ProblemStatement8.class);
                        startActivity(intent7);
                        break;
                    case 8 :
                        Intent intent8 = new Intent(Index.this,ProblemStatement9.class);
                        startActivity(intent8);
                        break;
                    case 9 :
                        Intent intent9 = new Intent(Index.this, ProblemStatement10.class);
                        startActivity(intent9);
                        break;
                }
            }
        });
    }
}