package com.techrz.ramadan2021;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

import org.w3c.dom.Text;

public class tosbi extends AppCompatActivity {
    private int counter=0;
    ImageButton tosbiCounter;
    Button resetButton;
    TextView counterText;
    private AdView mAdView2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tosbi);

        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });

        mAdView2 = findViewById(R.id.adView2);
        AdRequest adRequest2 = new AdRequest.Builder().build();
        mAdView2.loadAd(adRequest2);


        tosbiCounter = (ImageButton) findViewById(R.id.tosbiCounter);
        counterText = (TextView) findViewById(R.id.counterText);
        resetButton = (Button) findViewById(R.id.reset);
        tosbiCounter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    counter++;
                    counterText.setText(Integer.toString(counter));
            }
        });
        resetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter=0;
                counterText.setText(Integer.toString(counter));
            }
        });
    }
}