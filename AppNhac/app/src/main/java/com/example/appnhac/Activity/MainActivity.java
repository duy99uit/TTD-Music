package com.example.appnhac.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.widget.Toast;

import com.example.appnhac.Adapter.MainViewPagerAdapter;
import com.example.appnhac.Fragment.Fragment_Offline;
import com.example.appnhac.Fragment.Fragment_Tim_Kiem;
import com.example.appnhac.Fragment.Fragment_Trang_Chu;
import com.example.appnhac.R;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
    final  String TAG=this.getClass().getName();

    TabLayout tabLayout;
    ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        anhxa();
        init();
    }
//    boolean twice=false;
//    @Override
//    public void onBackPressed() {
//
//        Log.d(TAG,"click");
//        if(twice==true){
//            Intent intent=new Intent(Intent.ACTION_MAIN);
//            intent.addCategory(Intent.CATEGORY_HOME);
//            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
//            startActivity(intent);
//            finish();
//            System.exit(0);
//        }
//        twice =true;
//        Log.d(TAG,"twice"+twice);
//        //super.onBackPressed();
//        Toast.makeText(this, "Press BACK again to exit", Toast.LENGTH_SHORT).show();
//        new Handler().postDelayed(new Runnable() {
//            @Override
//            public void run() {
//                twice=false;
//                Log.d(TAG,"twice"+twice);
//            }
//        },2000);
//
//    }

    private void init()
    {
        MainViewPagerAdapter mainViewPagerAdapter = new MainViewPagerAdapter(getSupportFragmentManager());
        mainViewPagerAdapter.addFragment(new Fragment_Trang_Chu(), "Home");
        mainViewPagerAdapter.addFragment(new Fragment_Tim_Kiem(),"Search");
        mainViewPagerAdapter.addFragment(new Fragment_Offline(),"My Music");
        viewPager.setAdapter(mainViewPagerAdapter);
        tabLayout.setupWithViewPager(viewPager);
        tabLayout.getTabAt(0).setIcon(R.drawable.iconhomenew);
        tabLayout.getTabAt(1).setIcon(R.drawable.iconsearchnew);
        tabLayout.getTabAt(2).setIcon(R.drawable.iconmymusic);
    }
    private void anhxa()
    {
        tabLayout = findViewById(R.id.myTabLayout);
        viewPager = findViewById(R.id.myViewPager);

    }


}
