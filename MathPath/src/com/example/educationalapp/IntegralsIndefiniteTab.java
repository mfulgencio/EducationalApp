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
public class IntegralsIndefiniteTab extends Fragment {

	public IntegralsIndefiniteTab() {
		// Required empty public constructor
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// Inflate the layout for this fragment
		View view = inflater.inflate(R.layout.integrals_indefinite_tab, container, false);

		Button thirdVid = (Button) view.findViewById(R.id.integrals_indefinite_third_vid_button);
		Button fourthVid = (Button) view.findViewById(R.id.integrals_indefinite_fourth_vid_button);
		Button fifthVid = (Button) view.findViewById(R.id.integrals_indefinite_fifth_vid_button);
		Button sixthVid = (Button) view.findViewById(R.id.integrals_indefinite_sixth_vid_button);
		
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
		
		return view;
	}

}
