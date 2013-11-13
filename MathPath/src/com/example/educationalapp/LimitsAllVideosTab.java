package com.example.educationalapp;

import android.os.Bundle;
import android.view.View;

import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.ViewGroup;

public class LimitsAllVideosTab extends Fragment {

	public LimitsAllVideosTab() {
		// Required empty public constructor
	}

	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		
		// Inflate the layout for this fragment
		return inflater.inflate(R.layout.limits_all_videos_tab, container, false);
		
		
	}

}
