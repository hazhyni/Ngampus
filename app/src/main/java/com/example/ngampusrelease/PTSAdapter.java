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

public class PTSAdapter extends RecyclerView.Adapter<PTSAdapter.ListViewHolder> {
    private final ArrayList<PTS> listPTS;

    private OnItemClickCallbackPTS onItemClickCallbackPTS;

    public void setOnItemClickCallback(OnItemClickCallbackPTS onItemClickCallbackPTS) {
        this.onItemClickCallbackPTS = onItemClickCallbackPTS;
    }

    public PTSAdapter(ArrayList<PTS> list) {
        this.listPTS = list;
    }
    @NonNull
    @Override
    public PTSAdapter.ListViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_pts, parent, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PTSAdapter.ListViewHolder holder, int position) {
        PTS pts = listPTS.get(position);
        Glide.with(holder.itemView.getContext())
                .load(pts.getImg_kampus())
                .apply(new RequestOptions().override(55,55))
                .into(holder.imgPhoto);
        holder.txt_namakampus.setText(pts.getNamakampus());
        holder.akreditasi.setText(pts.getAkreditasi());
        holder.kota.setText(pts.getKota());
        holder.itemView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                onItemClickCallbackPTS.onItemClicked(listPTS.get(holder.getAdapterPosition()));
            }
        });
    }

    @Override
    public int getItemCount() {
        return listPTS.size();
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

