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
public class DerivativesRulesTab extends Fragment {

	public DerivativesRulesTab() {
		// Required empty public constructor
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// Inflate the layout for this fragment
		View view = inflater.inflate(R.layout.derivatives_rules_tab, container, false);

		Button firstVid = (Button) view.findViewById(R.id.derivatives_rules_first_vid_button);
		Button secondVid = (Button) view.findViewById(R.id.derivatives_rules_second_vid_button);
		Button thirdVid = (Button) view.findViewById(R.id.derivatives_rules_third_vid_button);
		Button fourthVid = (Button) view.findViewById(R.id.derivatives_rules_fourth_vid_button);
		
		firstVid.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				Intent i = new Intent(getActivity(), Videos.class);
				
				i.putExtra("videoId", "ejDWkDJni0o");
				i.putExtra("videoTitle", "Derivatives | Solving Derivatives");
				
				getActivity().startActivity(i);
			}
			
		});
		
		secondVid.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				Intent i = new Intent(getActivity(), Videos.class);
				
				i.putExtra("videoId", "XIQ-KnsAsbg");
				i.putExtra("videoTitle", "Derivatives | The Chain Rule");
				
				getActivity().startActivity(i);
			}
			
		});
		
		thirdVid.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				Intent i = new Intent(getActivity(), Videos.class);
				
				i.putExtra("videoId", "h78GdGiRmpM");
				i.putExtra("videoTitle", "Derivatives | Product Rule");
				
				getActivity().startActivity(i);
			}
			
		});
		
		fourthVid.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				Intent i = new Intent(getActivity(), Videos.class);
				
				i.putExtra("videoId", "E_1gEtiGPNI");
				i.putExtra("videoTitle", "Derivatives | Quotient Rule");
				
				getActivity().startActivity(i);
			}
			
		});
		
		return view;
	}

}
