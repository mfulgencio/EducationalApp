package com.example.educationalapp;

import java.io.FileOutputStream;
import java.util.*;

import android.content.Context;
import android.util.Log;

public class MissedDerivatives {
	public double percentWrongIntroToDerivatives;
	public double percentWrongLimitDefinitions;
	public double percentWrongRules;
	public double percentWrongImplicitDifferentation;
	public double percentWrongOptimization;
	public double percentWrongRelatedRates;
	public int introToDerivatives = 0, limitDefintions = 0, rules = 0, implicitDifferentiation =0,
			optimization = 0, relatedRates = 0;
	private Context cx;
	
	public MissedDerivatives(Context c) 
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
//		double introToDerivatives = 0, limitDefintions = 0, rules = 0, implicitDifferentiation =0,
//		optimization = 0, relatedRates = 0;
		double size = (double)missed.size();
		for (int i = 0; i < missed.size(); i++) {
			if (missed.get(i).topic.equals("Intro to Derivatives"))
				introToDerivatives++;
			else if (missed.get(i).topic.equals("Limit Definitions"))
				limitDefintions++;
			else if (missed.get(i).topic.equals("Rules"))
				 rules++;
			else if (missed.get(i).topic.equals("Implicit Differentiation"))
				implicitDifferentiation++;
			else if (missed.get(i).topic.equals("Optimization"))
				optimization++;
			else if (missed.get(i).topic.equals("Related Rates"))
				relatedRates++;
			else
				Log.d("MathPath", "Something else:" + missed.get(i).topic);
		}
		
		percentWrongIntroToDerivatives = (introToDerivatives/size)*100.0;
	//	Log.d("MathPath", "Intro" + introToDerivatives + "/" + size + " = " + percentWrongIntroToDerivatives);
		percentWrongLimitDefinitions = (limitDefintions/size)*100.0;
	//	Log.d("MathPath", "LD" + limitDefintions + "/" + size + " = " + percentWrongLimitDefinitions);
		percentWrongRules= (rules/size)*100.0;
	//	Log.d("MathPath", "Rules" + rules + "/" + size + " = " +  percentWrongRules);
		percentWrongImplicitDifferentation = (implicitDifferentiation/size)*100.0;
	//	Log.d("MathPath", "ID"  + implicitDifferentiation + "/" + size + " = " + percentWrongImplicitDifferentation);
		percentWrongOptimization = (optimization/size)*100.0;
	//	Log.d("MathPath", "Op"  + optimization + "/" + size + " = " + percentWrongOptimization);
		percentWrongRelatedRates = (relatedRates/size)*100.0;
	//	Log.d("MathPath", "RR"  + relatedRates + "/" + size + " = " + 	percentWrongRelatedRates);
		
		
		double scores[] = new double[6];
		scores[0] = percentWrongIntroToDerivatives;
		scores[1]= percentWrongLimitDefinitions;
		scores[2] = percentWrongRules;
		scores[3] = percentWrongImplicitDifferentation;
		scores[4] = percentWrongOptimization;
		scores[5] = percentWrongRelatedRates;
		
		String topics[] = new String[6];
		topics[0] = "Intro to Derivatives";
		topics[1] = "Limit Definitions";
		topics[2] = "Rules";
		topics[3] = "Implicit Differentiation";
		topics[4] = "Optimization";
		topics[5] = "Related Rates";
		
		int right = 10 - (introToDerivatives + limitDefintions + rules + implicitDifferentiation + 
			optimization  + relatedRates);
		
		String resultsString = "YOUR DATA FROM YOUR MOST RECENT ATTEMPT ON DERIVATIVES:\nGRADE: " + right*10 + "%\n\n" + 
				"Of the questions you answered wrong: \n\n" 
				+ (int)percentWrongIntroToDerivatives + "% were on the topic 'Intro to Derivatives'\n"
				+ (int)percentWrongLimitDefinitions + "% were on the topic 'Limit Definitions'\n"
				+ (int)percentWrongRules + "% were on the topic 'Rules'\n"
				+ (int)percentWrongImplicitDifferentation + "% were on the topic 'Implcitit Differentiation'\n"
				+ (int)percentWrongOptimization + "% were on the topic 'Optimization'\n"
				+ (int)percentWrongRelatedRates + "% were on the topic 'Related Rates'\n\n"
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
			
			    fos = cx.openFileOutput("derivativesResults.txt", Context.MODE_PRIVATE);
				
				fos.write(resultsString.getBytes());
				
				fos.close();
				
				
				} catch (Exception ex) {
				   System.err.println(ex);
				   ex.printStackTrace();
				}

		
	}

}
