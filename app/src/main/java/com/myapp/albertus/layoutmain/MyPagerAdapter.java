package com.myapp.albertus.layoutmain;

import android.app.Fragment;
import android.app.FragmentManager;
import android.content.Context;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

public class MyPagerAdapter extends FragmentPagerAdapter{
    public List<String> fragmentsA;

    public MyPagerAdapter(FragmentManager fm) {
        super(fm);
        fragmentsA = fragments;
    }

    @Override
    public Fragment getItem(int position) {
        //return MyFragment.newInstance();
        return Fragment.instantiate(context, fragmentsA.get(position));

    }

    @Override
    public CharSequence getPageTitle(int position) {
        //return CONTENT[position % CONTENT.length].toUpperCase();
        return mEntries.get(position % Content.length).toUpperCase();
    }

    @Override
    public int getCount() {
        // return CONTENT.length;
        return mEntries.size();
    }

    @Override
    public int getItemPosition(Object object) {
        return POSITION_NONE;
    }
}
