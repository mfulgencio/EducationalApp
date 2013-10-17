package com.example.educationalapp;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class Topics  extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.topics);
	
		//limits spinner
		Spinner limits_spinner = (Spinner) findViewById(R.id.limit_spinner);
		
		ArrayAdapter<CharSequence> limits_adapter = ArrayAdapter.createFromResource(this, R.array.limits_array, android.R.layout.simple_spinner_item);
		
		limits_adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		
		limits_spinner.setAdapter(limits_adapter);
		
		//derivatives spinner
		Spinner derivatives_spinner = (Spinner) findViewById(R.id.derivatives_spinner);
		
		ArrayAdapter<CharSequence> derivatives_adapter = ArrayAdapter.createFromResource(this, R.array.derivatives_array, android.R.layout.simple_spinner_item);
		
		derivatives_adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		
		derivatives_spinner.setAdapter(derivatives_adapter);
		
		//integrals spinner
				Spinner integrals_spinner = (Spinner) findViewById(R.id.integrals_spinner);
				
				ArrayAdapter<CharSequence> integrals_adapter = ArrayAdapter.createFromResource(this, R.array.integrals_array, android.R.layout.simple_spinner_item);
				
				integrals_adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
				
				integrals_spinner.setAdapter(integrals_adapter);
	}
}
