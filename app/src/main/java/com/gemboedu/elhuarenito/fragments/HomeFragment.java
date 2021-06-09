package com.gemboedu.elhuarenito.fragments;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.gemboedu.elhuarenito.activities.CovidActivity;
import com.gemboedu.elhuarenito.activities.RemediosCaserosActivity;
import com.gemboedu.elhuarenito.activities.VideosActivity;
import com.gemboedu.elhuarenito.databinding.FragmentHomeBinding;

public class HomeFragment extends Fragment {

    private FragmentHomeBinding homeBinding;
    private Button btnCovid;
    private final String url1 = "https://es.educaplay.com/recursos-educativos/9547417-las_plantas_medicinales.html";
    private final String url2 = "https://es.educaplay.com/recursos-educativos/9591679-crucigrama_plantas_medicinales.html";

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
        homeBinding.btnEvaluation1.setOnClickListener(v -> {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url1));
            startActivity(intent);
        });
        homeBinding.btnEvaluation2.setOnClickListener(v -> {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url2));
            startActivity(intent);
        });
        return root;
    }

    private class events {

    }
}