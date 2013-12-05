package com.example.educationalapp;

import java.io.FileOutputStream;
import java.util.*;

import android.content.Context;
import android.util.Log;

public class MissedIntegrals {
	public double percentWrongIntroToIntegrals;
	public double percentWrongIndefiniteIntegrals;
	public double percentWrongDefiniteIntegrals;
	public double percentWrongAreaUnderTheCurve;
	public double percentWrongUSubstitution;
	public int introToIntegrals = 0, indefiniteIntegrals = 0, definiteIntegrals = 0, areaUnderTheCurve =0,
	uSubstitution = 0;
	
	private Context cx;
	
	public MissedIntegrals(Context c) 
	{
	   cx = c;	
	}
	
	public class MissedQuestion
	{
	   String video;
	   String topic;
	   public MissedQuestion(String v , String t)
	   {   
	      video = v;
	      topic = t;
	   }
	}
	
	ArrayList <MissedQuestion> missed = new ArrayList<MissedQuestion>();
	
	public void add(MissedQuestion question) {
		missed.add(question);
	}
	public void get(int index) {
		 missed.get(index);
	}
	public void clean() {
		missed.clear();
	}
	
	public void analyze() {
		double size = (double)missed.size();
		for (int i = 0; i < missed.size(); i++) {
			if (missed.get(i).topic.equals("Intro to Integrals"))
				introToIntegrals++;
			else if (missed.get(i).topic.equals("Indefinite Integrals"))
				indefiniteIntegrals++;
			else if (missed.get(i).topic.equals("Definite Integrals"))
				definiteIntegrals++;
			else if (missed.get(i).topic.equals("Area Under The Curve"))
				areaUnderTheCurve++;
			else if (missed.get(i).topic.equals("U substitution"))
				uSubstitution++;
			else
				Log.d("MathPath", "Something else:" + missed.get(i).topic);
		}
		
		percentWrongIntroToIntegrals = (introToIntegrals/size)*100.0;
	//	Log.d("MathPath", "Intro" + introToIntegrals + "/" + size + " = " + percentWrongIntroToIntegrals);
		percentWrongIndefiniteIntegrals = (indefiniteIntegrals/size)*100.0;
	//	Log.d("MathPath", "II" + indefiniteIntegrals + "/" + size + " = " + percentWrongIndefiniteIntegrals);
		percentWrongDefiniteIntegrals = (definiteIntegrals/size)*100.0;
	//	Log.d("MathPath", "DI" + definiteIntegrals + "/" + size + " = " +  percentWrongDefiniteIntegrals);
		percentWrongAreaUnderTheCurve = (areaUnderTheCurve/size)*100.0;
	//	Log.d("MathPath", "AR"  + areaUnderTheCurve + "/" + size + " = " + percentWrongAreaUnderTheCurve);
		percentWrongUSubstitution = (uSubstitution /size)*100.0;
	//	Log.d("MathPath", "U"  + uSubstitution  + "/" + size + " = " + 	percentWrongUSubstitution);
		
		double scores[] = new double[5];
		scores[0] = percentWrongIntroToIntegrals;
		scores[1]= percentWrongIndefiniteIntegrals;
		scores[2] = percentWrongDefiniteIntegrals;
		scores[3] = percentWrongAreaUnderTheCurve;
		scores[4] = percentWrongUSubstitution;
		
		String topics[] = new String[5];
		topics[0] = "Intro to Integrals";
		topics[1] = "Indefinite Integrals";
		topics[2] = "Definite Integrals";
		topics[3] = "Area Under the Curve";
		topics[4] = "U Substitution";
		
		String resultsString = "YOUR DATA FROM YOUR MOST RECENT ATTEMPT ON INTEGRALS: \n\n" + 
				"Of the questions you answered wrong: \n\n" 
				+ (int)percentWrongIntroToIntegrals + "% were on the topic '" + topics[0] + "'\n"
				+ (int)percentWrongIndefiniteIntegrals + "% were on the topic '" + topics[1] + "'\n"
				+ (int)percentWrongDefiniteIntegrals + "% were on the topic '" + topics[2] + "'\n"
				+ (int)percentWrongAreaUnderTheCurve + "% were on the topic '" + topics[3] + "'\n"
				+ (int)percentWrongUSubstitution + "% were on the topic '" + topics[4] + "'\n"
				+ "RECOMMENDATION:\n";
				
				for (int i = 0; i < scores.length; i++) {
			if (scores[i] >= 60.0)
				resultsString += "\nA big weak point seems to be " + topics[i] +". We strongly recommend you review the videos on this topic.\n";
			if (scores[i] <= 59.9 && scores[i] >= 30.0)
				resultsString += "\nA weak point seems to be " + topics[i] +". We recommend you review the videos on this topic.\n";
			if (scores[i] <= 29.9 && scores[i] >= 10.0)
				resultsString += "\nA small weak point seems to be " + topics[i] +". You may benefit from reviewing the videos on this topic.\n";
		}
		resultsString += "--------------------------------------------------------------------------------------------------";


				FileOutputStream fos;
				
				try {
			
			    fos = cx.openFileOutput("integralsResults.txt", Context.MODE_PRIVATE);
				
				fos.write(resultsString.getBytes());
				
				fos.close();
				
				
				} catch (Exception ex) {
				   System.err.println(ex);
				   ex.printStackTrace();
				}

		
		
	}

}
