package com.example.project;


import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.example.project.Domain.MainModel;
import com.example.project.databinding.ActivityMenuBinding;

import java.util.ArrayList;

public class FrActivity extends AppCompatActivity {

    ActivityMenuBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMenuBinding.inflate((getLayoutInflater()));
        setContentView(binding.getRoot());

        ArrayList<MainModel> list = new ArrayList<>();

        list.add(new MainModel(R.drawable.frr1,   "peri peri pizza" , "200" , "+ ADD"));
        list.add(new MainModel(R.drawable.fr2 ,   "Margherita " , "170" , "+ ADD"));
        list.add(new MainModel(R.drawable.fr3 ,   "Stuffed Garlic Bread" , "100" , "+ ADD"));
        list.add(new MainModel(R.drawable.fr4 ,   "Mexican pasta" , "120" , "+ ADD"));
        list.add(new MainModel(R.drawable.fr5 ,   "Choco Lava Cake" , "50" , "+ ADD"));
        list.add(new MainModel(R.drawable.fr6 ,   "Brownie" , "70" , "+ ADD"));
        list.add(new MainModel(R.drawable.fr7 ,   "Peri Peri fries" , "40" , "+ ADD"));
        list.add(new MainModel(R.drawable.fr8 ,   "Cheese fries" , "50" , "+ ADD"));
        list.add(new MainModel(R.drawable.fr9 ,   "Chicken Nugget" , "100" , "+ ADD"));
        list.add(new MainModel(R.drawable.fr10 ,   "Loaded nachos" , "70" , "+ ADD"));


        MainAdapter adapter = new MainAdapter(list , this);
        binding.recylerview.setAdapter(adapter);


        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        binding.recylerview.setLayoutManager(layoutManager);


    }
}