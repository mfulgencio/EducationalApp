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
public class DerivativesOptimizationTab extends Fragment {

	public DerivativesOptimizationTab() {
		// Required empty public constructor
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// Inflate the layout for this fragment
		View view = inflater.inflate(R.layout.derivatives_optimization_tab, container, false);

		Button firstVid = (Button) view.findViewById(R.id.derivatives_optimization_first_vid_button);
		Button secondVid = (Button) view.findViewById(R.id.derivatives_optimization_second_vid_button);
		Button thirdVid = (Button) view.findViewById(R.id.derivatives_optimization_third_vid_button);
		
		firstVid.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				Intent i = new Intent(getActivity(), Videos.class);
				
				i.putExtra("videoId", "mamH094uw_U");
				i.putExtra("videoTitle", "Derivatives | Optimization - Calculus");
				
				getActivity().startActivity(i);
			}
			
		});
		
		secondVid.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				Intent i = new Intent(getActivity(), Videos.class);
				
				i.putExtra("videoId", "Ef22yTJDUZI");
				i.putExtra("videoTitle", "Derivatives | Optimization with Calculus 1");
				
				getActivity().startActivity(i);
			}
			
		});
		
		thirdVid.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				Intent i = new Intent(getActivity(), Videos.class);
				
				i.putExtra("videoId", "3GYv-BZYYdg");
				i.putExtra("videoTitle", "Derivatives | Optimization with Calculus 2");
				
				getActivity().startActivity(i);
			}
			
		});
		
		return view;
	}

}
