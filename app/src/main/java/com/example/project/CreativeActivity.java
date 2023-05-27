package com.example.project;


import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.example.project.Domain.MainModel;
import com.example.project.databinding.ActivityMenuBinding;

import java.util.ArrayList;

public class CreativeActivity extends AppCompatActivity {

    ActivityMenuBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMenuBinding.inflate((getLayoutInflater()));
        setContentView(binding.getRoot());

        ArrayList<MainModel> list = new ArrayList<>();

        list.add(new MainModel(R.drawable.cr1 ,   " Kadhai Chicken" , "150" , " + ADD"));
        list.add(new MainModel(R.drawable.cr2 ,   " Paneer butter masala " , "170" , "+ ADD"));
        list.add(new MainModel(R.drawable.cr3,   " Chicken Briyani" , "100" , "+ ADD"));
        list.add(new MainModel(R.drawable.cr4 ,   "Tandoori Chicken " , "140" , "+ ADD"));
        list.add(new MainModel(R.drawable.cr5 ,   "Seekh Kabab" , "90" , " + ADD "));
        list.add(new MainModel(R.drawable.cr6 ,   "chicken Tikka Masala" , "150" , "+ ADD"));
        list.add(new MainModel(R.drawable.cr7 ,   "Chicken Tikka" , "150" , "+ ADD"));
        list.add(new MainModel(R.drawable.cr8 ,   "Mutton Briyani" , "150" , "+ ADD"));
        list.add(new MainModel(R.drawable.cr9 ,   " Mutton Corma" , "300" , "+ ADD"));

        MainAdapter adapter = new MainAdapter(list , this);
        binding.recylerview.setAdapter(adapter);


        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        binding.recylerview.setLayoutManager(layoutManager);


    }
}