package com.mediumsizedbutts.jonas.playr;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ScrollView;

public class MainActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private LinearLayout mainFrontPage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        mainFrontPage = (LinearLayout) findViewById(R.id.main_frontPage);
        displayFrontPage();
    }

    private void displayFrontPage() {
        mainFrontPage.addView( displayBanner() );
        mainFrontPage.addView( displayRecommended() );
    }

    private View displayRecommended() {
        LayoutInflater layoutInflater = (LayoutInflater) getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View v = layoutInflater.inflate(R.layout.main_horizontal_cover_scroll, null);
        return v;
    }

    private View displayBanner() {
        LayoutInflater layoutInflater = (LayoutInflater) getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View v = layoutInflater.inflate(R.layout.main_banner_movie, null);
        return v;
    }
}
