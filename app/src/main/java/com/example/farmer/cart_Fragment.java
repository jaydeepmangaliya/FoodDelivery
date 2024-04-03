package com.example.farmer;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.zip.Inflater;

public class cart_Fragment extends Fragment {

RecyclerView recycleforcart;
ArrayList<cartMode>  cartItemsList ;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_cart_, container, false);
        recycleforcart = view.findViewById(R.id.cardRecycleview);
        recycleforcart.setLayoutManager(new LinearLayoutManager(getContext()));
        cartItemsList = new ArrayList<>();

        cartItemsList.add(new cartMode(R.drawable.fruitsalad,"F","500"));
        cartItemsList.add(new cartMode(R.drawable.fruitsalad,"F","500"));
        cartItemsList.add(new cartMode(R.drawable.fruitsalad,"F","500"));
        cartItemsList.add(new cartMode(R.drawable.fruitsalad,"F","500"));
        cartItemsList.add(new cartMode(R.drawable.fruitsalad,"F","500"));
        cartItemsList.add(new cartMode(R.drawable.fruitsalad,"F","500"));
        cartItemsList.add(new cartMode(R.drawable.fruitsalad,"F","500"));
        cartItemsList.add(new cartMode(R.drawable.fruitsalad,"F","500"));
        cartItemsList.add(new cartMode(R.drawable.fruitsalad,"F","500"));
        cartItemsList.add(new cartMode(R.drawable.fruitsalad,"F","500"));
        cartItemsList.add(new cartMode(R.drawable.fruitsalad,"F","500"));
        cartItemsList.add(new cartMode(R.drawable.fruitsalad,"F","500"));


        recycleforcart.setAdapter(new carRecycleAdapter(cartItemsList));


        return  view;
    }
}