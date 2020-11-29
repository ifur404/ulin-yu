package com.ipur.ulinyu.ui.favorit;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.ipur.ulinyu.R;

public class FavoritFragment extends Fragment {

    private FavoritViewModel FavoritViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        FavoritViewModel =
                ViewModelProviders.of(this).get(FavoritViewModel.class);
        View root = inflater.inflate(R.layout.fragment_favorit, container, false);
        final TextView textView = root.findViewById(R.id.text_favorit);
        FavoritViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}