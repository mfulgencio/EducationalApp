package com.example.educationalapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class Topics  extends Activity implements OnClickListener {
	android.widget.Button limitsGoButton;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.topics);
	
		//limits spinner
		Spinner limits_spinner = (Spinner) findViewById(R.id.limit_spinner);
		
		ArrayAdapter<CharSequence> limits_adapter = ArrayAdapter.createFromResource(this, R.array.limits_array, R.layout.custom_spinner_list);
		
		limits_adapter.setDropDownViewResource(R.layout.custom_spinner);
		
		limits_spinner.setAdapter(limits_adapter);
		
		//derivatives spinner
		Spinner derivatives_spinner = (Spinner) findViewById(R.id.derivatives_spinner);
		
		ArrayAdapter<CharSequence> derivatives_adapter = ArrayAdapter.createFromResource(this, R.array.derivatives_array, R.layout.custom_spinner_list);
		
		derivatives_adapter.setDropDownViewResource(R.layout.custom_spinner);
		
		derivatives_spinner.setAdapter(derivatives_adapter);
		
		//integrals spinner
		Spinner integrals_spinner = (Spinner) findViewById(R.id.integrals_spinner);
		
		ArrayAdapter<CharSequence> integrals_adapter = ArrayAdapter.createFromResource(this, R.array.integrals_array,R.layout.custom_spinner_list);
		
		integrals_adapter.setDropDownViewResource(R.layout.custom_spinner);
		
		integrals_spinner.setAdapter(integrals_adapter);
		
		limitsGoButton = (android.widget.Button)findViewById(R.id.button1);
		
		limitsGoButton.setOnClickListener(this);
	}
	
	@Override
	public void onClick(View v) {
		Intent i = new Intent(this, Videos.class);
		
		this.startActivity(i);
		
	}
	
}
