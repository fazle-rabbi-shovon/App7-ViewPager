package com.example.androidviewbangla;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

public class MainActivity extends FragmentActivity {

    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager = findViewById(R.id.pagerId);
        FragmentManager fragmentManager = getSupportFragmentManager();

        MyAdapter adapter = new MyAdapter(fragmentManager,0);
        viewPager.setAdapter(adapter);


    }
}

class MyAdapter extends FragmentStatePagerAdapter{

    public MyAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {

        Fragment fragment = null;
        if(position==0)
        {
            fragment = new FragmentOne();
        }
        else if(position==1)
        {
            fragment = new FragmentTwo();
        }
        else if(position==2)
        {
            fragment = new FragmentThree();
        }

        return fragment;
    }

    @Override
    public int getCount() {
        return 3;
    }
}
