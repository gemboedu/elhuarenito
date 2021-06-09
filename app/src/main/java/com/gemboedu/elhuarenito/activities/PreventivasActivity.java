package com.gemboedu.elhuarenito.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;

import com.gemboedu.elhuarenito.R;
import com.gemboedu.elhuarenito.databinding.ActivityPreventivasBinding;

public class PreventivasActivity extends AppCompatActivity {
    private ActivityPreventivasBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityPreventivasBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        Toolbar toolbar = findViewById(R.id.action_bar_toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Prevención");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}