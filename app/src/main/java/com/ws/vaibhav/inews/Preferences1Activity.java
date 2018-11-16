package com.ws.vaibhav.inews;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.suke.widget.SwitchButton;

import java.util.ArrayList;
import java.util.List;

import adapter.Preferance_adapter;
import adapter.Preferance_adapter2;
import model.Preferance_model;
import model.Preferance_model2;

public class Preferences1Activity extends AppCompatActivity {

    Spinner spinner;
//Categories recycleview

    String[] tv1 = {"All News", "My Feed", "Top Stories"};
    Integer[] image1 = {R.drawable.ic_newspaper, R.drawable.ic_newspaper21, R.drawable.ic_internet};

//Favorites recycleview

    String[] tv2 = {"Sports", "Technology", "Entertainment"};
    Integer[] image2 = {R.drawable.ic_target, R.drawable.ic_brain, R.drawable.ic_film_roll};

    //Categories recycleview

    private RecyclerView recyclerView;
    private Preferance_adapter preferance_adapter;
    private ArrayList<Preferance_model> preferance_models;

//Favorites recycleview

    private RecyclerView recyclerView1;
    private Preferance_adapter2 preferance_adapter2;
    private ArrayList<Preferance_model2> preferance_model2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preferences1);


//spinnercode
        spinner = findViewById(R.id.spinner);

        List<String> list = new ArrayList<String>();
        list.add("English");
        list.add("Hindi");
        list.add("Tamil");
        list.add("Arbi");

        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(Preferences1Activity.this,
                R.layout.item_spinnergreen,
                R.id.spinner_text1, list);
        spinner.setAdapter(dataAdapter);

    //Categories recycleview

        recyclerView = findViewById(R.id.rc1);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(Preferences1Activity.this, LinearLayoutManager.HORIZONTAL, false);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        preferance_models = new ArrayList<>();

        for (int i = 0; i < tv1.length; i++) {
            Preferance_model ab = new Preferance_model(tv1[i], image1[i]);
            preferance_models.add(ab);
        }

        preferance_adapter = new Preferance_adapter(Preferences1Activity.this, preferance_models);
        recyclerView.setAdapter(preferance_adapter);

    //Favorites recycleview

        recyclerView1 = findViewById(R.id.rc2);
        RecyclerView.LayoutManager layoutManager1 = new LinearLayoutManager(Preferences1Activity.this, LinearLayoutManager.HORIZONTAL, false);
        recyclerView1.setLayoutManager(layoutManager1);
        recyclerView1.setItemAnimator(new DefaultItemAnimator());

        preferance_model2 = new ArrayList<>();

        for (int i = 0; i < tv2.length; i++) {
            Preferance_model2 abc = new Preferance_model2(tv2[i], image2[i]);
            preferance_model2.add(abc);
        }
        preferance_adapter2 = new Preferance_adapter2(Preferences1Activity.this, preferance_model2);
        recyclerView1.setAdapter(preferance_adapter2);
    }
}
