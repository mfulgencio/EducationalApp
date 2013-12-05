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
public class DerivativesIntroTab extends Fragment {

	public DerivativesIntroTab() {
		// Required empty public constructor
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// Inflate the layout for this fragment
		View view = inflater.inflate(R.layout.derivatives_intro_tab, container, false);

		Button firstVid = (Button) view.findViewById(R.id.derivatives_intro_first_vid_button);
		
		firstVid.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				Intent i = new Intent(getActivity(), Videos.class);
				
				i.putExtra("videoId", "ANyVpMS3HL4");
				i.putExtra("videoTitle", "Derivatives | Derivatives 1");
				
				getActivity().startActivity(i);
			}
			
		});
		
		return view;
	}


}
