package com.example.abdul_wahab.fragmentlabtaska.fragments;


import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.abdul_wahab.fragmentlabtaska.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class F2Fragment extends Fragment {


    View view;


    public F2Fragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_f2, container, false);
        this.view = view;

        return view;
    }

    public void setFragmentBackgroundColor(int color) {

        view.setBackgroundColor(color);

    }

}
