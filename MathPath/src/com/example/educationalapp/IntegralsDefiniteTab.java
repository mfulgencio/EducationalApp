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
public class IntegralsDefiniteTab extends Fragment {

	public IntegralsDefiniteTab() {
		// Required empty public constructor
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// Inflate the layout for this fragment
		View view = inflater.inflate(R.layout.integrals_definite_tab, container, false);
		
		Button seventhVid = (Button) view.findViewById(R.id.integrals_definite_seventh_vid_button);
		Button eighthVid = (Button) view.findViewById(R.id.integrals_definite_eighth_vid_button);
		Button ninthVid = (Button) view.findViewById(R.id.integrals_definite_ninth_vid_button);
		
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
		
		return view;
	}

}
