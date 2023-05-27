package com.example.project;


import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.example.project.Domain.MainModel;
import com.example.project.databinding.ActivityMenuBinding;

import java.util.ArrayList;

public class PunjabiActivity extends AppCompatActivity {

    ActivityMenuBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMenuBinding.inflate((getLayoutInflater()));
        setContentView(binding.getRoot());

        ArrayList<MainModel> list = new ArrayList<>();

        list.add(new MainModel(R.drawable.choo , "Chocolate " , "50" , "+ ADD"));
        list.add(new MainModel(R.drawable.b , "Butter Scotch" , "50" , "+ ADD"));
        list.add(new MainModel(R.drawable.frr1, "Frozen Desert " , "90" , "+ ADD"));
        list.add(new MainModel(R.drawable.saa ,   "Sacch Mucch Aam" , "60" , "+ ADD"));
        list.add(new MainModel(R.drawable.bl ,   "Black Current " , "100" , "+ ADD"));
        list.add(new MainModel(R.drawable.cake , "cake" , "200" , "+ ADD"));
        list.add(new MainModel(R.drawable.pastry ,     "Pastry" ,  "30" , "+ ADD"));
        list.add(new MainModel(R.drawable.pizzapic , "pizza" , "300" , "+ ADD"));
        list.add(new MainModel(R.drawable.noodle ,   "noodle" , "100" , "+ ADD"));
        list.add(new MainModel(R.drawable.momo ,     "momos" ,  "60" , "+ ADD"));
        list.add(new MainModel(R.drawable.sandwitch , "sandwich" , "60" , "+ ADD"));
        list.add(new MainModel(R.drawable.springroll , "Spring roll" , "40" , "+ ADD"));
        list.add(new MainModel(R.drawable.vegbullet , "Veg Bullet" , "50" , "+ ADD"));
        list.add(new MainModel(R.drawable.chole , "Chole Bhature" , "40" , "+ ADD"));
        list.add(new MainModel(R.drawable.pasta, "Pasta" , "100" , "+ ADD"));
        list.add(new MainModel(R.drawable.straberry, "strawberry Shake" , "60" , "+ ADD"));


        MainAdapter adapter = new MainAdapter(list , this);
        binding.recylerview.setAdapter(adapter);


        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        binding.recylerview.setLayoutManager(layoutManager);


    }
}