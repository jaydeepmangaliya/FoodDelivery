package com.example.farmer;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;
import com.google.android.material.bottomnavigation.BottomNavigationItemView;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity  {
    private BottomNavigationView bnv;
    private FrameLayout Fl;
    private ImageView notificationicon;



    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bnv = findViewById(R.id.BNV);
        notificationicon = findViewById(R.id.notificationicon);
        Fl = findViewById(R.id.FLAYOUT);
        // for notification; 
        notificationicon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                notiaction_Bottom_shit_Fragment nbsf = new notiaction_Bottom_shit_Fragment();
                nbsf.show(getSupportFragmentManager(),nbsf.getTag());


            }
        });




        bnv.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int id = item.getItemId();
                if (id == R.id.nav_home) {
                    loadfragment(new HomeFragment(),true);
                } else if (id == R.id.nav_cart) {
                    loadfragment(new cart_Fragment(), false);

                } else if (id == R.id.nav_history) {
                    loadfragment(new history_Fragment(),false);

                } else if (id == R.id.nav_search) {
                    loadfragment(new search_Fragment(),false);

                }
                //for profile
                else {
                    loadfragment(new profile_Fragment(),false);

                }
                return true;
            }
        });
        bnv.setSelectedItemId(R.id.nav_home);

        // for noticication




    }
    public  void loadfragment(Fragment f, boolean applicationload){
        FragmentManager FM = getSupportFragmentManager();
        FragmentTransaction FT = FM.beginTransaction();
        if(applicationload){
        FT.add(R.id.FLAYOUT, f);
        }
        else  {
            FT.replace(R.id.FLAYOUT ,f);
        }
        FT.commit();

    }


    }

