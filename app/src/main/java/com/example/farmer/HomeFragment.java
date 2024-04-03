package com.example.farmer;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;

import java.util.ArrayList;

public class HomeFragment extends Fragment {
    RecyclerView recyclepopularitem;
    ArrayList<SlideModel> imageList = new ArrayList<>();
    ArrayList<popularModel> popularItemss ;
    ImageSlider IS;
    TextView addtocartButton;
    TextView viewallitem;




    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view=inflater.inflate(R.layout.fragment_home, container, false);
       IS = view.findViewById(R.id.image_slider);
         recyclepopularitem =view.findViewById(R.id.recycleofpopularitem);
        recyclepopularitem.setLayoutManager(new LinearLayoutManager(getContext()));
        viewallitem = view.findViewById(R.id.viewallitems);

       popularItemss= new ArrayList<>();
       // to view all items (fragment)
       viewallitem.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {

               BottemSheetMenuFragment bsm = new BottemSheetMenuFragment();
               bsm.show(getActivity().getSupportFragmentManager(), bsm.getTag() );
           }
       });
       //
        imageList.add(new SlideModel("https://images.pexels.com/photos/2067396/pexels-photo-2067396.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2","Chocolate", ScaleTypes.CENTER_CROP));
        imageList.add(new SlideModel("https://images.pexels.com/photos/4110006/pexels-photo-4110006.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2","Pasty", ScaleTypes.CENTER_CROP));
        imageList.add(new SlideModel("https://images.pexels.com/photos/568804/pexels-photo-568804.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2","Cold", ScaleTypes.CENTER_CROP));
        imageList.add(new SlideModel("https://images.pexels.com/photos/376464/pexels-photo-376464.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=2","Donate", ScaleTypes.CENTER_CROP));
        imageList.add(new SlideModel("https://images.pexels.com/photos/5848178/pexels-photo-5848178.jpeg","Cookies", ScaleTypes.CENTER_CROP));
        IS.setImageList(imageList);
 // add items into obj of callss
        popularItemss.add(new popularModel(R.drawable.harbalcake, "HarbalCake" , "200"));
        popularItemss.add(new popularModel(R.drawable.fruitsalad, "FruitSalad" , "500"));
        popularItemss.add(new popularModel(R.drawable.harbalcake, "HarbalCake" , "200"));
        popularItemss.add(new popularModel(R.drawable.fruitsalad, "FruitSalad" , "500"));
        popularItemss.add(new popularModel(R.drawable.harbalcake, "HarbalCake" , "200"));
        popularItemss.add(new popularModel(R.drawable.fruitsalad, "FruitSalad" , "500"));
        popularItemss.add(new popularModel(R.drawable.harbalcake, "HarbalCake" , "200"));
        popularItemss.add(new popularModel(R.drawable.fruitsalad, "FruitSalad" , "500"));
        popularItemss.add(new popularModel(R.drawable.harbalcake, "HarbalCake" , "200"));
        popularItemss.add(new popularModel(R.drawable.fruitsalad, "FruitSalad" , "500"));
        popularItemss.add(new popularModel(R.drawable.harbalcake, "HarbalCake" , "200"));
        popularItemss.add(new popularModel(R.drawable.fruitsalad, "FruitSalad" , "500"));
        popularItemss.add(new popularModel(R.drawable.harbalcake, "HarbalCake" , "200"));
        popularItemss.add(new popularModel(R.drawable.fruitsalad, "FruitSalad" , "500"));
        popularItemss.add(new popularModel(R.drawable.harbalcake, "HarbalCake" , "200"));
        popularItemss.add(new popularModel(R.drawable.fruitsalad, "FruitSalad" , "500"));
        popularItemss.add(new popularModel(R.drawable.harbalcake, "HarbalCake" , "200"));
        recyclepopularitem.setAdapter(new RecyclepopularAdapter(popularItemss));

        return view;
    }


    }
