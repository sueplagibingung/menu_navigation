package com.example.menu_navigation;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class PagerAdapter extends FragmentPagerAdapter {
    int numTabs;
    public PagerAdapter(@NonNull FragmentManager fm, int numTabs) {
        super(fm);
        this.numTabs=numTabs;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new MainFragment();
            case 1:
                return new SecondFragment();
            default:
        }
        return null;
    }

    @Override
    public int getCount() {
        return numTabs;
    }

}
