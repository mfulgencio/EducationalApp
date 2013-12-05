package com.example.educationalapp;

import java.io.*;
import java.util.*;

import android.app.Activity;
import android.content.*;
import android.util.Log;

public class MissedLimits{
	public double percentWrongSolvingLimits;
	public double percentWrongLimitsAtInfinity;
	public double percentWrongContinuity;
	public double percentWrongIntroToLimits;
	public int solvingLimits = 0, introToLimits = 0, limitsAtInfinity = 0, continuity =0;
	private Context cx;
	
	public MissedLimits(Context c) 
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
			if (missed.get(i).topic.equals("Solving Limits"))
					solvingLimits++;
			else if (missed.get(i).topic.equals("Limits at Infinity"))
				limitsAtInfinity++;
			else if (missed.get(i).topic.equals("Intro to Limits"))
				introToLimits++;
			else if (missed.get(i).topic.equals("Continuity"))
				continuity++;
//			else
//				Log.d("MathPath", "Something else:" + missed.get(i).topic);
		}
		
		percentWrongIntroToLimits = (introToLimits/size)*100.0;
		Log.d("MathPath", "Intro" + introToLimits + "/" + size + " = " + percentWrongIntroToLimits);
		percentWrongSolvingLimits = (solvingLimits/size)*100.0;
	//	Log.d("MathPath", "SL" + solvingLimits + "/" + size + " = " + percentWrongSolvingLimits);
		percentWrongLimitsAtInfinity = (limitsAtInfinity/size)*100.0;
	//	Log.d("MathPath", "LAT" + limitsAtInfinity + "/" + size + " = " +  percentWrongLimitsAtInfinity);
		percentWrongContinuity = (continuity/size)*100.0;
	//	Log.d("MathPath", "C"  + continuity + "/" + size + " = " + percentWrongContinuity);
		
		double scores[] = new double[4];
		scores[0] = percentWrongIntroToLimits;
		scores[1]= percentWrongSolvingLimits;
		scores[2] = percentWrongLimitsAtInfinity;
		scores[3] = percentWrongContinuity;
		
		String topics[] = new String[4];
		topics[0] = "Intro to Limits";
		topics[1] = "Solving Limits";
		topics[2] = "Limits at Infinity";
		topics[3] = "Continuity";
		
		String resultsString = "YOUR DATA FROM YOURE MOST RECENT ATTEMPT ON LIMITS: \n\n" + 
		"Of the questions you answered wrong: \n\n" 
		+ (int)percentWrongIntroToLimits + "% were on the topic 'Intro to Limits'\n"
		+ (int)percentWrongSolvingLimits + "% were on the topic 'Solving Limits'\n"
		+ (int)percentWrongLimitsAtInfinity + "% were on the topic 'Limits at Infinity'\n"
		+ (int)percentWrongContinuity + "% were on the topic 'Continuity'\n\n"
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
	
	    fos = cx.openFileOutput("limitsResults.txt", Context.MODE_PRIVATE);
		
		fos.write(resultsString.getBytes());
		
		fos.close();
		
		
		} catch (Exception ex) {
		   System.err.println(ex);
		   ex.printStackTrace();
		}
		
		
	}



}
