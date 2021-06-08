package com.gemboedu.elhuarenito.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.gemboedu.elhuarenito.MainActivity;
import com.gemboedu.elhuarenito.R;
import com.gemboedu.elhuarenito.databinding.ActivityVideosBinding;

public class VideosActivity extends AppCompatActivity {
    private ActivityVideosBinding videosBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        videosBinding = ActivityVideosBinding.inflate(getLayoutInflater());
        setContentView(videosBinding.getRoot());

        videosBinding.arrowVideos.setOnClickListener(v -> {
            Intent intent = new Intent(VideosActivity.this, MainActivity.class);
            startActivity(intent);
            finish();
        });
    }
}