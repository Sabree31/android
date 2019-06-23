package com.example.myapplicationkjgfsdgfde;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Three_One extends AppCompatActivity {

    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three__one);

        listView=findViewById(R.id.ListViewId);

        String[] AdNames=getResources().getStringArray(R.array.Administration_names);

        ArrayAdapter adapter=new ArrayAdapter(this,R.layout.administration_view,R.id.textView2Id,AdNames);

        listView.setAdapter(adapter);
    }
}
