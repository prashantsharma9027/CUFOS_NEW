package com.example.project;


import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.example.project.Domain.MainModel;
import com.example.project.databinding.ActivityMenuBinding;

import java.util.ArrayList;

public class ParathaActivity extends AppCompatActivity {

    ActivityMenuBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMenuBinding.inflate((getLayoutInflater()));
        setContentView(binding.getRoot());

        ArrayList<MainModel> list = new ArrayList<>();

        list.add(new MainModel(R.drawable.paratha1,   "Aalu Paratha" , "20" , " + ADD"));
        list.add(new MainModel(R.drawable.pan ,   "paneer Paratha" , "20" , "+ ADD"));
        list.add(new MainModel(R.drawable.go ,   "Gobhi Paratha" , "20" , "+ ADD"));
        list.add(new MainModel(R.drawable.omle ,   "Egg omlette" , "40" , "+ ADD"));
        list.add(new MainModel(R.drawable.dahi ,   "Simple Paratha" , "20" , "+ ADD"));
        list.add(new MainModel(R.drawable.egg ,   "Egg Roll" , "40" , "+ ADD"));
        list.add(new MainModel(R.drawable.chick ,   "Chicken Roll" , "10" , "+ ADD"));
        list.add(new MainModel(R.drawable.bhurji ,   "egg bhurji" , "35" , "S+ ADD"));
        list.add(new MainModel(R.drawable.frie ,   "Fried Rice" , "50" , "+ ADD"));
        list.add(new MainModel(R.drawable.kesar ,   "Kesar Milk" , "30" , "+ ADD"));
        list.add(new MainModel(R.drawable.chai ,   "Tea" , "10" , "+ ADD"));


        MainAdapter adapter = new MainAdapter(list , this);
        binding.recylerview.setAdapter(adapter);


        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        binding.recylerview.setLayoutManager(layoutManager);


    }
}