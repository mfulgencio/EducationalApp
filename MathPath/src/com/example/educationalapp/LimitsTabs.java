package com.example.educationalapp;

import android.os.Bundle;
import android.app.ActionBar;
import android.app.ActionBar.Tab;
import android.app.ActionBar.TabListener;
import android.app.Activity;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.app.ListFragment;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.ArrayAdapter;
import android.support.v4.view.PagerAdapter;

public class LimitsTabs extends FragmentActivity implements TabListener {
	ActionBar actionBar;
	ViewPager viewPager;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
    	super.onCreate(savedInstanceState);
    	setContentView(R.layout.limits_tabs_layout);
    	
    	Intent i = getIntent();
    	
    	ActionBar bar = getActionBar();
		bar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#3CC7C7")));
    	
    	viewPager = (ViewPager) findViewById(R.id.pager);
    	viewPager.setAdapter(new MyAdapter(getSupportFragmentManager()));
    	viewPager.setCurrentItem(i.getIntExtra("limits tab", 0));
    	viewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
			
			@Override
			public void onPageSelected(int arg0) {
				//Log.d("MathPath", "onPageSelected at position " + arg0);
				actionBar.setSelectedNavigationItem(arg0);
			}
			
			@Override
			public void onPageScrolled(int arg0, float arg1, int arg2) {
				//Log.d("MathPath", "onPageScrolled at position " + arg0 + " from " + arg1 + " with number of pixels = " + arg2);
				
			}
			
			@Override
			public void onPageScrollStateChanged(int arg0) {
//				if (arg0 == ViewPager.SCROLL_STATE_IDLE)
//					Log.d("MathPath", "onPageScrollStateChanged Idle");
//				if (arg0 == ViewPager.SCROLL_STATE_DRAGGING)
//					Log.d("MathPath", "onPageScrollStateChanged Dragging");
//				if (arg0 == ViewPager.SCROLL_STATE_SETTLING)
//					Log.d("MathPath", "onPageScrollStateChanged Settling");
				
			}
		});
    	
    	actionBar = getActionBar();
    	
    	ActionBar.Tab allVideosTab = actionBar.newTab();
    	allVideosTab.setText("All Videos");
    	allVideosTab.setTabListener(this);
    	
    	ActionBar.Tab introVideosTab = actionBar.newTab();
    	introVideosTab.setText("Intro to Limits");
    	introVideosTab.setTabListener(this);
    	
    	ActionBar.Tab solvingVideosTab = actionBar.newTab();
    	solvingVideosTab.setText("Solving Limits");
    	solvingVideosTab.setTabListener(this);
    	
    	ActionBar.Tab infinityVideosTab = actionBar.newTab();
    	infinityVideosTab.setText("Limits at Infinity");
    	infinityVideosTab.setTabListener(this);
    	
    	ActionBar.Tab continuityVideosTab = actionBar.newTab();
    	continuityVideosTab.setText("Continuity");
    	continuityVideosTab.setTabListener(this);
    	
    	ActionBar.Tab erTab = actionBar.newTab();
    	erTab.setText("External Resources");
    	erTab.setTabListener(this);
    	
    	actionBar.addTab(allVideosTab);
    	actionBar.addTab(introVideosTab);
    	actionBar.addTab(solvingVideosTab);
    	actionBar.addTab(infinityVideosTab);
    	actionBar.addTab(continuityVideosTab);
    	actionBar.addTab(erTab);
    	
    	actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
    	actionBar.setSelectedNavigationItem(i.getIntExtra("limits tab", 0));
    }

	@Override
	public void onTabReselected(Tab tab, FragmentTransaction ft) {
		//Log.d("MathPath", "onTabReselected at position " + tab.getPosition() + " name " + tab.getText());
		
	}

	@Override
	public void onTabSelected(Tab tab, FragmentTransaction ft) {
		//Log.d("MathPath", "onTabSelected at position " + tab.getPosition() + " name " + tab.getText());
		viewPager.setCurrentItem(tab.getPosition());
	}

	@Override
	public void onTabUnselected(Tab tab, FragmentTransaction ft) {
		//Log.d("MathPath", "onTabUnselected at position " + tab.getPosition() + " name " + tab.getText());
		
	}
}

class MyAdapter extends FragmentPagerAdapter {

	public MyAdapter(FragmentManager fm) {
		super(fm);
	}

	@Override
	public Fragment getItem(int arg0) {
		Fragment fragment = null;
		
		if (arg0 == 0)
			fragment = new LimitsAllVideosTab();
		if (arg0 == 1)
			fragment = new LimitsIntroVideosTab();
		if (arg0 == 2)
			fragment = new LimitsSolvingVideosTab();
		if (arg0 == 3)
			fragment = new LimitsAtInfinityVideosTab();
		if (arg0 == 4)
			fragment = new LimitsContinuityVideosTab();
		if (arg0 == 5)
			fragment = new LimitsERTab();
		
		return fragment;
	}

	@Override
	public int getCount() {
		return 6;
	}

}
