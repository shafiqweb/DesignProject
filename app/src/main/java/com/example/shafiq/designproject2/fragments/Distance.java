package com.example.shafiq.designproject2.fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.example.shafiq.designproject2.R;
import com.example.shafiq.designproject2.activities.SpecificServiceActivity;

public class Distance extends Fragment {
    Button idButtonNextFragment;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.distance,container,false);
        idButtonNextFragment = view.findViewById(R.id.idButtonNextFragment);
        idButtonNextFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TabLayout tabs = (TabLayout) ((SpecificServiceActivity) getActivity()).findViewById(R.id.distance_ratingsTabs);
                tabs.getTabAt(1).select();
                Toast.makeText(getActivity(),"oh",Toast.LENGTH_SHORT).show();
            }
        });
        return view;
    }
}
