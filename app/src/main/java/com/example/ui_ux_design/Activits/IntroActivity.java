package com.example.ui_ux_design.Activits;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.example.ui_ux_design.Adapter.TrendsAdapter;
import com.example.ui_ux_design.Domain.TrensDomain;
import com.example.ui_ux_design.R;

import java.util.ArrayList;

public class IntroActivity extends AppCompatActivity {
    private RecyclerView.Adapter adapterTrends;
    private  RecyclerView recyclerViewTrends;
    private ImageView profileBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.intro_main);


        initRecyclerView();
        profileInit();
        settingInit();
        waaletInit();
        homeInit();

    }

    private void profileInit() {
        LinearLayout profileBtn = findViewById(R.id.profilebtn);
        profileBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(IntroActivity.this, ProfilemActivity.class));
            }
        });
    }

    private void settingInit(){
        LinearLayout settingBtn = findViewById(R.id.settingbtn);
        settingBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(IntroActivity.this,IntrosActivity.class));
            }
        });
    }

    private void homeInit(){
        LinearLayout homeBtn =findViewById(R.id.homebtn);
        homeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(IntroActivity.this,IntrosActivity.class));
            }
        });
    }
    private void waaletInit(){
        LinearLayout walletBtn = findViewById(R.id.walletbtn);
        walletBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(IntroActivity.this,IntrosActivity.class));
            }
        });
    }

    private  void initRecyclerView(){
        ArrayList<TrensDomain> items=new ArrayList<>();
        items.add(new TrensDomain("Future in AI, What will\n" +
                "tomorrow be like?","The National","trends"));
        items.add(new TrensDomain("Important points in\n" +
                "concluding a work contract","Returns","trends2"));
        items.add(new TrensDomain("Future in AI, what will\n" +
                "tomorrow be like?", "The National","trends"));

        recyclerViewTrends = findViewById(R.id.view1);
        recyclerViewTrends.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));

        adapterTrends = new TrendsAdapter(items);
        recyclerViewTrends.setAdapter(adapterTrends);

    }


    }
