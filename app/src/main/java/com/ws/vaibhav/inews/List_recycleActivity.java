package com.ws.vaibhav.inews;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

import adapter.List_recycle_adapter;
import model.List_recycle_model;

public class List_recycleActivity extends AppCompatActivity {

    String text_list[] = {"1.Preferences","2.Preferences-Light-Mode",
            "3.News-Detail-Page","4.News-Detail-Page-LightMode","5.News_feed2","6.white News_feed2"};

    RecyclerView recyclerView;
    List_recycle_adapter list_recycle_adapter;
    ArrayList<List_recycle_model> list_recycle_models;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_recycle);

        recyclerView= findViewById(R.id.list_recycle);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(List_recycleActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        list_recycle_models = new ArrayList<>();

        for (int i=0;i < text_list.length;i++) {
            List_recycle_model ab = new List_recycle_model(text_list[i]);
            list_recycle_models.add(ab);
        }

        list_recycle_adapter = new List_recycle_adapter(List_recycleActivity.this,list_recycle_models);
        recyclerView.setAdapter(list_recycle_adapter);
    }
}
