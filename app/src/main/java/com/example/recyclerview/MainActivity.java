package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView programinglist  = findViewById(R.id.programinglist);
        programinglist.setLayoutManager(new LinearLayoutManager(this));
        String [] language = {"java","javascript","paythan","1322","asghfsagfas","saashfq"};
        programinglist.setAdapter(new proAdapter());

    }
}
