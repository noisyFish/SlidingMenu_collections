package com.superyu.slidingmenu;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<String> mDatas = Arrays
            .asList("normal","drawerLayout","drawerLayout(covers actionBar)","drawerLayout(custom toolBar)");

    private ListView listView;
    private ListAdapter mAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView)findViewById(R.id.listView);
        mAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, mDatas);
        listView.setAdapter(mAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if(i==0){
                    Intent intent = new Intent(MainActivity.this,SlidingMenu01.class);
                    startActivity(intent);
                }else if(i==1){
                    Intent intent = new Intent(MainActivity.this,SlidingMenu02.class);
                    startActivity(intent);
                }
                else if(i==2){
                    Intent intent = new Intent(MainActivity.this,SlidingMenu03.class);
                    startActivity(intent);
                }else if(i==3){
                    Intent intent = new Intent(MainActivity.this,SlidingMenu04.class);
                    startActivity(intent);
                }
            }
        });
    }
}
