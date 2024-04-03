package com.example.farmer;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class carRecycleAdapter extends RecyclerView.Adapter<carRecycleAdapter.cartViewholder>  {
   
    ArrayList<cartMode> cartItemsList = new ArrayList<>();

    public carRecycleAdapter(ArrayList<cartMode> cartItemsList) {
        this.cartItemsList = cartItemsList;
    }

    @NonNull
    @Override
    public cartViewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.cart_items,parent,false);
        return new cartViewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull cartViewholder holder, int position) {
        holder.Cimg.setImageResource(cartItemsList.get(position).getCtimg());
        holder.Cfoodnamee.setText(cartItemsList.get(position).getCfoodname());
        holder.Cfoodprice.setText(cartItemsList.get(position).getCfoodprice());
        //AnimationViewss(holder.itemView,position);


    }

    @Override
    public int getItemCount() {
        return cartItemsList.size();
    }

    public  class cartViewholder extends RecyclerView.ViewHolder {

        ImageView Cimg;
        TextView Cfoodnamee;
        TextView Cfoodprice;




        public cartViewholder(@NonNull View itemView) {
            super(itemView);
         Cimg =   itemView.findViewById(R.id.cartimg);
        Cfoodnamee =    itemView.findViewById(R.id.cartfoodname);
         Cfoodprice =    itemView.findViewById(R.id.cartitemsprices);
    
        }

    }

//    public  void AnimationViewss( View aniView , int position){
//
//        Animation slidleft = AnimationUtils.loadAnimation(aniView.getContext(), android.R.anim.slide_in_left);
//        aniView.setAnimation(slidleft);
//
//    }

}
