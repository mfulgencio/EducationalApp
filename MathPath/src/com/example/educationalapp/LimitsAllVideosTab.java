package com.example.educationalapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.Button;

public class LimitsAllVideosTab extends Fragment {

	public LimitsAllVideosTab() {
		// Required empty public constructor
	}
	 
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// Inflate the layout for this fragment
		View view = inflater.inflate(R.layout.limits_all_videos_tab, container, false);

		Button firstVid = (Button) view.findViewById(R.id.limits_all_first_vid_button);
		Button secondVid = (Button) view.findViewById(R.id.limits_all_second_vid_button);
		Button thirdVid = (Button) view.findViewById(R.id.limits_all_third_vid_button);
		Button fourthVid = (Button) view.findViewById(R.id.limits_all_fourth_vid_button);
		Button fifthVid = (Button) view.findViewById(R.id.limits_all_fifth_vid_button);
		Button sixthVid = (Button) view.findViewById(R.id.limits_all_sixth_vid_button);
		Button seventhVid = (Button) view.findViewById(R.id.limits_all_seventh_vid_button);
		Button eighthVid = (Button) view.findViewById(R.id.limits_all_eighth_vid_button);
		Button ninthVid = (Button) view.findViewById(R.id.limits_all_ninth_vid_button);
		Button tenthVid = (Button) view.findViewById(R.id.limits_all_tenth_vid_button);
		
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
		
		thirdVid.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				Intent i = new Intent(getActivity(), Videos.class);
				
				i.putExtra("videoId", "GGQngIp0YGI");
				i.putExtra("videoTitle", "Limits | Limit Examples (part 1)");
				
				getActivity().startActivity(i);
			}
			
		});
		
		fourthVid.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				Intent i = new Intent(getActivity(), Videos.class);
				
				i.putExtra("videoId", "YRw8udexH4o");
				i.putExtra("videoTitle", "Limits | Limit Examples (part 2)");
				
				getActivity().startActivity(i);
			}
			
		});
		
		fifthVid.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				Intent i = new Intent(getActivity(), Videos.class);
				
				i.putExtra("videoId", "gWSDDopD9sk");
				i.putExtra("videoTitle", "Limits | Limit Examples (part 3)");
				
				getActivity().startActivity(i);
			}
			
		});
		
		sixthVid.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				Intent i = new Intent(getActivity(), Videos.class);
				
				i.putExtra("videoId", "igJdDN-DPgA");
				i.putExtra("videoTitle", "Limits | Squeeze Theorem");
				
				getActivity().startActivity(i);
			}
			
		});
		
		seventhVid.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				Intent i = new Intent(getActivity(), Videos.class);
				
				i.putExtra("videoId", "a2Ia_ZlUCaQ");
				i.putExtra("videoTitle", "Limits | Limits at Infinity");
				
				getActivity().startActivity(i);
			}
			
		});
		
		eighthVid.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				Intent i = new Intent(getActivity(), Videos.class);
				
				i.putExtra("videoId", "KcqO1fX9b_I");
				i.putExtra("videoTitle", "Limits | More Limits at Infinity");
				
				getActivity().startActivity(i);
			}
			
		});
		
		ninthVid.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				Intent i = new Intent(getActivity(), Videos.class);
				
				i.putExtra("videoId", "kdEQGfeC0SE");
				i.putExtra("videoTitle", "Limits | Limits to Define Continuity");
				
				getActivity().startActivity(i);
			}
			
		});
		
		tenthVid.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				Intent i = new Intent(getActivity(), Videos.class);
				
				i.putExtra("videoId", "nOnd3SiYZqM");
				i.putExtra("videoTitle", "Limits | One-sided Limits from Graphs");
				
				getActivity().startActivity(i);
			}
			
		});
		
		return view;
	}

}
