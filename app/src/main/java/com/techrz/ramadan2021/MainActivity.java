package com.techrz.ramadan2021;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

public class MainActivity extends AppCompatActivity {

    private Button tosbi;
    private Button exitt;
    private Button about;
    private Button Dua;
    private Button timeTable;
    private AdView mAdView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });

        mAdView = findViewById(R.id.adView1);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        tosbi = findViewById(R.id.tosbi);
        tosbi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openTosbi();
            }
        });

        exitt = findViewById(R.id.exitt);
        exitt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                exitt();
            }
        });

        about = findViewById(R.id.about);
        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                aboutScreen();
            }
        });

        Dua=findViewById(R.id.doya);
        Dua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DuaWindow();
            }
        });

        timeTable=findViewById(R.id.timeTable);
        timeTable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openTimeTable();
            }
        });
    }
    public void openTosbi(){
        Intent tosbi =new Intent(this, tosbi.class);
        startActivity(tosbi);
    }
    public void exitt(){
            moveTaskToBack(true);
            android.os.Process.killProcess(android.os.Process.myPid());
            System.exit(1);
    }
    public void aboutScreen(){
        Intent about= new Intent(this,About.class);
        startActivity(about);
    }
     public void DuaWindow(){
        Intent dua= new Intent(this,Dua.class);
        startActivity(dua);
     }
     public void openTimeTable(){
        Intent time = new Intent(this,timeTable.class);
        startActivity(time);
     }

}