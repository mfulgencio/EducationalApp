package com.example.educationalapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.Button;

public class IntegralsAllVideosTab extends Fragment {

	public IntegralsAllVideosTab() {
		// Required empty public constructor
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// Inflate the layout for this fragment
		View view = inflater.inflate(R.layout.integrals_all_videos_tab, container, false);

		Button firstVid = (Button) view.findViewById(R.id.integrals_all_first_vid_button);
		Button secondVid = (Button) view.findViewById(R.id.integrals_all_second_vid_button);
		Button thirdVid = (Button) view.findViewById(R.id.integrals_all_third_vid_button);
		Button fourthVid = (Button) view.findViewById(R.id.integrals_all_fourth_vid_button);
		Button fifthVid = (Button) view.findViewById(R.id.integrals_all_fifth_vid_button);
		Button sixthVid = (Button) view.findViewById(R.id.integrals_all_sixth_vid_button);
		Button seventhVid = (Button) view.findViewById(R.id.integrals_all_seventh_vid_button);
		Button eighthVid = (Button) view.findViewById(R.id.integrals_all_eighth_vid_button);
		Button ninthVid = (Button) view.findViewById(R.id.integrals_all_ninth_vid_button);
		Button tenthVid = (Button) view.findViewById(R.id.integrals_all_tenth_vid_button);
		Button eleventhVid = (Button) view.findViewById(R.id.integrals_all_eleventh_vid_button);
		Button twelvthVid = (Button) view.findViewById(R.id.integrals_all_twelvth_vid_button);
		Button thirteenthVid = (Button) view.findViewById(R.id.integrals_all_thirteenth_vid_button);
		
		firstVid.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				Intent i = new Intent(getActivity(), Videos.class);
				
				i.putExtra("videoId", "RjLkuYtxCrc");
				i.putExtra("videoTitle", "Integrals | Integrals");
				
				getActivity().startActivity(i);
			}
			
		});
		
		secondVid.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				Intent i = new Intent(getActivity(), Videos.class);
				
				i.putExtra("videoId", "xRspb-iev-g");
				i.putExtra("videoTitle", "Integrals | The Indefinite Integral or Anti-Derivative");
				
				getActivity().startActivity(i);
			}
			
		});
		
		thirdVid.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				Intent i = new Intent(getActivity(), Videos.class);
				
				i.putExtra("videoId", "mHvSYRUEWnE");
				i.putExtra("videoTitle", "Integrals | Indefinite Integrals (part II)");
				
				getActivity().startActivity(i);
			}
			
		});
		
		fourthVid.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				Intent i = new Intent(getActivity(), Videos.class);
				
				i.putExtra("videoId", "77-najNh4iY");
				i.putExtra("videoTitle", "Integrals | Indefinite Integrals (part III)");
				
				getActivity().startActivity(i);
			}
			
		});
		
		fifthVid.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				Intent i = new Intent(getActivity(), Videos.class);
				
				i.putExtra("videoId", "VJ9VRUDQyK8");
				i.putExtra("videoTitle", "Integrals | Indefinite Integrals (part IV)");
				
				getActivity().startActivity(i);
			}
			
		});
		
		sixthVid.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				Intent i = new Intent(getActivity(), Videos.class);
				
				i.putExtra("videoId", "Pra6r20geXU");
				i.putExtra("videoTitle", "Integrals | Indefinite Ingrals (part V)");
				
				getActivity().startActivity(i);
			}
			
		});
		
		seventhVid.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				Intent i = new Intent(getActivity(), Videos.class);
				
				i.putExtra("videoId", "0RdI3-8G4Fs");
				i.putExtra("videoTitle", "Integrals | Introduction to Definite Integrals");
				
				getActivity().startActivity(i);
			}
			
		});
		
		eighthVid.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				Intent i = new Intent(getActivity(), Videos.class);
				
				i.putExtra("videoId", "6PaFm_Je5A0");
				i.putExtra("videoTitle", "Integrals | Definite Integrals (part II)");
				
				getActivity().startActivity(i);
			}
			
		});
		
		ninthVid.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				Intent i = new Intent(getActivity(), Videos.class);
				
				i.putExtra("videoId", "7wUHJ7JQ-gs");
				i.putExtra("videoTitle", "Integrals | Definite Integrals (part III): Area Under a Curve");
				
				getActivity().startActivity(i);
			}
			
		});
		
		tenthVid.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				Intent i = new Intent(getActivity(), Videos.class);
				
				i.putExtra("videoId", "3GYv-BZYYdg");
				i.putExtra("videoTitle", "Integrals | How to Estimate the Area Under a Curve Using Riemann Sums");
				
				getActivity().startActivity(i);
			}
			
		});
		
		eleventhVid.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				Intent i = new Intent(getActivity(), Videos.class);
				
				i.putExtra("videoId", "HHSepCzP56M");
				i.putExtra("videoTitle", "Integrals | U-Substitution");
				
				getActivity().startActivity(i);
			}
			
		});
		
		twelvthVid.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				Intent i = new Intent(getActivity(), Videos.class);
				
				i.putExtra("videoId", "b76wePnIBdU");
				i.putExtra("videoTitle", "Integrals | U-Substitution");
				
				getActivity().startActivity(i);
			}
			
		});
		
		thirteenthVid.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				Intent i = new Intent(getActivity(), Videos.class);
				
				i.putExtra("videoId", "qclrs-1rpKI");
				i.putExtra("videoTitle", "Integrals | Integration Using U-Substitution");
				
				getActivity().startActivity(i);
			}
			
		});
		
		return view;
	}

}
