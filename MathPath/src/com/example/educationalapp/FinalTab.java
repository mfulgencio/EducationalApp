package com.example.educationalapp;

import java.io.FileInputStream;
import java.util.Scanner;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class FinalTab extends Fragment {
	android.widget.Button finalButton;

	Context cx = getActivity();
	public FinalTab() {
		// Required empty public constructor
	}
	

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.final_tab_layout, container, false);
				
			finalButton = (android.widget.Button)view.findViewById(R.id.finalButton);
				
				finalButton.setOnClickListener(new OnClickListener() {

					@Override
					public void onClick(View v) {
						AlertDialog.Builder alertBuilder = new AlertDialog.Builder(getActivity(), AlertDialog.THEME_HOLO_LIGHT);
						
			        	alertBuilder.setTitle("Final Recommendations");
			        	String resultsMessage = "Before you take the final, take a look at the results of your most recent quiz attempts and our recommendations below.\n\n"
			        			+ "You have the option to go back and review these topics, or go ahead and take the final.\n\nIf you take the quizzes again, we'll update your information here.\n\n"
			        			+ "Good Luck!\n";
			        	
			        	try {
			        		FileInputStream fis = getActivity().openFileInput("limitsResults.txt");
			        		Scanner scan = new Scanner(fis);
			        		
			        		while (scan.hasNextLine()) {
			        		resultsMessage += "\n" + scan.nextLine();
			        		}
			        		
			        		//System.err.println(results);
			        		
			        		fis.close();
			        	} catch (Exception ex) {
			        		ex.printStackTrace();
			        	}
			        	
			        	resultsMessage += "\n\n";
			        	try {
			        		FileInputStream fis = getActivity().openFileInput("derivativesResults.txt");
			        		Scanner scan = new Scanner(fis);
			        		
			        		while (scan.hasNextLine()) {
			        		resultsMessage += "\n" + scan.nextLine();
			        		}
			        		
			        		//System.err.println(results);
			        		
			        		fis.close();
			        	} catch (Exception ex) {
			        		ex.printStackTrace();
			        	}
			        	
			        	resultsMessage += "\n\n";
			        	try {
			        		FileInputStream fis = getActivity().openFileInput("integralsResults.txt");
			        		Scanner scan = new Scanner(fis);
			        		
			        		while (scan.hasNextLine()) {
			        		resultsMessage += "\n" + scan.nextLine();
			        		}
			        		
			        		//System.err.println(results);
			        		
			        		fis.close();
			        	} catch (Exception ex) {
			        		ex.printStackTrace();
			        	}
			        	
			        	
			        	alertBuilder.setMessage(resultsMessage);
						AlertDialog results = alertBuilder.create();
						results.setButton(AlertDialog.BUTTON_POSITIVE, "Take Now", new DialogInterface.OnClickListener() {
							
							@Override
							public void onClick(DialogInterface dialog, int which) {
								Intent i = new Intent(getActivity(), Final.class);
								
								//i.putExtra("final", "limitsQuiz.txt");
								i.putExtra("final_description", "This is the final exam. Pick your answers and hit submit for immediate feedback.\n You can take the final as many times as you like. Good luck!");								
								getActivity().startActivity(i);
								
							}
						});
						results.setButton(AlertDialog.BUTTON_NEGATIVE, "Take Later", new DialogInterface.OnClickListener() {
							
							@Override
							public void onClick(DialogInterface dialog, int which) {
								
							}
						});
						results.show();
			        	
						
					}
					
				});
		
		
		// Inflate the layout for this fragment
		return view;
	}
	
		

}