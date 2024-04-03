package com.example.farmer;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


public class history_Fragment extends Fragment {

RecyclerView buyrecycle;
ArrayList<BuyAgainModel> buyagainirems = new ArrayList<>();

    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_history_, container, false);
      buyrecycle = view.findViewById(R.id.buyrecycle);
      buyrecycle.setLayoutManager(new LinearLayoutManager(getContext()));

      buyagainirems.add(new BuyAgainModel(R.drawable.fruitsalad,"fruit", "200"));
        buyagainirems.add(new BuyAgainModel(R.drawable.fruitsalad,"fruit", "200"));
        buyagainirems.add(new BuyAgainModel(R.drawable.fruitsalad,"fruit", "200"));

        buyagainirems.add(new BuyAgainModel(R.drawable.fruitsalad,"fruit", "200"));
        buyagainirems.add(new BuyAgainModel(R.drawable.fruitsalad,"fruit", "200"));
        buyagainirems.add(new BuyAgainModel(R.drawable.fruitsalad,"fruit", "200"));
        buyagainirems.add(new BuyAgainModel(R.drawable.fruitsalad,"fruit", "200"));
        buyagainirems.add(new BuyAgainModel(R.drawable.fruitsalad,"fruit", "200"));
        buyagainirems.add(new BuyAgainModel(R.drawable.fruitsalad,"fruit", "200"));
        buyagainirems.add(new BuyAgainModel(R.drawable.fruitsalad,"fruit", "200"));
        buyagainirems.add(new BuyAgainModel(R.drawable.fruitsalad,"fruit", "200"));
        buyagainirems.add(new BuyAgainModel(R.drawable.fruitsalad,"fruit", "200"));
        buyagainirems.add(new BuyAgainModel(R.drawable.fruitsalad,"fruit", "200"));
        buyagainirems.add(new BuyAgainModel(R.drawable.fruitsalad,"fruit", "200"));
        buyagainirems.add(new BuyAgainModel(R.drawable.fruitsalad,"fruit", "200"));
        buyagainirems.add(new BuyAgainModel(R.drawable.fruitsalad,"fruit", "200"));
        buyagainirems.add(new BuyAgainModel(R.drawable.fruitsalad,"fruit", "200"));
        buyagainirems.add(new BuyAgainModel(R.drawable.fruitsalad,"fruit", "200"));
        buyrecycle.setAdapter( new BuyAgainRecycleAdapter(buyagainirems));
        return view;
    }
}