package com.gemboedu.elhuarenito.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.gemboedu.elhuarenito.MainActivity;
import com.gemboedu.elhuarenito.R;
import com.gemboedu.elhuarenito.databinding.ActivityDescriptionBinding;

public class DescriptionActivity extends AppCompatActivity {
    private ActivityDescriptionBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDescriptionBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.arrowDescription.setOnClickListener(v -> {
            Intent intent = new Intent(DescriptionActivity.this, MainActivity.class);
            startActivity(intent);
            finish();
        });
    }
}