package com.example.farmer;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclepopularAdapter extends RecyclerView.Adapter<RecyclepopularAdapter.myviewholder> {
    ArrayList<popularModel> itemsholder = new ArrayList<>();

    public RecyclepopularAdapter(ArrayList<popularModel> itemsholder) {
        this.itemsholder = itemsholder;
    }

    @NonNull
    @Override
    public myviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.popular_item,parent,false);
        return new myviewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull myviewholder holder, int position) {

            holder.img.setImageResource(itemsholder.get(position).getImg());
            holder.foodnamee.setText(itemsholder.get(position).getFoodname());
            holder.moneytexx.setText(itemsholder.get(position).getFoodsprice());

            setAnimation(holder.itemView,position);
    }

    @Override
    public int getItemCount() {
        return itemsholder.size();
    }

    class  myviewholder extends RecyclerView.ViewHolder{
        ImageView img;
        TextView foodnamee;
        TextView moneytexx;
        public myviewholder(@NonNull View itemView) {
            super(itemView);
            img = itemView.findViewById(R.id.popularimg);
            foodnamee = itemView.findViewById(R.id.foodname);
            moneytexx = itemView.findViewById(R.id.moneytex);

        }
    }
    public  static  void setAnimation(View myAnimation , int position){
        Animation slidleft = AnimationUtils.loadAnimation(myAnimation.getContext(), android.R.anim.slide_in_left);
        myAnimation.setAnimation(slidleft);
    }
}
