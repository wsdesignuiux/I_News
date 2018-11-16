package com.ws.vaibhav.inews;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

import adapter.Preferance_adapter;
import adapter.Preferance_adapter2;
import adapter.Preference_light1_adapter;
import adapter.Preference_light2_adapter;
import model.Preferance_model;
import model.Preferance_model2;
import model.Preference_light1_model;
import model.Preferences_light2_model;


public class Preferences_Light_Mode1Activity extends AppCompatActivity {
    Spinner spinner;

    //Categories recycleview

    Integer[] image1 = {R.drawable.ic_newspaper, R.drawable.ic_newspaper21, R.drawable.ic_internet};
    String[] text1 = {"All News", "My Feed", "Top Stories"};

//Favorites recycleview

    Integer[] image2 = {R.drawable.ic_target, R.drawable.ic_brain, R.drawable.ic_film_roll};
    String[] tv2 = {"Sports", "Technology", "Entertainment"};

    //Categories recycleview

    private RecyclerView recyclerView;
    private Preference_light1_adapter preference_light1_adapter;
    private ArrayList<Preference_light1_model> preference_light1_models;

//Favorites recycleview

    private RecyclerView recyclerView1;
    private Preference_light2_adapter preference_light2_adapter;
    private ArrayList<Preferences_light2_model> preferences_light2_models;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preferences__light__mode1);

        spinner = findViewById(R.id.spinner);

        List<String> list = new ArrayList<String>();
        list.add("English");
        list.add("Hindi");
        list.add("Tamil");
        list.add("Arbi");

        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(Preferences_Light_Mode1Activity.this,
                R.layout.item_spinnergreen,
                R.id.spinner_text1, list);
        spinner.setAdapter(dataAdapter);

        //Categories recycleview

        recyclerView = findViewById(R.id.rc1);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(Preferences_Light_Mode1Activity.this, LinearLayoutManager.HORIZONTAL, false);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        preference_light1_models = new ArrayList<>();

        for (int i = 0; i < image1.length; i++) {
            Preference_light1_model ab = new Preference_light1_model(image1[i], text1[i]);
            preference_light1_models.add(ab);
        }

        preference_light1_adapter = new Preference_light1_adapter(Preferences_Light_Mode1Activity.this, preference_light1_models);
        recyclerView.setAdapter(preference_light1_adapter);

        //Favorites recycleview

        recyclerView1 = findViewById(R.id.rc2);
        RecyclerView.LayoutManager layoutManager1 = new LinearLayoutManager(Preferences_Light_Mode1Activity.this, LinearLayoutManager.HORIZONTAL, false);
        recyclerView1.setLayoutManager(layoutManager1);
        recyclerView1.setItemAnimator(new DefaultItemAnimator());

        preferences_light2_models = new ArrayList<>();

        for (int i = 0; i < image2.length; i++) {
            Preferences_light2_model abc = new Preferences_light2_model(image2[i], tv2[i]);
            preferences_light2_models.add(abc);
        }
        preference_light2_adapter = new Preference_light2_adapter(Preferences_Light_Mode1Activity.this, preferences_light2_models);
        recyclerView1.setAdapter(preference_light2_adapter);

    }
}