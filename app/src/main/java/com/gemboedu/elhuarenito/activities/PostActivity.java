package com.gemboedu.elhuarenito.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;

import com.gemboedu.elhuarenito.R;
import com.gemboedu.elhuarenito.databinding.ActivityPostBinding;

public class PostActivity extends AppCompatActivity {
    private ActivityPostBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityPostBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        Toolbar toolbar = findViewById(R.id.action_bar_toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Post Covid-19");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}