package com.example.ngampusrelease;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

public class PTSActivity extends AppCompatActivity {

    private RecyclerView rvpts;
    private final ArrayList<PTS> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ptsactivity);

        //  RECYCLERVIEW

        rvpts = findViewById(R.id.rvpts);
        rvpts.setHasFixedSize(true);

        list.addAll(PTSData.getListDataPTS());
        showRecyclerList();
    }

    private void showRecyclerList() {
        rvpts.setLayoutManager(new LinearLayoutManager(this));
        PTSAdapter PTSAdapter = new PTSAdapter(list);
        rvpts.setAdapter(PTSAdapter);

        PTSAdapter.setOnItemClickCallback(pts -> {
            Intent intentpts = new Intent(PTSActivity.this, DetailPtsActivity.class);
            intentpts.putExtra(DetailPtsActivity.ITEM_EXTRA, pts);
            startActivity(intentpts);
        });
    }
}