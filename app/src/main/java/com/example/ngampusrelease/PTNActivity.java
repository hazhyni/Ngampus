package com.example.ngampusrelease;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.tabs.TabLayout;
import java.util.ArrayList;

public class PTNActivity extends AppCompatActivity {

    private RecyclerView rvptn;
    private final ArrayList<PTN> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ptnactivity);


        //  RECYCLERVIEW

        rvptn = findViewById(R.id.rvptn);
        rvptn.setHasFixedSize(true);

        list.addAll(PTNData.getListData());
        showRecyclerList();
    }

    private void showRecyclerList() {
        rvptn.setLayoutManager(new LinearLayoutManager(this));
        PTNAdapter PTNAdapter = new PTNAdapter(list);
        rvptn.setAdapter(PTNAdapter);

        PTNAdapter.setOnItemClickCallback(ptn -> {
            Intent intentptn = new Intent(PTNActivity.this, DetailPtnActivity.class);
            intentptn.putExtra(DetailPtnActivity.ITEM_EXTRA, ptn);
            startActivity(intentptn);
        });
    }
}