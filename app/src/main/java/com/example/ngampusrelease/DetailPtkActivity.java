package com.example.ngampusrelease;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import com.bumptech.glide.Glide;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.material.tabs.TabLayout;

public class DetailPtkActivity extends AppCompatActivity implements OnMapReadyCallback {
    public static final String ITEM_EXTRA = "item_extra";

    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_ptk);

        //  TABLAYOUT

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        //  RECYCLERVIEW

        ImageView img_ptk = findViewById(R.id.img_kampus);
        TextView txt_namakampus = findViewById(R.id.txt_namakampus);
        TextView akreditasi = findViewById(R.id.akreditasi);
        TextView kota = findViewById(R.id.kota);
        TextView detail = findViewById(R.id.detail);

        SupportMapFragment supportMapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.fragmentmapptk);
        supportMapFragment.getMapAsync(this);

        PTK ptk = getIntent().getParcelableExtra(ITEM_EXTRA);

        if(ptk != null) {
            Glide.with(this)
                    .load(ptk.getImg_kampus()).into(img_ptk);
            txt_namakampus.setText(ptk.getNamakampus());
            akreditasi.setText(ptk.getAkreditasi());
            kota.setText(ptk.getKota());
            detail.setText(ptk.getDetail());
        }
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("Detail PTK");
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        //  BUTTON LOKASI
        Button btnmap = findViewById(R.id.btnmap);

        btnmap.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                // Create a Uri from an intent string. Use the result to create an Intent.
                Uri gmmIntentUri = Uri.parse("geo:-5.9122777696374795, 106.85521749719575");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);
            }
        });

    }


    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }

    @Override
    public void onMapReady(@NonNull GoogleMap googleMap) {

    }

}