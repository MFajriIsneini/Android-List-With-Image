package com.swi.androidlist1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<Item> itemArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getData();// <<<< insert menu
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.rvMiniatm);
        ItemAdapter itemAdapter = new ItemAdapter(itemArrayList);

        RecyclerView.LayoutManager layoutManager= new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(itemAdapter);
    }

    public void getData(){
        itemArrayList =new ArrayList<>();
        for (int i=1; i <=30; i++) {
//            itemArrayList.add(new Item(R.drawable.smartphone ,"Data Data Data " + i, true, this));
            if (i <= 10) {
                itemArrayList.add(new Item(R.drawable.smartphone ,"Data Data Data " + i, true, this));
            } else if (i > 10 && i<=20) {
                itemArrayList.add(new Item(R.drawable.smartphone ,"Data Data " + i, true, this));
            } else {
                itemArrayList.add(new Item("Data Data Data Data " + i, true, this));
            }
        }
    }
}