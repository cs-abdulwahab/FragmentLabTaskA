package com.example.abdul_wahab.fragmentlabtaska;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.example.abdul_wahab.fragmentlabtaska.fragments.F1Fragment;
import com.example.abdul_wahab.fragmentlabtaska.fragments.F2Fragment;

public class MainActivity extends AppCompatActivity implements F1Fragment.IF1FragmentListener {

    private String TAG = "MTAG";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onFragmentInteraction(int color) {
        Log.d(TAG, "onFragmentInteraction() called with: color = [" + color + "]");

        F2Fragment f2Fragment = (F2Fragment) getFragmentManager().findFragmentById(R.id.fragment2);
        f2Fragment.setFragmentBackgroundColor(color);

    }
}
