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

public class IntegralsTabs extends FragmentActivity implements TabListener {
	ActionBar actionBar;
	ViewPager viewPager;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
    	super.onCreate(savedInstanceState);
    	setContentView(R.layout.integrals_tabs_layout);
    	
    	Intent i = getIntent();
    	
    	ActionBar bar = getActionBar();
		bar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#3CC7C7")));
    	
    	viewPager = (ViewPager) findViewById(R.id.pager);
    	viewPager.setAdapter(new MyIntegralsAdapter(getSupportFragmentManager()));
    	viewPager.setCurrentItem(i.getIntExtra("integrals tab", 0));
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
    	
    	ActionBar.Tab videoTab = actionBar.newTab();
    	videoTab.setText("Videos");
    	videoTab.setTabListener(this);
        
    	ActionBar.Tab introIntegralsTab = actionBar.newTab();
    	introIntegralsTab.setText("Intro To Integrals");
    	introIntegralsTab.setTabListener(this);
        
    	ActionBar.Tab indefIntegralsTab = actionBar.newTab();
    	indefIntegralsTab.setText("Indefinite Integrals");
    	indefIntegralsTab.setTabListener(this);
        
    	ActionBar.Tab defIntegralsTab = actionBar.newTab();
    	defIntegralsTab.setText("Definite Integrals");
    	defIntegralsTab.setTabListener(this);
        
    	ActionBar.Tab areaUnderCurveTab = actionBar.newTab();
    	areaUnderCurveTab.setText("Area Under the Curve");
    	areaUnderCurveTab.setTabListener(this);
        
    	ActionBar.Tab uSubstitutionTab = actionBar.newTab();
    	uSubstitutionTab.setText("U Substitution");
    	uSubstitutionTab.setTabListener(this);
    
        
    	ActionBar.Tab erTab = actionBar.newTab();
    	erTab.setText("External Resources");
    	erTab.setTabListener(this);
    	
    	actionBar.addTab(videoTab);
    	actionBar.addTab(introIntegralsTab);
    	actionBar.addTab(indefIntegralsTab);
    	actionBar.addTab(defIntegralsTab);
    	actionBar.addTab(areaUnderCurveTab);
    	actionBar.addTab(uSubstitutionTab);
    	actionBar.addTab(erTab);
    	
    	actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
    	actionBar.setSelectedNavigationItem(i.getIntExtra("integrals tab", 0));
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

class MyIntegralsAdapter extends FragmentStatePagerAdapter {

	public MyIntegralsAdapter(FragmentManager fm) {
		super(fm);
	}

	@Override
	public Fragment getItem(int arg0) {
		Fragment fragment = null;
		
		if (arg0 == 0)
			fragment = new DerivativesAllVideosTab();
		if (arg0 == 1)
			fragment = new IntroIntegralsTab();
	    if (arg0 == 2)
	    	fragment = new IndefIntegralsTab();
	    if (arg0 == 3)
	    	fragment = new DefIntegralsTab();
	    if (arg0 == 4)
	    	fragment = new AreaUnderCurveTab();
	    if (arg0 == 5)
	    	fragment = new USubstitutionTab();
	    if (arg0 == 6)
	    	fragment = new DerivativesERTab();
	
			return fragment;
	}

	@Override
	public int getCount() {
		return 7;
	}
	
}
