package com.example.farmer;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.bottomsheet.BottomSheetDialog;

import java.util.ArrayList;

public class notificationitemsadapter extends RecyclerView.Adapter<notificationitemsadapter.nofifiactionholder>  {
    ArrayList<notificationModel> notificarionmess = new ArrayList<>();

    public notificationitemsadapter(ArrayList<notificationModel> notificarionmess) {
        this.notificarionmess = notificarionmess;
    }


    @NonNull
    @Override
    public nofifiactionholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.notificationitems,parent,false);
        return new nofifiactionholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull nofifiactionholder holder, int position) {
        holder.notiimg.setImageResource(notificarionmess.get(position).getNotiimg());
        holder.notimess.setText(notificarionmess.get(position).getNofimess());

    }

    @Override
    public int getItemCount() {
        return notificarionmess.size();
    }

    public  class nofifiactionholder extends RecyclerView.ViewHolder {

        ImageView notiimg;
        TextView  notimess;

        public nofifiactionholder(@NonNull View itemView) {
            super(itemView);
            notiimg = itemView.findViewById(R.id.notificationimg);
            notimess = itemView.findViewById(R.id.notificationtext);
        }
    }
}
