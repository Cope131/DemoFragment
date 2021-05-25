package com.myapplicationdev.android.demofragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private Fragment fragment1 = new FragmentFirst();
    private Fragment fragment2 = new FragmentSecond();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addFragments();
    }

    private void addFragments() {
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.frame1, fragment1)
                .replace(R.id.frame2, fragment2)
                .commit();
    }
}