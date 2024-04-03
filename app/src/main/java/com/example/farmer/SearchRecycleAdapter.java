package com.example.farmer;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class SearchRecycleAdapter extends RecyclerView.Adapter<SearchRecycleAdapter.searchHolder> {
    ArrayList<searchMode> searchitems = new ArrayList<>();

    public SearchRecycleAdapter(ArrayList<searchMode> searchitems) {
        this.searchitems = searchitems;
    }
    public void setFiledlist(ArrayList<searchMode> fileteredlist){
        this.searchitems = fileteredlist;
    }

    @NonNull
    @Override
    public searchHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.searchitemsr,parent,false);
        return new searchHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull searchHolder holder, int position) {
   holder.simg.setImageResource(searchitems.get(position).getImg());
   holder.sfoodname.setText(searchitems.get(position).getSfoodname());
   holder.sfoodname.setText(searchitems.get(position).getSfoodname());
    }

    @Override
    public int getItemCount() {
        return searchitems.size();
    }

    public  class  searchHolder  extends RecyclerView.ViewHolder {
        ImageView simg;
        TextView sfoodname;
        TextView sfoodprice;
        public searchHolder(@NonNull View itemView) {
            super(itemView);
            simg = itemView.findViewById(R.id.Searchimg);
            sfoodname = itemView.findViewById(R.id.searchfoodN);
            sfoodprice = itemView.findViewById(R.id.Searchmoneytex);
        }
    }
}
