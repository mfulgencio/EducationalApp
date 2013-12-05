package com.example.educationalapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.Button;

/**
 * A simple {@link android.support.v4.app.Fragment} subclass.
 * 
 */
public class LimitsIntroVideosTab extends Fragment {

	public LimitsIntroVideosTab() {
		// Required empty public constructor
	}
	 
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// Inflate the layout for this fragment
		View view = inflater.inflate(R.layout.limits_intro_videos_tab, container, false);

		Button firstVid = (Button) view.findViewById(R.id.limits_intro_first_vid_button);
		Button secondVid = (Button) view.findViewById(R.id.limits_intro_second_vid_button);
		
		firstVid.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				Intent i = new Intent(getActivity(), Videos.class);
				
				i.putExtra("videoId", "W0VWO4asgmk");
				i.putExtra("videoTitle", "Limits | Introduction to Limits");
				
				getActivity().startActivity(i);
			}
			
		});
		
		secondVid.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				Intent i = new Intent(getActivity(), Videos.class);
				
				i.putExtra("videoId", "gp5efC2n0iM");
				i.putExtra("videoTitle", "Limits | 1.1 Introduction to Limits");
				
				getActivity().startActivity(i);
			}
			
		});
		
		return view;
	}
}
