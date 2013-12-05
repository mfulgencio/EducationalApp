package com.example.educationalapp;

import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

import android.os.Bundle;
import android.app.ActionBar;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;

public class Videos extends YouTubeFailureRecoveryActivity {
	Intent i;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	    setContentView(R.layout.video_page_layout);
	    
	    i = getIntent();
	    
	    ActionBar bar = getActionBar();
		bar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#3CC7C7")));
		bar.setTitle(i.getStringExtra("videoTitle"));
	
	    YouTubePlayerView youTubeView = (YouTubePlayerView) findViewById(R.id.youtube_view);
	    youTubeView.initialize(DeveloperKey.DEVELOPER_KEY, this);
	}
	
	@Override
	public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer player,
		boolean wasRestored) {
	    if (!wasRestored) {
	      player.cueVideo(getIntent().getStringExtra("videoId"));
	    }
	}
	
	@Override
	protected YouTubePlayer.Provider getYouTubePlayerProvider() {
		return (YouTubePlayerView) findViewById(R.id.youtube_view);
	}
}
