package com.gemboedu.elhuarenito.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;

import com.gemboedu.elhuarenito.R;
import com.gemboedu.elhuarenito.databinding.ActivityProcesoBinding;

public class ProcesoActivity extends AppCompatActivity {
    private ActivityProcesoBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityProcesoBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Toolbar toolbar = findViewById(R.id.action_bar_toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Tratamiento");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }
}