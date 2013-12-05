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
public class IntegralsUSubstitutionTab extends Fragment {

	public IntegralsUSubstitutionTab() {
		// Required empty public constructor
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// Inflate the layout for this fragment
		View view = inflater.inflate(R.layout.integrals_u_substitution_tab, container, false);
		
		Button eleventhVid = (Button) view.findViewById(R.id.integrals_u_substitution_eleventh_vid_button);
		Button twelvthVid = (Button) view.findViewById(R.id.integrals_u_substitution_twelvth_vid_button);
		Button thirteenthVid = (Button) view.findViewById(R.id.integrals_u_substitution_thirteenth_vid_button);
		
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
