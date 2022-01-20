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

public class PTKActivity extends AppCompatActivity {

    ViewPager viewPager;
    TabLayout tabLayout;

    private RecyclerView rvptk;
    private final ArrayList<PTK> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ptkactivity);

        //  RECYCLERVIEW

        rvptk = findViewById(R.id.rvptk);
        rvptk.setHasFixedSize(true);

        list.addAll(PTKData.getListData());
        showRecyclerList();
    }

    private void showRecyclerList() {
        rvptk.setLayoutManager(new LinearLayoutManager(this));
        PTKAdapter PTKAdapter = new PTKAdapter(list);
        rvptk.setAdapter(PTKAdapter);

        PTKAdapter.setOnItemClickCallback(ptk -> {
            Intent intentptk = new Intent(PTKActivity.this, DetailPtkActivity.class);
            intentptk.putExtra(DetailPtkActivity.ITEM_EXTRA, ptk);
            startActivity(intentptk);
        });
    }
}