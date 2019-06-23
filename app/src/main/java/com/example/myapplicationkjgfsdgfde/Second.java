package com.example.myapplicationkjgfsdgfde;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Second extends AppCompatActivity {


    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        listView=findViewById(R.id.ListViewId);

        String[] itemNames=getResources().getStringArray(R.array.item_names);

        ArrayAdapter adapter=new ArrayAdapter(this,R.layout.sampleview,R.id.textViewId,itemNames);

        listView.setAdapter(adapter);
    }
}
