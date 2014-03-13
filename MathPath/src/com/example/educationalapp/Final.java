package com.example.educationalapp;
import java.util.Scanner; 
import java.io.InputStream;
import java.util.ArrayList;

import android.app.ActionBar;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;

public class Final extends Activity {

	private class Question
	{
	   String question;
	   String answer;
	   String response;
	   String[] possibles;
	   String video;
	   String topic;
	   public Question(String q , String a , String[] p , String v , String t)
	   {
	      question = q;
	      answer = a;
	      possibles = p;
	      video = v;
	      topic = t;
	   }
	}
	private ArrayList<Question> qList = new ArrayList<Question>(); 
	private ArrayList<Question> madeList = new ArrayList<Question>();
	private final int NUM_ANSWERS = 4;
	private final int NUM_QUESTIONS = 30;
	private final Context context = this;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
	
		super.onCreate(savedInstanceState);
		setContentView(R.layout.finallayout);
		
		Intent i = getIntent();
		
		ActionBar bar = getActionBar();
		
		bar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#008fd5")));
		bar.setDisplayHomeAsUpEnabled(true);
		
		//setup the dialog about what they should review from their previous missed quizzes
		
		getQuestions();	
		createQuiz();
		displayQuiz();
	    addListener();
	}
	private void getQuestions()
	{
	   try {
	      Scanner scan = new Scanner(readFile("limitsQuiz.txt"));
	      String question, answer, video, topic;
	      while(scan.hasNextLine())
	      {
	         question = scan.nextLine();
	         answer = scan.nextLine();
	         String[] possibles = new String[NUM_ANSWERS];
	         for(int i = 0; i < possibles.length; i++)
	            possibles[i] = scan.nextLine();
	         video = scan.nextLine();
	         topic = scan.nextLine();
	         qList.add(new Question(question,answer,possibles,video,topic));
          }
	      scan = new Scanner(readFile("derivativesQuiz.txt"));
	      while(scan.hasNextLine())
	      {
	         question = scan.nextLine();
	         answer = scan.nextLine();
	         String[] possibles = new String[NUM_ANSWERS];
	         for(int i = 0; i < possibles.length; i++)
	            possibles[i] = scan.nextLine();
	         video = scan.nextLine();
	         topic = scan.nextLine();
	         qList.add(new Question(question,answer,possibles,video,topic));
          }
	      scan = new Scanner(readFile("integralsQuiz.txt"));
	      while(scan.hasNextLine())
	      {
	         question = scan.nextLine();
	         answer = scan.nextLine();
	         String[] possibles = new String[NUM_ANSWERS];
	         for(int i = 0; i < possibles.length; i++)
	            possibles[i] = scan.nextLine();
	         video = scan.nextLine();
	         topic = scan.nextLine();
	         qList.add(new Question(question,answer,possibles,video,topic));
          }
	   } catch (Exception ex) {
	      System.err.println("Error reading the file...");
	      ex.printStackTrace();
	   }
	      
	}
	private void createQuiz()
	{ 
	   ArrayList<Integer> questionNums = new ArrayList<Integer>(); 
	   while(questionNums.size() < NUM_QUESTIONS/3)
	   {
		   int ran = (int)(Math.random() * 20);
		   if(!questionNums.contains(ran))
			   questionNums.add(ran);
	   }
	   for(int i = 0; i < NUM_QUESTIONS/3; i++)
	   {
		   madeList.add(qList.get(questionNums.get(i)));	   
	   }
	   questionNums.clear();
	   
	   while(questionNums.size() < NUM_QUESTIONS/3)
	   {
		   int ran = (int)((Math.random() * 20) + 20);
		   if(!questionNums.contains(ran))
			   questionNums.add(ran);
	   }
	   for(int i = 0; i < NUM_QUESTIONS/3; i++)
	   {
		   madeList.add(qList.get(questionNums.get(i)));	   
	   }
	   questionNums.clear();
	   
	   while(questionNums.size() < NUM_QUESTIONS/3)
	   {
		   int ran = (int)((Math.random() * 20) + 40);
		   if(!questionNums.contains(ran))
			   questionNums.add(ran);
	   }
	   for(int i = 0; i < NUM_QUESTIONS/3; i++)
	   {
		   madeList.add(qList.get(questionNums.get(i)));	   
	   }
	}
	private void displayQuiz()
	{
	   ArrayList<TextView> listOfQuestions = new ArrayList<TextView>();
	   ArrayList<RadioButton> listOfButtons = new ArrayList<RadioButton>();
	   
	   listOfQuestions.add((TextView)findViewById(R.id.fquiz_question1));
	   listOfQuestions.add((TextView)findViewById(R.id.fquiz_question2));
	   listOfQuestions.add((TextView)findViewById(R.id.fquiz_question3));
	   listOfQuestions.add((TextView)findViewById(R.id.fquiz_question4));
	   listOfQuestions.add((TextView)findViewById(R.id.fquiz_question5));
	   listOfQuestions.add((TextView)findViewById(R.id.fquiz_question6));
	   listOfQuestions.add((TextView)findViewById(R.id.fquiz_question7));
	   listOfQuestions.add((TextView)findViewById(R.id.fquiz_question8));
	   listOfQuestions.add((TextView)findViewById(R.id.fquiz_question9));
	   listOfQuestions.add((TextView)findViewById(R.id.fquiz_question10));
	   listOfQuestions.add((TextView)findViewById(R.id.fquiz_question11));
	   listOfQuestions.add((TextView)findViewById(R.id.fquiz_question12));
	   listOfQuestions.add((TextView)findViewById(R.id.fquiz_question13));
	   listOfQuestions.add((TextView)findViewById(R.id.fquiz_question14));
	   listOfQuestions.add((TextView)findViewById(R.id.fquiz_question15));
	   listOfQuestions.add((TextView)findViewById(R.id.fquiz_question16));
	   listOfQuestions.add((TextView)findViewById(R.id.fquiz_question17));
	   listOfQuestions.add((TextView)findViewById(R.id.fquiz_question18));
	   listOfQuestions.add((TextView)findViewById(R.id.fquiz_question19));
	   listOfQuestions.add((TextView)findViewById(R.id.fquiz_question20));
	   listOfQuestions.add((TextView)findViewById(R.id.fquiz_question21));
	   listOfQuestions.add((TextView)findViewById(R.id.fquiz_question22));
	   listOfQuestions.add((TextView)findViewById(R.id.fquiz_question23));
	   listOfQuestions.add((TextView)findViewById(R.id.fquiz_question24));
	   listOfQuestions.add((TextView)findViewById(R.id.fquiz_question25));
	   listOfQuestions.add((TextView)findViewById(R.id.fquiz_question26));
	   listOfQuestions.add((TextView)findViewById(R.id.fquiz_question27));
	   listOfQuestions.add((TextView)findViewById(R.id.fquiz_question28));
	   listOfQuestions.add((TextView)findViewById(R.id.fquiz_question29));
	   listOfQuestions.add((TextView)findViewById(R.id.fquiz_question30));
	  
	   
	   listOfButtons.add((RadioButton)findViewById(R.id.fq1a1));
	   listOfButtons.add((RadioButton)findViewById(R.id.fq1a2));
	   listOfButtons.add((RadioButton)findViewById(R.id.fq1a3));
	   listOfButtons.add((RadioButton)findViewById(R.id.fq1a4));
	   listOfButtons.add((RadioButton)findViewById(R.id.fq2a1));
	   listOfButtons.add((RadioButton)findViewById(R.id.fq2a2));
	   listOfButtons.add((RadioButton)findViewById(R.id.fq2a3));
	   listOfButtons.add((RadioButton)findViewById(R.id.fq2a4));
	   listOfButtons.add((RadioButton)findViewById(R.id.fq3a1));
	   listOfButtons.add((RadioButton)findViewById(R.id.fq3a2));
	   listOfButtons.add((RadioButton)findViewById(R.id.fq3a3));
	   listOfButtons.add((RadioButton)findViewById(R.id.fq3a4));
	   listOfButtons.add((RadioButton)findViewById(R.id.fq4a1));
	   listOfButtons.add((RadioButton)findViewById(R.id.fq4a2));
	   listOfButtons.add((RadioButton)findViewById(R.id.fq4a3));
	   listOfButtons.add((RadioButton)findViewById(R.id.fq4a4));
	   listOfButtons.add((RadioButton)findViewById(R.id.fq5a1));
	   listOfButtons.add((RadioButton)findViewById(R.id.fq5a2));
	   listOfButtons.add((RadioButton)findViewById(R.id.fq5a3));
	   listOfButtons.add((RadioButton)findViewById(R.id.fq5a4));
	   listOfButtons.add((RadioButton)findViewById(R.id.fq6a1));
	   listOfButtons.add((RadioButton)findViewById(R.id.fq6a2));
	   listOfButtons.add((RadioButton)findViewById(R.id.fq6a3));
	   listOfButtons.add((RadioButton)findViewById(R.id.fq6a4));
	   listOfButtons.add((RadioButton)findViewById(R.id.fq7a1));
	   listOfButtons.add((RadioButton)findViewById(R.id.fq7a2));
	   listOfButtons.add((RadioButton)findViewById(R.id.fq7a3));
	   listOfButtons.add((RadioButton)findViewById(R.id.fq7a4));
	   listOfButtons.add((RadioButton)findViewById(R.id.fq8a1));
	   listOfButtons.add((RadioButton)findViewById(R.id.fq8a2));
	   listOfButtons.add((RadioButton)findViewById(R.id.fq8a3));
	   listOfButtons.add((RadioButton)findViewById(R.id.fq8a4));
	   listOfButtons.add((RadioButton)findViewById(R.id.fq9a1));
	   listOfButtons.add((RadioButton)findViewById(R.id.fq9a2));
	   listOfButtons.add((RadioButton)findViewById(R.id.fq9a3));
	   listOfButtons.add((RadioButton)findViewById(R.id.fq9a4));
	   listOfButtons.add((RadioButton)findViewById(R.id.fq10a1));
	   listOfButtons.add((RadioButton)findViewById(R.id.fq10a2));
	   listOfButtons.add((RadioButton)findViewById(R.id.fq10a3));
	   listOfButtons.add((RadioButton)findViewById(R.id.fq10a4));
	   listOfButtons.add((RadioButton)findViewById(R.id.fq11a1));
	   listOfButtons.add((RadioButton)findViewById(R.id.fq11a2));
	   listOfButtons.add((RadioButton)findViewById(R.id.fq11a3));
	   listOfButtons.add((RadioButton)findViewById(R.id.fq11a4));
	   listOfButtons.add((RadioButton)findViewById(R.id.fq12a1));
	   listOfButtons.add((RadioButton)findViewById(R.id.fq12a2));
	   listOfButtons.add((RadioButton)findViewById(R.id.fq12a3));
	   listOfButtons.add((RadioButton)findViewById(R.id.fq12a4));
	   listOfButtons.add((RadioButton)findViewById(R.id.fq13a1));
	   listOfButtons.add((RadioButton)findViewById(R.id.fq13a2));
	   listOfButtons.add((RadioButton)findViewById(R.id.fq13a3));
	   listOfButtons.add((RadioButton)findViewById(R.id.fq13a4));
	   listOfButtons.add((RadioButton)findViewById(R.id.fq14a1));
	   listOfButtons.add((RadioButton)findViewById(R.id.fq14a2));
	   listOfButtons.add((RadioButton)findViewById(R.id.fq14a3));
	   listOfButtons.add((RadioButton)findViewById(R.id.fq14a4));
	   listOfButtons.add((RadioButton)findViewById(R.id.fq15a1));
	   listOfButtons.add((RadioButton)findViewById(R.id.fq15a2));
	   listOfButtons.add((RadioButton)findViewById(R.id.fq15a3));
	   listOfButtons.add((RadioButton)findViewById(R.id.fq15a4));
	   listOfButtons.add((RadioButton)findViewById(R.id.fq16a1));
	   listOfButtons.add((RadioButton)findViewById(R.id.fq16a2));
	   listOfButtons.add((RadioButton)findViewById(R.id.fq16a3));
	   listOfButtons.add((RadioButton)findViewById(R.id.fq16a4));
	   listOfButtons.add((RadioButton)findViewById(R.id.fq17a1));
	   listOfButtons.add((RadioButton)findViewById(R.id.fq17a2));
	   listOfButtons.add((RadioButton)findViewById(R.id.fq17a3));
	   listOfButtons.add((RadioButton)findViewById(R.id.fq17a4));
	   listOfButtons.add((RadioButton)findViewById(R.id.fq18a1));
	   listOfButtons.add((RadioButton)findViewById(R.id.fq18a2));
	   listOfButtons.add((RadioButton)findViewById(R.id.fq18a3));
	   listOfButtons.add((RadioButton)findViewById(R.id.fq18a4));
	   listOfButtons.add((RadioButton)findViewById(R.id.fq19a1));
	   listOfButtons.add((RadioButton)findViewById(R.id.fq19a2));
	   listOfButtons.add((RadioButton)findViewById(R.id.fq19a3));
	   listOfButtons.add((RadioButton)findViewById(R.id.fq19a4));
	   listOfButtons.add((RadioButton)findViewById(R.id.fq20a1));
	   listOfButtons.add((RadioButton)findViewById(R.id.fq20a2));
	   listOfButtons.add((RadioButton)findViewById(R.id.fq20a3));
	   listOfButtons.add((RadioButton)findViewById(R.id.fq20a4));
	   listOfButtons.add((RadioButton)findViewById(R.id.fq21a1));
	   listOfButtons.add((RadioButton)findViewById(R.id.fq21a2));
	   listOfButtons.add((RadioButton)findViewById(R.id.fq21a3));
	   listOfButtons.add((RadioButton)findViewById(R.id.fq21a4));
	   listOfButtons.add((RadioButton)findViewById(R.id.fq22a1));
	   listOfButtons.add((RadioButton)findViewById(R.id.fq22a2));
	   listOfButtons.add((RadioButton)findViewById(R.id.fq22a3));
	   listOfButtons.add((RadioButton)findViewById(R.id.fq22a4));
	   listOfButtons.add((RadioButton)findViewById(R.id.fq23a1));
	   listOfButtons.add((RadioButton)findViewById(R.id.fq23a2));
	   listOfButtons.add((RadioButton)findViewById(R.id.fq23a3));
	   listOfButtons.add((RadioButton)findViewById(R.id.fq23a4));
	   listOfButtons.add((RadioButton)findViewById(R.id.fq24a1));
	   listOfButtons.add((RadioButton)findViewById(R.id.fq24a2));
	   listOfButtons.add((RadioButton)findViewById(R.id.fq24a3));
	   listOfButtons.add((RadioButton)findViewById(R.id.fq24a4));
	   listOfButtons.add((RadioButton)findViewById(R.id.fq25a1));
	   listOfButtons.add((RadioButton)findViewById(R.id.fq25a2));
	   listOfButtons.add((RadioButton)findViewById(R.id.fq25a3));
	   listOfButtons.add((RadioButton)findViewById(R.id.fq25a4));
	   listOfButtons.add((RadioButton)findViewById(R.id.fq26a1));
	   listOfButtons.add((RadioButton)findViewById(R.id.fq26a2));
	   listOfButtons.add((RadioButton)findViewById(R.id.fq26a3));
	   listOfButtons.add((RadioButton)findViewById(R.id.fq26a4));
	   listOfButtons.add((RadioButton)findViewById(R.id.fq27a1));
	   listOfButtons.add((RadioButton)findViewById(R.id.fq27a2));
	   listOfButtons.add((RadioButton)findViewById(R.id.fq27a3));
	   listOfButtons.add((RadioButton)findViewById(R.id.fq27a4));
	   listOfButtons.add((RadioButton)findViewById(R.id.fq28a1));
	   listOfButtons.add((RadioButton)findViewById(R.id.fq28a2));
	   listOfButtons.add((RadioButton)findViewById(R.id.fq28a3));
	   listOfButtons.add((RadioButton)findViewById(R.id.fq28a4));
	   listOfButtons.add((RadioButton)findViewById(R.id.fq29a1));
	   listOfButtons.add((RadioButton)findViewById(R.id.fq29a2));
	   listOfButtons.add((RadioButton)findViewById(R.id.fq29a3));
	   listOfButtons.add((RadioButton)findViewById(R.id.fq29a4));
	   listOfButtons.add((RadioButton)findViewById(R.id.fq30a1));
	   listOfButtons.add((RadioButton)findViewById(R.id.fq30a2));
	   listOfButtons.add((RadioButton)findViewById(R.id.fq30a3));
	   listOfButtons.add((RadioButton)findViewById(R.id.fq30a4));
	   
	   for(int i = 0; i < madeList.size(); i++)
	   {
		  System.err.print(i + ",");
	      Question q = madeList.get(i);
	      listOfQuestions.get(i).setText(q.question);
	      listOfQuestions.get(i).setTextColor(getResources().getColor(R.color.white));

	      for(int j = i*NUM_ANSWERS, k = 0; k < NUM_ANSWERS;k++, j++)
	      {
	    	  listOfButtons.get(j).setText(q.possibles[k]);
	    	  listOfButtons.get(j).setTextColor(getResources().getColor(R.color.white));
	      }
	   }
	}
	
	@Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
        case android.R.id.home:
            this.finish();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
	
	private String readFile(String fileName)
	{
		String text = fileName; //your text file name in the assets folder
		byte[] buffer = null;
		InputStream is;
		try {
		is = getAssets().open(text);
		int size = is.available(); //size of the file in bytes
		buffer = new byte[size]; //declare the size of the byte array with size of the file
		is.read(buffer); //read file
		is.close(); //close file
		} catch (Exception e) {
		e.printStackTrace();
		}
		// Store text file data in the string variable
		String str_data = new String(buffer);
        return str_data;
	}
	private void addListener()
	{
		Button submit = (Button) findViewById(R.id.submit); 
		submit.setOnClickListener(new OnClickListener(){
	        @Override
	        public void onClick(View view) {
	        	try {
	            // these get the answers selected on submit button click
	        	RadioButton b1 = (RadioButton)findViewById(((RadioGroup)findViewById(R.id.g1)).getCheckedRadioButtonId());
	        	RadioButton b2 = (RadioButton)findViewById(((RadioGroup)findViewById(R.id.g2)).getCheckedRadioButtonId()); 
	        	RadioButton b3 = (RadioButton)findViewById(((RadioGroup)findViewById(R.id.g3)).getCheckedRadioButtonId()); 
	        	RadioButton b4 = (RadioButton)findViewById(((RadioGroup)findViewById(R.id.g4)).getCheckedRadioButtonId()); 
	        	RadioButton b5 = (RadioButton)findViewById(((RadioGroup)findViewById(R.id.g5)).getCheckedRadioButtonId()); 
	        	RadioButton b6 = (RadioButton)findViewById(((RadioGroup)findViewById(R.id.g6)).getCheckedRadioButtonId()); 
	        	RadioButton b7 = (RadioButton)findViewById(((RadioGroup)findViewById(R.id.g7)).getCheckedRadioButtonId()); 
	        	RadioButton b8 = (RadioButton)findViewById(((RadioGroup)findViewById(R.id.g8)).getCheckedRadioButtonId());
	        	RadioButton b9 = (RadioButton)findViewById(((RadioGroup)findViewById(R.id.g9)).getCheckedRadioButtonId());
	        	RadioButton b10 = (RadioButton)findViewById(((RadioGroup)findViewById(R.id.g10)).getCheckedRadioButtonId());
	        	RadioButton b11 = (RadioButton)findViewById(((RadioGroup)findViewById(R.id.g11)).getCheckedRadioButtonId());
	        	RadioButton b12 = (RadioButton)findViewById(((RadioGroup)findViewById(R.id.g12)).getCheckedRadioButtonId());
	        	RadioButton b13 = (RadioButton)findViewById(((RadioGroup)findViewById(R.id.g13)).getCheckedRadioButtonId());
	        	RadioButton b14 = (RadioButton)findViewById(((RadioGroup)findViewById(R.id.g14)).getCheckedRadioButtonId());
	        	RadioButton b15 = (RadioButton)findViewById(((RadioGroup)findViewById(R.id.g15)).getCheckedRadioButtonId());
	        	RadioButton b16 = (RadioButton)findViewById(((RadioGroup)findViewById(R.id.g16)).getCheckedRadioButtonId());
	        	RadioButton b17 = (RadioButton)findViewById(((RadioGroup)findViewById(R.id.g17)).getCheckedRadioButtonId());
	        	RadioButton b18 = (RadioButton)findViewById(((RadioGroup)findViewById(R.id.g18)).getCheckedRadioButtonId());
	        	RadioButton b19 = (RadioButton)findViewById(((RadioGroup)findViewById(R.id.g19)).getCheckedRadioButtonId());
	        	RadioButton b20 = (RadioButton)findViewById(((RadioGroup)findViewById(R.id.g20)).getCheckedRadioButtonId());
	        	RadioButton b21 = (RadioButton)findViewById(((RadioGroup)findViewById(R.id.g21)).getCheckedRadioButtonId());
	        	RadioButton b22 = (RadioButton)findViewById(((RadioGroup)findViewById(R.id.g22)).getCheckedRadioButtonId());
	        	RadioButton b23 = (RadioButton)findViewById(((RadioGroup)findViewById(R.id.g23)).getCheckedRadioButtonId());
	        	RadioButton b24 = (RadioButton)findViewById(((RadioGroup)findViewById(R.id.g24)).getCheckedRadioButtonId());
	        	RadioButton b25 = (RadioButton)findViewById(((RadioGroup)findViewById(R.id.g25)).getCheckedRadioButtonId());
	        	RadioButton b26 = (RadioButton)findViewById(((RadioGroup)findViewById(R.id.g26)).getCheckedRadioButtonId());
	        	RadioButton b27 = (RadioButton)findViewById(((RadioGroup)findViewById(R.id.g27)).getCheckedRadioButtonId());
	        	RadioButton b28 = (RadioButton)findViewById(((RadioGroup)findViewById(R.id.g28)).getCheckedRadioButtonId());
	        	RadioButton b29 = (RadioButton)findViewById(((RadioGroup)findViewById(R.id.g29)).getCheckedRadioButtonId());
	        	RadioButton b30 = (RadioButton)findViewById(((RadioGroup)findViewById(R.id.g30)).getCheckedRadioButtonId());
	        	
	        	
	        	ArrayList<String> answers = new ArrayList<String>();
	        
	        	answers.add(b1.getText().toString());
	        	answers.add(b2.getText().toString());
	        	answers.add(b3.getText().toString());
	        	answers.add(b4.getText().toString());
	        	answers.add(b5.getText().toString());
	        	answers.add(b6.getText().toString());
	        	answers.add(b7.getText().toString());
	        	answers.add(b8.getText().toString());
	        	answers.add(b9.getText().toString());
	        	answers.add(b10.getText().toString());
	        	answers.add(b11.getText().toString());
	        	answers.add(b12.getText().toString());
	        	answers.add(b13.getText().toString());
	        	answers.add(b14.getText().toString());
	        	answers.add(b15.getText().toString());
	        	answers.add(b16.getText().toString());
	        	answers.add(b17.getText().toString());
	        	answers.add(b18.getText().toString());
	        	answers.add(b19.getText().toString());
	        	answers.add(b20.getText().toString());
	        	answers.add(b21.getText().toString());
	        	answers.add(b22.getText().toString());
	        	answers.add(b23.getText().toString());
	        	answers.add(b24.getText().toString());
	        	answers.add(b25.getText().toString());
	        	answers.add(b26.getText().toString());
	        	answers.add(b27.getText().toString());
	        	answers.add(b28.getText().toString());
	        	answers.add(b29.getText().toString());
	        	answers.add(b30.getText().toString());
	        	
	        	ArrayList<Question> incorrect = new ArrayList<Question>();
	        	for(int i = 0; i < madeList.size(); i++)
	        	{
	        	   Question q = madeList.get(i);
	        	   if(!q.answer.equals(answers.get(i)))
	        	   {
	        		  q.response = answers.get(i);
	        	      incorrect.add(q);
	        	   }
	        	}
	        	AlertDialog.Builder alertBuilder = new AlertDialog.Builder(context, AlertDialog.THEME_HOLO_LIGHT);
	        	alertBuilder.setTitle("Final Results");
	        	String resultsMessage = "";
	        	if(incorrect.size() == 0)
	        	{
	        	   resultsMessage = "You got 100%";	
	        	}
	        	else
	        	{
	        	   resultsMessage = "You answered " + (30 - incorrect.size()) + "/" + "30 questions correctly" + "\n\n" + "You missed the following questions: \n\n";
	        	   
	        	   for(int i = 0; i < incorrect.size(); i++)
	        	   {
	        		   resultsMessage += "-----------------------------------------------------------------------------------------------\n"
   	    		  			+ "QUESTION: " + incorrect.get(i).question + "\n\n" +
   	                        "YOU ANSWERED: " + incorrect.get(i).response + "\n\n" +
   	                        "CORRECT ANSWER: "  + incorrect.get(i).answer + "\n\n" +
   	                        "RECOMMENDATION: The topic of " + incorrect.get(i).topic + " was discussed in the video '" + incorrect.get(i).video + "'. You may want to review this video.\n\n";
	        	   }
	        	}
	        	alertBuilder.setMessage(resultsMessage);
				AlertDialog results = alertBuilder.create();
				results.show();
	        	} catch (Exception ex) {
	        		AlertDialog.Builder alertBuilder = new AlertDialog.Builder(context);
	        		alertBuilder.setMessage("Please answer all the questions");
					AlertDialog results = alertBuilder.create();
					results.show();
	        	}
	        }
	    });
	}
}
