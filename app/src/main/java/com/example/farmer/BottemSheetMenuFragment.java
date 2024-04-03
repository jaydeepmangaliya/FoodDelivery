package com.example.farmer;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.google.android.material.bottomsheet.BottomSheetDialogFragment;

import java.util.ArrayList;


public class BottemSheetMenuFragment extends BottomSheetDialogFragment  {

  ArrayList<MenuModel> menulist = new ArrayList<>();
  RecyclerView menurecycleview;
  ImageView backarrow;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

       View view =inflater.inflate(R.layout.fragment_bottem_sheet_menu, container, false);


       // we will use dismiss method to disclose ovr bottomsheet
       backarrow = view.findViewById(R.id.backArrow);
       //backarrow close
       backarrow.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
         dismiss();
        }
       });


       menurecycleview = view.findViewById(R.id.menurecycle);
       menurecycleview.setLayoutManager(new LinearLayoutManager(getContext()));
       menulist.add(new MenuModel(R.drawable.fruitsalad,"fruit","500"));
        menulist.add(new MenuModel(R.drawable.fruitsalad,"fruit","500"));
        menulist.add(new MenuModel(R.drawable.fruitsalad,"fruit","500"));
        menulist.add(new MenuModel(R.drawable.fruitsalad,"fruit","500"));
        menulist.add(new MenuModel(R.drawable.fruitsalad,"fruit","500"));
        menulist.add(new MenuModel(R.drawable.fruitsalad,"fruit","500"));
        menulist.add(new MenuModel(R.drawable.fruitsalad,"fruit","500"));
        menulist.add(new MenuModel(R.drawable.fruitsalad,"fruit","500"));
        menulist.add(new MenuModel(R.drawable.fruitsalad,"fruit","500"));
        menulist.add(new MenuModel(R.drawable.fruitsalad,"fruit","500"));
        menulist.add(new MenuModel(R.drawable.fruitsalad,"fruit","500"));
        menulist.add(new MenuModel(R.drawable.fruitsalad,"fruit","500"));
        menulist.add(new MenuModel(R.drawable.fruitsalad,"fruit","500"));
        menulist.add(new MenuModel(R.drawable.fruitsalad,"fruit","500"));
        menulist.add(new MenuModel(R.drawable.fruitsalad,"fruit","500"));
        menulist.add(new MenuModel(R.drawable.fruitsalad,"fruit","500"));
        menulist.add(new MenuModel(R.drawable.fruitsalad,"fruit","500"));
        menulist.add(new MenuModel(R.drawable.fruitsalad,"fruit","500"));
        menulist.add(new MenuModel(R.drawable.fruitsalad,"fruit","500"));
        menulist.add(new MenuModel(R.drawable.fruitsalad,"fruit","500"));
        menulist.add(new MenuModel(R.drawable.fruitsalad,"fruit","500"));
        menulist.add(new MenuModel(R.drawable.fruitsalad,"fruit","500"));
        menulist.add(new MenuModel(R.drawable.fruitsalad,"fruit","500"));
        menulist.add(new MenuModel(R.drawable.fruitsalad,"fruit","500"));
        menulist.add(new MenuModel(R.drawable.fruitsalad,"fruit","500"));
        menulist.add(new MenuModel(R.drawable.fruitsalad,"fruit","500"));
        menulist.add(new MenuModel(R.drawable.fruitsalad,"fruit","500"));
        menulist.add(new MenuModel(R.drawable.fruitsalad,"fruit","500"));
        menulist.add(new MenuModel(R.drawable.fruitsalad,"fruit","500"));
        menulist.add(new MenuModel(R.drawable.fruitsalad,"fruit","500"));
        menulist.add(new MenuModel(R.drawable.fruitsalad,"fruit","500"));
        menulist.add(new MenuModel(R.drawable.fruitsalad,"fruit","500"));
        menulist.add(new MenuModel(R.drawable.fruitsalad,"fruit","500"));
        menulist.add(new MenuModel(R.drawable.fruitsalad,"fruit","500"));
        menulist.add(new MenuModel(R.drawable.fruitsalad,"fruit","500"));
        menulist.add(new MenuModel(R.drawable.fruitsalad,"fruit","500"));
        menulist.add(new MenuModel(R.drawable.fruitsalad,"fruit","500"));
        menulist.add(new MenuModel(R.drawable.fruitsalad,"fruit","500"));
        menulist.add(new MenuModel(R.drawable.fruitsalad,"fruit","500"));
        menulist.add(new MenuModel(R.drawable.fruitsalad,"fruit","500"));
        menulist.add(new MenuModel(R.drawable.fruitsalad,"fruit","500"));
        menulist.add(new MenuModel(R.drawable.fruitsalad,"fruit","500"));
        menulist.add(new MenuModel(R.drawable.fruitsalad,"fruit","500"));
        menulist.add(new MenuModel(R.drawable.fruitsalad,"fruit","500"));
        menulist.add(new MenuModel(R.drawable.fruitsalad,"fruit","500"));
        menulist.add(new MenuModel(R.drawable.fruitsalad,"fruit","500"));
        menulist.add(new MenuModel(R.drawable.fruitsalad,"fruit","500"));
        menulist.add(new MenuModel(R.drawable.fruitsalad,"fruit","500"));
        menulist.add(new MenuModel(R.drawable.fruitsalad,"fruit","500"));
        menulist.add(new MenuModel(R.drawable.fruitsalad,"fruit","500"));
        menulist.add(new MenuModel(R.drawable.fruitsalad,"fruit","500"));
        menulist.add(new MenuModel(R.drawable.fruitsalad,"fruit","500"));
        menulist.add(new MenuModel(R.drawable.fruitsalad,"fruit","500"));


        menurecycleview.setAdapter(new MenuRecycleAdapter(menulist));
       return  view;
    }
}