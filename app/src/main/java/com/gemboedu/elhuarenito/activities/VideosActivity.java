package com.gemboedu.elhuarenito.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toolbar;

import com.gemboedu.elhuarenito.R;
import com.gemboedu.elhuarenito.databinding.ActivityVideosBinding;

import java.util.ArrayList;
import java.util.List;

public class VideosActivity extends AppCompatActivity {
    private ActivityVideosBinding videosBinding;
    private Toolbar toolbar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        videosBinding = ActivityVideosBinding.inflate(getLayoutInflater());
        setContentView(videosBinding.getRoot());

        androidx.appcompat.widget.Toolbar toolbar = findViewById(R.id.action_bar_toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(R.string.go_back);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


    }
}
