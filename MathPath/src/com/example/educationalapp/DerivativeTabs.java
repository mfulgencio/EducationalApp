package com.example.educationalapp;

import android.os.Bundle;
import android.app.ActionBar;
import android.app.ActionBar.Tab;
import android.app.ActionBar.TabListener;
import android.app.Activity;
import android.app.FragmentTransaction;
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

public class DerivativeTabs extends FragmentActivity implements TabListener {
	ActionBar actionBar;
	ViewPager viewPager;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
    	super.onCreate(savedInstanceState);
    	setContentView(R.layout.derivatives_tabs_layout);
    	
    	viewPager = (ViewPager) findViewById(R.id.pager);
    	viewPager.setAdapter(new MyAdapter(getSupportFragmentManager()));
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
    	actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
    	
    	ActionBar.Tab videoTab = actionBar.newTab();
    	videoTab.setText("Videos");
    	videoTab.setTabListener(this);
    	
    	ActionBar.Tab introDerTab = actionBar.newTab();
    	introDerTab.setText("Intro to Derivatives");
        introDerTab.setTabListener(this);
        
    	ActionBar.Tab limitDefTab = actionBar.newTab();
    	limitDefTab.setText("Limit Definitions");
        limitDefTab.setTabListener(this);
        
    	ActionBar.Tab rulesTab = actionBar.newTab();
    	rulesTab.setText("Rules");
        rulesTab.setTabListener(this);     
        
    	ActionBar.Tab implicitDiffTab = actionBar.newTab();
    	implicitDiffTab.setText("Implicit Differentiation");
    	implicitDiffTab.setTabListener(this);
        
    	ActionBar.Tab optimizationTab = actionBar.newTab();
    	optimizationTab.setText("Optimization");
        optimizationTab.setTabListener(this);
        
    	ActionBar.Tab relatedRatesTab = actionBar.newTab();
    	relatedRatesTab.setText("Related Rates");
        relatedRatesTab.setTabListener(this);
        /*
    	ActionBar.Tab introIntegralsTab = actionBar.newTab();
    	introIntegralsTab.setText("Intro To Integrals");
    	introIntegralsTab.setTabListener(this);
        
    	ActionBar.Tab indefIntegralsTab = actionBar.newTab();
    	indefIntegralsTab.setText("Indefinite Integrals");
    	indefIntegralsTab.setTabListener(this);
        
    	ActionBar.Tab defIntegralsTab = actionBar.newTab();
    	defIntegralsTab.setText("Definite Integrals");
    	defIntegralsTab.setTabListener(this);
        
    	ActionBar.Tab relatedRatesTab = actionBar.newTab();
    	relatedRatesTab.setText("Area Under the Curve");
        relatedRatesTab.setTabListener(this);
        
    	ActionBar.Tab relatedRatesTab = actionBar.newTab();
    	relatedRatesTab.setText("U Substitution");
        relatedRatesTab.setTabListener(this);
     */
        /*
    </string-array>
    <string-array name="integrals_array">
        <item>Intro to Integrals</item>
        <item>Indefinite Integrals</item>
        <item>Definite Integrals</item>
        <item>Area Under the Curve</item>
        <item>U Substitution</item>
         */
        
    	ActionBar.Tab erTab = actionBar.newTab();
    	erTab.setText("External Resources");
    	erTab.setTabListener(this);
    	
    	actionBar.addTab(videoTab);
    	actionBar.addTab(introDerTab);
    	actionBar.addTab(limitDefTab);
    	actionBar.addTab(rulesTab);
    	actionBar.addTab(implicitDiffTab);
    	actionBar.addTab(optimizationTab);
    	actionBar.addTab(relatedRatesTab);
    	actionBar.addTab(erTab);

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

class MyDerivativesAdapter extends FragmentStatePagerAdapter {

	public MyDerivativesAdapter(FragmentManager fm) {
		super(fm);
	}

	@Override
	public Fragment getItem(int arg0) {
		Fragment fragment = null;
		

		if (arg0 == 0)
			fragment = new IntroDerTab();
        if (arg0 == 1)
        	fragment = new LimitDefTab();
        if (arg0 == 2)
        	fragment = new RulesTab();
        if (arg0 == 3)
        	fragment = new ImplicitDiffTab();
        if (arg0 == 4)
        	fragment = new OptimizationTab();
        if (arg0 == 5)
        	fragment = new RelatedRatesTab();

		return fragment;
	}

	@Override
	public int getCount() {
		return 2;
	}
	
}
