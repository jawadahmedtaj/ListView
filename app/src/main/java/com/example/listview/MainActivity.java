package com.example.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

import static java.util.Arrays.asList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView myListView = (ListView) findViewById(R.id.myListView);
        final ArrayList<String> myFamily = new ArrayList<String>(asList("Jawad","Cindy","Uzma","Ayesha"));

       /* myFamily.add("Jawad");
        myFamily.add("Cindy");
        myFamily.add("Uzma");
        myFamily.add("Ayesha");
        myFamily.add("Jawad");
        myFamily.add("Cindy");
        myFamily.add("Uzma");
        myFamily.add("Ayesha");*/


        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, myFamily);
        myListView.setAdapter(arrayAdapter);
        myListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            System.out.println(myFamily.get(position));
                Toast.makeText(MainActivity.this, "Hello! " + myFamily.get(position), Toast.LENGTH_SHORT).show();
            }
        });

    }
}
