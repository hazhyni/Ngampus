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

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.Map;

public class PTNAdapter extends RecyclerView.Adapter<PTNAdapter.ListViewHolder> {
    private final ArrayList<PTN> listPTN;

    private OnItemClickCallbackPTN onItemClickCallbackPTN;

    public void setOnItemClickCallback(OnItemClickCallbackPTN onItemClickCallbackPTN) {
        this.onItemClickCallbackPTN = onItemClickCallbackPTN;
    }

    public PTNAdapter(ArrayList<PTN> list) {
        this.listPTN = list;
    }
    @NonNull
    @Override
    public PTNAdapter.ListViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_ptn, parent, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PTNAdapter.ListViewHolder holder, int position) {
        PTN ptn = listPTN.get(position);
        Glide.with(holder.itemView.getContext())
                .load(ptn.getImg_kampus())
                .apply(new RequestOptions().override(55,55))
                .into(holder.imgPhoto);
        holder.txt_namakampus.setText(ptn.getNamakampus());
        holder.akreditasi.setText(ptn.getAkreditasi());
        holder.kota.setText(ptn.getKota());
        holder.itemView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                onItemClickCallbackPTN.onItemClicked(listPTN.get(holder.getAdapterPosition()));
            }
        });
    }

    @Override
    public int getItemCount() {
        return listPTN.size();
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

