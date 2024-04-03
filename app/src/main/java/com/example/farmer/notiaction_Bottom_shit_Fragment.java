package com.example.farmer;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.material.bottomsheet.BottomSheetDialogFragment;

import java.lang.reflect.Array;
import java.util.ArrayList;


public class notiaction_Bottom_shit_Fragment extends BottomSheetDialogFragment {

    ArrayList<notificationModel> notificationmess = new ArrayList<>();
    RecyclerView notirecycle;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
      View  view = inflater.inflate(R.layout.fragment_notiaction__bottom_shit_, container, false);
      notirecycle = view.findViewById(R.id.notificationRecycle);
      notirecycle.setLayoutManager(new LinearLayoutManager(getContext()));
//      notificationmess.add(new notificationModel(R.drawable.fruitsalad, " wait for five mini"));
        notificationmess.add(new notificationModel(R.drawable.harbalcake,"hello"));
//      notificationmess.add(new notificationModel(R.drawable.fruitsalad, " wait for five mini"));
      notirecycle.setAdapter( new notificationitemsadapter(notificationmess));
        return view;
    }
}