package com.example.project;


import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.example.project.Domain.MainModel;
import com.example.project.databinding.ActivityMenuBinding;

import java.util.ArrayList;

public class SamosaActivity extends AppCompatActivity {

    ActivityMenuBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMenuBinding.inflate((getLayoutInflater()));
        setContentView(binding.getRoot());

        ArrayList<MainModel> list = new ArrayList<>();

        list.add(new MainModel(R.drawable.s1, " mango Shake", "50", "+ ADD"));
        list.add(new MainModel(R.drawable.s2, "Banana Shake", "40", "+ ADD"));
        list.add(new MainModel(R.drawable.s3, "Oreo Shake", "50", "+ ADD"));
        list.add(new MainModel(R.drawable.s4, " Butter Skotch", "50", "+ ADD"));
        list.add(new MainModel(R.drawable.s5, "Mango lassi", "40", "+ ADD"));
        list.add(new MainModel(R.drawable.s7, "vanilla Shake", "50", "+ ADD"));
        list.add(new MainModel(R.drawable.s8, "Strawberry Shake", "60", "+ ADD"));
        list.add(new MainModel(R.drawable.s9, "Green Apple Mojito", "40", "+ ADD"));
        list.add(new MainModel(R.drawable.s10, " Virgin Mojito", "40", "+ ADD"));
        list.add(new MainModel(R.drawable.s11, "Cold Coffee", "40", "+ ADD"));
        list.add(new MainModel(R.drawable.s12, "Hot Coffee", "25", "+ ADD"));
        list.add(new MainModel(R.drawable.s6, "Chocolate Lassi", "30", "+ ADD"));


        MainAdapter adapter = new MainAdapter(list , this);
        binding.recylerview.setAdapter(adapter);


        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        binding.recylerview.setLayoutManager(layoutManager);


    }
}