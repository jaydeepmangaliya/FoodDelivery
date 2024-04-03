package com.example.farmer;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class BuyAgainRecycleAdapter extends RecyclerView.Adapter<BuyAgainRecycleAdapter.BuyHolder> {
ArrayList<BuyAgainModel> buyagainitem = new ArrayList<>();

    public BuyAgainRecycleAdapter(ArrayList<BuyAgainModel> buyagainitem) {
        this.buyagainitem = buyagainitem;
    }


    @NonNull
    @Override
    public BuyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.buyagainitems,parent,false);
        return new BuyHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull BuyHolder holder, int position) {
   holder.BUYIMG.setImageResource(buyagainitem.get(position).getBuyimg());
   holder.BUYFOODNAME.setText(buyagainitem.get(position).getBuyfoodname());
   holder.BUYFOODPRICE.setText(buyagainitem.get(position).getBuyfoodprice());
    }

    @Override
    public int getItemCount() {
        return buyagainitem.size();
    }

    public  class  BuyHolder extends RecyclerView.ViewHolder {
      ImageView  BUYIMG;
      TextView BUYFOODNAME;
      TextView BUYFOODPRICE;

        public BuyHolder(@NonNull View itemView) {
            super(itemView);
            BUYIMG = itemView.findViewById(R.id.buyimg);
            BUYFOODNAME = itemView.findViewById(R.id.buyfoodname);
            BUYFOODPRICE=itemView.findViewById(R.id.buyfoodprice);

        }
    }
}
