package com.gemboedu.elhuarenito.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.gemboedu.elhuarenito.MainActivity;
import com.gemboedu.elhuarenito.R;
import com.gemboedu.elhuarenito.databinding.ActivityRemediosCaserosBinding;

public class RemediosCaserosActivity extends AppCompatActivity {
    private ActivityRemediosCaserosBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityRemediosCaserosBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.arrowRemedios.setOnClickListener(v -> {
            Intent intent = new Intent(RemediosCaserosActivity.this, MainActivity.class);
            startActivity(intent);
            finish();
        });
    }
}