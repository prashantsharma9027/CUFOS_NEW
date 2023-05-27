package com.example.project;


import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.example.project.Domain.MainModel;
import com.example.project.databinding.ActivityMenuBinding;

import java.util.ArrayList;

public class CornerActivity extends AppCompatActivity {

    ActivityMenuBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMenuBinding.inflate((getLayoutInflater()));
        setContentView(binding.getRoot());

        ArrayList<MainModel> list = new ArrayList<>();

        list.add(new MainModel(R.drawable.c1 ,   "Veg Thali" , "50" , "+ ADD"));
        list.add(new MainModel(R.drawable.c2 ,   "Spcl. Veg Thali" , "100" , "+ ADD"));
        list.add(new MainModel(R.drawable.c3 ,   "chinease Thali" , "100" , "+ ADD"));
        list.add(new MainModel(R.drawable.c4 ,   "rajma Rice" , "60" , "+ ADD"));
        list.add(new MainModel(R.drawable.c5 ,   " Kadhi Rice" , "60" , "+ ADD"));
        list.add(new MainModel(R.drawable.c6 ,   "Manchurian Rice" , "60" , "+ ADD")) ;
        list.add(new MainModel(R.drawable.c7 ,   "Non Veg Thali" , "150" , "+ ADD"));
        list.add(new MainModel(R.drawable.c8 ,   "Paneer Rice" , "60" , "+ ADD"));


        MainAdapter adapter = new MainAdapter(list , this);
        binding.recylerview.setAdapter(adapter);


        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        binding.recylerview.setLayoutManager(layoutManager);


    }
}