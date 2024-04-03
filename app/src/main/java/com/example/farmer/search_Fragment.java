package com.example.farmer;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SearchView;
import android.widget.Toast;

import java.util.ArrayList;


public class search_Fragment extends Fragment {


  ArrayList<searchMode> searchlist = new ArrayList<>();
  RecyclerView  searchrecycle;
  SearchView searchview;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =inflater.inflate(R.layout.fragment_search_, container, false);
        searchrecycle = view.findViewById(R.id.SearchRecycle);

        searchrecycle.setLayoutManager( new LinearLayoutManager(getContext()));
        // for serching
      searchview = view.findViewById(R.id.searchView);
        searchview.clearFocus();
        searchview.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String s) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String s) {
                filterList(s);
                return true;
            }

            private void filterList(String text) {
               ArrayList<searchMode> filterListt =  new ArrayList<>();
               for( searchMode items : searchlist){
                   if(items.getSfoodname().toLowerCase().contains(text.toLowerCase())){
                       filterListt.add(items);
                   }
                   if(filterListt.isEmpty()){
                       Toast.makeText(getContext(), "No data found", Toast.LENGTH_SHORT).show();


                   }
                   else {
                       searchrecycle.setAdapter(new SearchRecycleAdapter(filterListt));
                   }
               }

            }
        });


        searchlist.add(new searchMode(R.drawable.harbalcake,"cake","100"));
        searchlist.add(new searchMode(R.drawable.fruitsalad,"pizza", "200"));
        searchlist.add(new searchMode(R.drawable.harbalcake,"banana","100"));
        searchlist.add(new searchMode(R.drawable.fruitsalad,"orange", "200"));
        searchlist.add(new searchMode(R.drawable.harbalcake,"coconut","100"));
        searchlist.add(new searchMode(R.drawable.fruitsalad,"mango", "200"));
        searchlist.add(new searchMode(R.drawable.harbalcake,"berry","100"));
        searchlist.add(new searchMode(R.drawable.fruitsalad,"grapes", "200"));
        searchlist.add(new searchMode(R.drawable.harbalcake,"vegetable","100"));
        searchlist.add(new searchMode(R.drawable.fruitsalad,"lemon", "200"));

        searchrecycle.setAdapter( new SearchRecycleAdapter(searchlist));

        return view;
    }
}