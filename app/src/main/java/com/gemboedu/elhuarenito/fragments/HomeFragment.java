package com.gemboedu.elhuarenito.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.gemboedu.elhuarenito.R;
import com.gemboedu.elhuarenito.activities.CovidActivity;
import com.gemboedu.elhuarenito.activities.RemediosCaserosActivity;
import com.gemboedu.elhuarenito.activities.VideosActivity;
import com.gemboedu.elhuarenito.databinding.ActivityRemediosCaserosBinding;
import com.gemboedu.elhuarenito.databinding.FragmentHomeBinding;

public class HomeFragment extends Fragment {

    private FragmentHomeBinding homeBinding;
    private Button btnCovid;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        homeBinding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = homeBinding.getRoot();

        homeBinding.btnKnowMore.setOnClickListener(v -> {
            Intent intent = new Intent(getContext(), CovidActivity.class);
            startActivity(intent);
        });

        homeBinding.btnRemediosCaseros.setOnClickListener(v -> {
            Intent intent = new Intent(getContext(), RemediosCaserosActivity.class);
            startActivity(intent);
        });
        homeBinding.btnVideos.setOnClickListener(v -> {
            Intent intent = new Intent(getContext(), VideosActivity.class);
            startActivity(intent);
        });
        homeBinding.btnEvaluation.setOnClickListener(v -> {
            Toast.makeText(getContext(), "This a Evaluation", Toast.LENGTH_SHORT).show();
        });
        return root;
    }

    private class events {

    }
}