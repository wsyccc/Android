package com.example.siyuan.assignment1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class Course extends AppCompatActivity {

    private int term;
    private final String[][] list = {{"BUSA 2720","COMM 1116","COMP 1100","COMP 1111","COMP 1113","COMP 1510","COMP 1536"},
        {"COMM 2216","COMP 2121","COMP 2510","COMP 2526","COMP 2714","COMP 2721","COMP 2910"},
        {"COMP 3512","COMP 3711","COMP 3721","COMP 3760","COMP 3900","COMP 3717","COMP 3975"},
        {"BLAW 3600","COMP 4100","COMP 4735","COMP 4900","COMP 4560","COMP 4711","COMP 4976","COMP 4977"}};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course);
        setTitle("Course");
        course();
    }
    protected void course(){
        Intent intent = getIntent();
        String terms = intent.getStringExtra("TERMS");
        ListView listView = (ListView)findViewById(android.R.id.list);
        String[] courses;
        switch (terms){
            case "term1":
                courses = list[0];
                term = 0;
                break;
            case "term2":
                courses = list[1];
                term = 1;
                break;
            case "term3":
                courses = list[2];
                term = 2;
                break;
            case "term4":
                courses = list[3];
                term = 3;
                break;
            default:
                courses = null;
                break;
        }
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, courses);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(Course.this, Description.class);
                intent.putExtra("COURSE", list[term][i]);
                Course.this.startActivity(intent);
            }
        });
    }

}
