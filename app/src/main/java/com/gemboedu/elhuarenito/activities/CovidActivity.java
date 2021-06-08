package com.gemboedu.elhuarenito.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.gemboedu.elhuarenito.MainActivity;
import com.gemboedu.elhuarenito.R;
import com.gemboedu.elhuarenito.databinding.ActivityCovidBinding;

public class CovidActivity extends AppCompatActivity {
    private ActivityCovidBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityCovidBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.arrowCovid.setOnClickListener(v -> {
            Intent intent = new Intent(CovidActivity.this, MainActivity.class);
            startActivity(intent);
            finish();
        });

    }
}