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

public class PoltekAdapter extends RecyclerView.Adapter<PoltekAdapter.ListViewHolder> {
    private final ArrayList<Poltek> listPoltek;

    private OnItemClickCallbackPoltek onItemClickCallbackPoltek;

    public void setOnItemClickCallback(OnItemClickCallbackPoltek onItemClickCallbackPoltek) {
        this.onItemClickCallbackPoltek = onItemClickCallbackPoltek;
    }

    public PoltekAdapter(ArrayList<Poltek> list) {
        this.listPoltek = list;
    }
    @NonNull
    @Override
    public PoltekAdapter.ListViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_poltek, parent, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PoltekAdapter.ListViewHolder holder, int position) {
        Poltek poltek = listPoltek.get(position);
        Glide.with(holder.itemView.getContext())
                .load(poltek.getImg_kampus())
                .apply(new RequestOptions().override(55,55))
                .into(holder.imgPhoto);
        holder.txt_namakampus.setText(poltek.getNamakampus());
        holder.akreditasi.setText(poltek.getAkreditasi());
        holder.kota.setText(poltek.getKota());
        holder.itemView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                onItemClickCallbackPoltek.onItemClicked(listPoltek.get(holder.getAdapterPosition()));
            }
        });
    }

    @Override
    public int getItemCount() {
        return listPoltek.size();
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

