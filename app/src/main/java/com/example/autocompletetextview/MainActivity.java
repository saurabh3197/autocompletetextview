package com.example.autocompletetextview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class MainActivity extends AppCompatActivity {
    AutoCompleteTextView actv;
    String name[]={"saurabh","aman","subham","anand","shristy","suman","arun"};
    ArrayAdapter<String> adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        actv=findViewById(R.id.auto);
        adapter=new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_list_item_1,name);
        actv.setAdapter(adapter);
        actv.setThreshold(1);
    }
}
