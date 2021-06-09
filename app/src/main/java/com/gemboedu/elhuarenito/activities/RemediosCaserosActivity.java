package com.gemboedu.elhuarenito.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Toast;

import com.gemboedu.elhuarenito.MainActivity;
import com.gemboedu.elhuarenito.R;
import com.gemboedu.elhuarenito.databinding.ActivityRemediosCaserosBinding;

public class RemediosCaserosActivity extends AppCompatActivity {
    private ActivityRemediosCaserosBinding binding;
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityRemediosCaserosBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Toolbar toolbar = findViewById(R.id.action_bar_toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(R.string.go_back);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        binding.btnPre.setOnClickListener(v -> {
            Intent intent = new Intent(RemediosCaserosActivity.this, PreventivasActivity.class);
            startActivity(intent);
        });
        binding.btnIn.setOnClickListener(v -> {
            Intent intent = new Intent(RemediosCaserosActivity.this, ProcesoActivity.class);
            startActivity(intent);
        });
        binding.btnPost.setOnClickListener(v -> {
            Intent intent = new Intent(RemediosCaserosActivity.this, PostActivity.class);
            startActivity(intent);
        });
        binding.btnManual.setOnClickListener(v -> {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1UufwDPhNw8Wo1GCrsrPyNrz-1sVlKxJk/view?usp=sharing"));
            startActivity(intent);
        });
    }
}