package com.example.educationalapp;
import java.util.Scanner;
import java.io.InputStream;
import java.util.ArrayList;
import java.io.File;
import android.app.Activity;
import android.os.Bundle;

public class Quiz extends Activity {

	private class Question
	{
	   String question;
	   String answer;
	   String[] possibles;
	   public Question(String q , String a , String[] p)
	   {
	      question = q;
	      answer = a;
	      possibles = p;
	   }
	}
	private ArrayList<Question> qList = new ArrayList<Question>(); 
	private ArrayList<Question> madeList = new ArrayList<Question>();
	private final int NUM_ANSWERS = 4;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.quizlayout);
	    
		getQuestions();	
		createQuiz();
		displayQuiz();
		
	}
	private void getQuestions()
	{
	   try {
	      Scanner scan = new Scanner(readFile());
	      while(scan.hasNextLine())
	      {
	         String question = scan.nextLine();
	         String answer = scan.nextLine();
	         String[] possibles = new String[NUM_ANSWERS];
	         for(int i = 0; i < possibles.length; i++)
	            possibles[i] = scan.nextLine();
	         Question q = new Question(question,answer,possibles);
	         qList.add(q);
          }
	   } catch (Exception ex) {
	      System.err.println("Error reading the file...");
	   }
	      
	}
	private void createQuiz()
	{
	      madeList = qList;
	}
	private void displayQuiz()
	{
	   Scanner scan = new Scanner(System.in);
	   for(int i = 0; i < madeList.size(); i++)
	   {
	      Question q = madeList.get(i);
	         
	   }
	}
	private String readFile()
	{
		String text = "quiz.txt"; //your text file name in the assets folder
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

}
