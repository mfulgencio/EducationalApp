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
public class IntegralsRiemannSumsTab extends Fragment {

	public IntegralsRiemannSumsTab() {
		// Required empty public constructor
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// Inflate the layout for this fragment
		View view = inflater.inflate(R.layout.integrals_riemann_sums_tab, container, false);

		Button tenthVid = (Button) view.findViewById(R.id.integrals_riemann_sums_tenth_vid_button);
		
		tenthVid.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				Intent i = new Intent(getActivity(), Videos.class);
				
				i.putExtra("videoId", "3GYv-BZYYdg");
				i.putExtra("videoTitle", "Integrals | How to Estimate the Area Under a Curve Using Riemann Sums");
				
				getActivity().startActivity(i);
			}
			
		});
		
		return view;
	}
}
