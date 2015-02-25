package com.appzone.odu.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.appzone.odu.fragment.GamesFragment;
import com.appzone.odu.fragment.MoviesFragment;
import com.appzone.odu.fragment.TopRatedFragment;

public class TabsPagerAdapter extends FragmentPagerAdapter {

    public TabsPagerAdapter(FragmentManager fm) {
        super(fm);
    }
    @Override
    public Fragment getItem(int i) {
        switch (i) {
            case 0:
                // Top Rated fragment activity
                return new TopRatedFragment();
            case 1:
                // Games fragment activity
                return new GamesFragment();
            case 2:
                // Movies fragment activity
                return new MoviesFragment();
        }

        return null;
    }

    @Override
    public int getCount() {
        // get item count - equal to number of tabs
        return 3;
    }
}
