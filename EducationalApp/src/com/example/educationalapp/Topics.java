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
	
		Spinner limits_spinner = (Spinner) findViewById(R.id.limit_spinner);
		
		ArrayAdapter<CharSequence> limits_adapter = ArrayAdapter.createFromResource(this, R.array.limits_array, android.R.layout.simple_spinner_item);
		
		limits_adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		
		limits_spinner.setAdapter(limits_adapter);
	}
}
