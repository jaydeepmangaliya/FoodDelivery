package com.example.farmer;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


public class MenuRecycleAdapter extends RecyclerView.Adapter<MenuRecycleAdapter.menuholder> {

  ArrayList<MenuModel> menulist = new ArrayList<>();

    public MenuRecycleAdapter(ArrayList<MenuModel> menulist) {
        this.menulist = menulist;
    }

    @NonNull
    @Override
    public menuholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.foodmenu_items,parent,false);
        return new menuholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull menuholder holder, int position) {
   holder.menuimgg.setImageResource(menulist.get(position).getImg());
   holder.menufoodname.setText(menulist.get(position).getMenufoodName());
   holder.menufoodprice.setText(menulist.get(position).getMenuprice());


    }

    @Override
    public int getItemCount() {
        return menulist.size();
    }

    public  class menuholder extends RecyclerView.ViewHolder{

        ImageView menuimgg;
        TextView menufoodname;
        TextView menufoodprice;


        public menuholder(@NonNull View itemView) {
            super(itemView);
            menuimgg = itemView.findViewById(R.id.menuimage);
            menufoodname = itemView.findViewById(R.id.menufoodname);
            menufoodprice = itemView.findViewById(R.id.Menumoneytex);

        }
    }


}
