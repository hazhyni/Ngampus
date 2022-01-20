package com.example.ngampusrelease;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class PTKAdapter extends RecyclerView.Adapter<PTKAdapter.ListViewHolder> {
    private final ArrayList<PTK> listPTK;

    private OnItemClickCallbackPTK onItemClickCallbackPTK;

    public void setOnItemClickCallback(OnItemClickCallbackPTK onItemClickCallbackPTK) {
        this.onItemClickCallbackPTK = onItemClickCallbackPTK;
    }

    public PTKAdapter(ArrayList<PTK> list) {
        this.listPTK = list;
    }
    @NonNull
    @Override
    public PTKAdapter.ListViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_ptk, parent, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PTKAdapter.ListViewHolder holder, int position) {
        PTK ptk = listPTK.get(position);
        Glide.with(holder.itemView.getContext())
                .load(ptk.getImg_kampus())
                .apply(new RequestOptions().override(55,55))
                .into(holder.imgPhoto);
        holder.txt_namakampus.setText(ptk.getNamakampus());
        holder.akreditasi.setText(ptk.getAkreditasi());
        holder.kota.setText(ptk.getKota());
        holder.itemView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                onItemClickCallbackPTK.onItemClicked(listPTK.get(holder.getAdapterPosition()));
            }
        });
    }

    @Override
    public int getItemCount() {
        return listPTK.size();
    }

    static class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView txt_namakampus;
        TextView akreditasi;
        TextView kota;
        TextView detail;

        public ListViewHolder(View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_kampus);
            txt_namakampus = itemView.findViewById(R.id.txt_namakampus);
            akreditasi = itemView.findViewById(R.id.akreditasi);
            kota = itemView.findViewById(R.id.kota);
            detail = itemView.findViewById(R.id.detail);
        }
    }
}

