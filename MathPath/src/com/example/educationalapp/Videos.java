package com.example.educationalapp;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Videos extends YouTubeFailureRecoveryActivity {
	Button quizButton;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	    setContentView(R.layout.video_page_layout);
	
	    YouTubePlayerView youTubeView = (YouTubePlayerView) findViewById(R.id.youtube_view);
	    youTubeView.initialize(DeveloperKey.DEVELOPER_KEY, this);
	    
	    quizButton = (android.widget.Button)findViewById(R.id.quiz_button);
		
		quizButton.setOnClickListener(new OnClickListener() {           
			@Override
			public void onClick(View v) {
				Intent quiz = new Intent(Videos.this, Quiz.class);
				
				startActivity(quiz);
			}    
		});
	}
	
	@Override
	public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer player,
		boolean wasRestored) {
	    if (!wasRestored) {
	      player.cueVideo("riXcZT2ICjA"); //wKJ9KzGQq0w
	    }
	}
	
	@Override
	protected YouTubePlayer.Provider getYouTubePlayerProvider() {
		return (YouTubePlayerView) findViewById(R.id.youtube_view);
	}
}
