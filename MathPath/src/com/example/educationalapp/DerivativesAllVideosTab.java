package com.example.educationalapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.Button;

public class DerivativesAllVideosTab extends Fragment {

	Button coursesButton;
	Button quizzesButton;
	public DerivativesAllVideosTab() {
		// Required empty public constructor
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.derivatives_all_videos_tab, container, false);

		coursesButton = (Button)view.findViewById(R.id.courses_button);
		quizzesButton = (Button)view.findViewById(R.id.quizzes_button);
		
		coursesButton.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent i = new Intent(getActivity(), MainActivity.class);
				startActivity(i);
			}
		});

		quizzesButton.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent i = new Intent(getActivity(), Quiz.class);
				
				i.putExtra("quiz", "derivativesQuiz.txt");
				i.putExtra("quiz_description", "This Quiz is on Derivatives. Pick your answers and hit submit for immediate feedback. You can take the quiz as many times as you like. Good Luck!");
				
				getActivity().startActivity(i);
			}
		});
		
		
		
		// Inflate the layout for this fragment

		Button firstVid = (Button) view.findViewById(R.id.derivatives_all_first_vid_button);
		Button secondVid = (Button) view.findViewById(R.id.derivatives_all_second_vid_button);
		Button thirdVid = (Button) view.findViewById(R.id.derivatives_all_third_vid_button);
		Button fourthVid = (Button) view.findViewById(R.id.derivatives_all_fourth_vid_button);
		Button fifthVid = (Button) view.findViewById(R.id.derivatives_all_fifth_vid_button);
		Button sixthVid = (Button) view.findViewById(R.id.derivatives_all_sixth_vid_button);
		Button seventhVid = (Button) view.findViewById(R.id.derivatives_all_seventh_vid_button);
		Button eighthVid = (Button) view.findViewById(R.id.derivatives_all_eighth_vid_button);
		Button ninthVid = (Button) view.findViewById(R.id.derivatives_all_ninth_vid_button);
		Button tenthVid = (Button) view.findViewById(R.id.derivatives_all_tenth_vid_button);
		Button eleventhVid = (Button) view.findViewById(R.id.derivatives_all_eleventh_vid_button);
		Button twelvthVid = (Button) view.findViewById(R.id.derivatives_all_twelvth_vid_button);
		Button thirteenthVid = (Button) view.findViewById(R.id.derivatives_all_thirteenth_vid_button);
		
		firstVid.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				Intent i = new Intent(getActivity(), Videos.class);
				
				i.putExtra("videoId", "ANyVpMS3HL4");
				i.putExtra("videoTitle", "Derivatives | Derivatives 1");
				
				getActivity().startActivity(i);
			}
			
		});
		
		secondVid.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				Intent i = new Intent(getActivity(), Videos.class);
				
				i.putExtra("videoId", "2wH-g60EJ18");
				i.putExtra("videoTitle", "Derivatives | Understanding the Definition of the Derivative");
				
				getActivity().startActivity(i);
			}
			
		});
		
		thirdVid.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				Intent i = new Intent(getActivity(), Videos.class);
				
				i.putExtra("videoId", "ejDWkDJni0o");
				i.putExtra("videoTitle", "Derivatives | Solving Derivatives");
				
				getActivity().startActivity(i);
			}
			
		});
		
		fourthVid.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				Intent i = new Intent(getActivity(), Videos.class);
				
				i.putExtra("videoId", "XIQ-KnsAsbg");
				i.putExtra("videoTitle", "Derivatives | The Chain Rule");
				
				getActivity().startActivity(i);
			}
			
		});
		
		fifthVid.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				Intent i = new Intent(getActivity(), Videos.class);
				
				i.putExtra("videoId", "h78GdGiRmpM");
				i.putExtra("videoTitle", "Derivatives | Product Rule");
				
				getActivity().startActivity(i);
			}
			
		});
		
		sixthVid.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				Intent i = new Intent(getActivity(), Videos.class);
				
				i.putExtra("videoId", "E_1gEtiGPNI");
				i.putExtra("videoTitle", "Derivatives | Quotient Rule");
				
				getActivity().startActivity(i);
			}
			
		});
		
		seventhVid.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				Intent i = new Intent(getActivity(), Videos.class);
				
				i.putExtra("videoId", "sL6MC-lKOrw");
				i.putExtra("videoTitle", "Derivatives | Implicit Differentiation");
				
				getActivity().startActivity(i);
			}
			
		});
		
		eighthVid.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				Intent i = new Intent(getActivity(), Videos.class);
				
				i.putExtra("videoId", "mamH094uw_U");
				i.putExtra("videoTitle", "Derivatives | Optimization - Calculus");
				
				getActivity().startActivity(i);
			}
			
		});
		
		ninthVid.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				Intent i = new Intent(getActivity(), Videos.class);
				
				i.putExtra("videoId", "Ef22yTJDUZI");
				i.putExtra("videoTitle", "Derivatives | Optimization with Calculus 1");
				
				getActivity().startActivity(i);
			}
			
		});
		
		tenthVid.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				Intent i = new Intent(getActivity(), Videos.class);
				
				i.putExtra("videoId", "3GYv-BZYYdg");
				i.putExtra("videoTitle", "Derivatives | Optimization with Calculus 2");
				
				getActivity().startActivity(i);
			}
			
		});
		
		eleventhVid.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				Intent i = new Intent(getActivity(), Videos.class);
				
				i.putExtra("videoId", "Vi5KBiXg0Co");
				i.putExtra("videoTitle", "Derivatives | Related Rates");
				
				getActivity().startActivity(i);
			}
			
		});
		
		twelvthVid.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				Intent i = new Intent(getActivity(), Videos.class);
				
				i.putExtra("videoId", "hD3U65CcZ0Q");
				i.putExtra("videoTitle", "Derivatives | Ladder Rate-of-Change Problem");
				
				getActivity().startActivity(i);
			}
			
		});
		
		thirteenthVid.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				Intent i = new Intent(getActivity(), Videos.class);
				
				i.putExtra("videoId", "6hrJGtf6z5w");
				i.putExtra("videoTitle", "Derivatives | Sphere Application of Derivatives");
				
				getActivity().startActivity(i);
			}
			
		});
		
		return view;
	}

}
