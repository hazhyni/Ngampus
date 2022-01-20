package com.example.ngampusrelease;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

public class PoltekActivity extends AppCompatActivity {

    ViewPager viewPager;
    TabLayout tabLayout;

    private RecyclerView rvpoltek;
    private final ArrayList<Poltek> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_poltek);

        //  RECYCLERVIEW

        rvpoltek = findViewById(R.id.rvpoltek);
        rvpoltek.setHasFixedSize(true);

        list.addAll(PoltekData.getListData());
        showRecyclerList();
    }

    private void showRecyclerList() {
        rvpoltek.setLayoutManager(new LinearLayoutManager(this));
        PoltekAdapter PoltekAdapter = new PoltekAdapter(list);
        rvpoltek.setAdapter(PoltekAdapter);

        PoltekAdapter.setOnItemClickCallback(poltek -> {
            Intent intentpoltek = new Intent(PoltekActivity.this, DetailPoltekActivity.class);
            intentpoltek.putExtra(DetailPoltekActivity.ITEM_EXTRA, poltek);
            startActivity(intentpoltek);
        });
    }
}