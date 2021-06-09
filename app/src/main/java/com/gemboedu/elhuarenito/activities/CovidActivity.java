package com.gemboedu.elhuarenito.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.widget.Toolbar;

import com.gemboedu.elhuarenito.MainActivity;
import com.gemboedu.elhuarenito.R;
import com.gemboedu.elhuarenito.databinding.ActivityCovidBinding;

public class CovidActivity extends AppCompatActivity {
    private ActivityCovidBinding binding;
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityCovidBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Toolbar toolbar = findViewById(R.id.action_bar_toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(R.string.go_back);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


    }


}