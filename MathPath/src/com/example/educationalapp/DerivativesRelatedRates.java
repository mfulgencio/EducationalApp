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
public class DerivativesRelatedRates extends Fragment {

	public DerivativesRelatedRates() {
		// Required empty public constructor
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// Inflate the layout for this fragment
		View view = inflater.inflate(R.layout.derivatives_related_rates_tab, container, false);

		Button firstVid = (Button) view.findViewById(R.id.derivatives_related_rates_first_vid_button);
		Button secondVid = (Button) view.findViewById(R.id.derivatives_related_rates_second_vid_button);
		Button thirdVid = (Button) view.findViewById(R.id.derivatives_related_rates_third_vid_button);
		
		firstVid.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				Intent i = new Intent(getActivity(), Videos.class);
				
				i.putExtra("videoId", "Vi5KBiXg0Co");
				i.putExtra("videoTitle", "Derivatives | Related Rates");
				
				getActivity().startActivity(i);
			}
			
		});
		
		secondVid.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				Intent i = new Intent(getActivity(), Videos.class);
				
				i.putExtra("videoId", "hD3U65CcZ0Q");
				i.putExtra("videoTitle", "Derivatives | Ladder Rate-of-Change Problem");
				
				getActivity().startActivity(i);
			}
			
		});
		
		thirdVid.setOnClickListener(new OnClickListener() {

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
