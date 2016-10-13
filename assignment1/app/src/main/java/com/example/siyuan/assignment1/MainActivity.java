package com.example.siyuan.assignment1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import java.util.ArrayList;



public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Term");
        terms();

    }
    protected void terms(){
        ListView listView = (ListView)findViewById(android.R.id.list);
        ArrayList<String> list = new ArrayList<String>();
        list.add("Term 1");
        list.add("Term 2");
        list.add("Term 3");
        list.add("Term 4");
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, list);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String terms;
                switch (i){
                    case 0:
                        terms = "term1";
                        break;
                    case 1:
                        terms = "term2";
                        break;
                    case 2:
                        terms = "term3";
                        break;
                    case 3:
                        terms = "term4";
                        break;
                    default:
                        terms = null;
                        break;
                }
                Intent intent = new Intent(MainActivity.this, Course.class);
                intent.putExtra("TERMS", terms);
                MainActivity.this.startActivity(intent);
            }
        });
    }
}
