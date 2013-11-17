package com.example.educationalapp;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class Topics extends Activity {
	android.widget.Button limitsGoButton, derivativesGoButton, integralsGoButton;
	android.widget.Button limitsQuizButton, derivativesQuizButton, integralsQuizButton;
	Spinner limits_spinner, derivatives_spinner, integrals_spinner;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.topics);
		
		ActionBar bar = getActionBar();
		bar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#3CC7C7")));
	
		//limits spinner
		limits_spinner = (Spinner) findViewById(R.id.limit_spinner);
		
		ArrayAdapter<CharSequence> limits_adapter = ArrayAdapter.createFromResource(this, R.array.limits_array, R.layout.custom_spinner_list);
		
		limits_adapter.setDropDownViewResource(R.layout.custom_spinner);
		
		limits_spinner.setAdapter(limits_adapter);
		
		limitsGoButton = (android.widget.Button)findViewById(R.id.button1);
		
		limitsGoButton.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				Intent i = new Intent(Topics.this, LimitsTabs.class);
				
				i.putExtra("limits tab", limits_spinner.getSelectedItemPosition() + 1);
				
				Topics.this.startActivity(i);
			}
			
		});
		
		limitsQuizButton = (android.widget.Button)findViewById(R.id.limitsQuizButton);
		
		limitsQuizButton.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				Intent i = new Intent(Topics.this, Quiz.class);
				
				i.putExtra("quiz", "limitQuiz.txt");
				
				Topics.this.startActivity(i);
			}
			
		});
		
		//derivatives spinner
		derivatives_spinner = (Spinner) findViewById(R.id.derivatives_spinner);
		
		ArrayAdapter<CharSequence> derivatives_adapter = ArrayAdapter.createFromResource(this, R.array.derivatives_array, R.layout.custom_spinner_list);
		
		derivatives_adapter.setDropDownViewResource(R.layout.custom_spinner);
		
		derivatives_spinner.setAdapter(derivatives_adapter);
		
		derivativesGoButton = (android.widget.Button)findViewById(R.id.button2);
		
		derivativesGoButton.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				Intent i = new Intent(Topics.this, DerivativesTabs.class);
				
				i.putExtra("derivatives tab", derivatives_spinner.getSelectedItemPosition());
				
				Topics.this.startActivity(i);
			}
			
		});
		
		derivativesQuizButton = (android.widget.Button)findViewById(R.id.derivativesQuizButton);
		
		derivativesQuizButton.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				Intent i = new Intent(Topics.this, Quiz.class);
				
				i.putExtra("quiz", "derivativesQuiz.txt");
				
				Topics.this.startActivity(i);
			}
			
		});
		
		//integrals spinner
		integrals_spinner = (Spinner) findViewById(R.id.integrals_spinner);
		
		ArrayAdapter<CharSequence> integrals_adapter = ArrayAdapter.createFromResource(this, R.array.integrals_array,R.layout.custom_spinner_list);
		
		integrals_adapter.setDropDownViewResource(R.layout.custom_spinner);
		
		integrals_spinner.setAdapter(integrals_adapter);
		
//		integralsGoButton = (android.widget.Button)findViewById(R.id.button3);
//		
//		integralsGoButton.setOnClickListener(new OnClickListener() {
//
//			@Override
//			public void onClick(View v) {
//				Intent i = new Intent(Topics.this, IntegralsTabs.class);
//				
//				i.putExtra("integrals tab", integrals_spinner.getSelectedItemPosition());
//				
//				Topics.this.startActivity(i);
//			}
//			
//		});
		
		integralsQuizButton = (android.widget.Button)findViewById(R.id.integralsQuizButton);
		
		integralsQuizButton.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				Intent i = new Intent(Topics.this, Quiz.class);
				
				i.putExtra("quiz", "integralsQuiz.txt");
				
				Topics.this.startActivity(i);
			}
			
		});
	}
}
