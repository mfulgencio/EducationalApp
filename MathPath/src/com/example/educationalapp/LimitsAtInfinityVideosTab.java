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
public class LimitsAtInfinityVideosTab extends Fragment {

	public LimitsAtInfinityVideosTab() {
		// Required empty public constructor
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// Inflate the layout for this fragment
		View view = inflater.inflate(R.layout.limits_at_infinity_videos_tab, container, false);

		Button firstVid = (Button) view.findViewById(R.id.limits_at_infinity_first_vid_button);
		Button secondVid = (Button) view.findViewById(R.id.limits_at_infinity_second_vid_button);
		
		firstVid.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				Intent i = new Intent(getActivity(), Videos.class);
				
				i.putExtra("videoId", "a2Ia_ZlUCaQ");
				i.putExtra("videoTitle", "Limits | Limits at Infinity");
				
				getActivity().startActivity(i);
			}
			
		});
		
		secondVid.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				Intent i = new Intent(getActivity(), Videos.class);
				
				i.putExtra("videoId", "KcqO1fX9b_I");
				i.putExtra("videoTitle", "Limits | More Limits at Infinity");
				
				getActivity().startActivity(i);
			}
			
		});
		
		return view;
	}

}
