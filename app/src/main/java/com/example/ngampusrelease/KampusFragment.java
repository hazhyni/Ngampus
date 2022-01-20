package com.example.ngampusrelease;

import android.content.Intent;
import android.icu.text.IDNA;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

public class KampusFragment extends Fragment {
    CardView cardptn, cardpts, cardpoltek, cardptk, cardevent, cardinfo;

    public KampusFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = LayoutInflater.from(getContext()).inflate(R.layout.fragment_kampus, container, false);

    // INTENT CARD ACTIVITY
        cardptn = (CardView) view.findViewById(R.id.cardptn);
        cardpts = (CardView) view.findViewById(R.id.cardpts);
        cardpoltek = (CardView) view.findViewById(R.id.cardpoltek);
        cardptk = (CardView) view.findViewById(R.id.cardptk);
        cardevent = (CardView) view.findViewById(R.id.cardevent);
        cardinfo = (CardView) view.findViewById(R.id.cardinfo);

        cardptn.setOnClickListener(vptn -> {
            Intent inptn = new Intent(getActivity(), PTNActivity.class);
            startActivity(inptn);
        });

        cardpts.setOnClickListener(vpts -> {
            Intent inpts = new Intent(getActivity(), PTSActivity.class);
            startActivity(inpts);
        });

        cardpoltek.setOnClickListener(vpts -> {
            Intent inpoltek = new Intent(getActivity(), PoltekActivity.class);
            startActivity(inpoltek);
        });

        cardptk.setOnClickListener(vptk -> {
            Intent inptk = new Intent(getActivity(), PTKActivity.class);
            startActivity(inptk);
        });

        cardevent.setOnClickListener(vevent -> {
            Intent inevent = new Intent(getActivity(), EventOlimpiadeActivity.class);
            startActivity(inevent);
        });

        cardinfo.setOnClickListener(vinfo -> {
            Intent ininfo = new Intent(getActivity(), InfoActivity.class);
            startActivity(ininfo);
        });

        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        requireActivity().setTitle("PTN");
    }
}