package com.example.educationalapp;

import static android.view.ViewGroup.LayoutParams.MATCH_PARENT;
import static android.view.ViewGroup.LayoutParams.WRAP_CONTENT;

import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerSupportFragment;
import com.google.android.youtube.player.YouTubePlayerView;

import android.content.pm.ActivityInfo;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.view.View;

import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;

public class LimitsAllVideosTab extends Fragment implements
	View.OnClickListener,
	CompoundButton.OnCheckedChangeListener,
	YouTubePlayer.OnFullscreenListener {

	public LimitsAllVideosTab() {
		// Required empty public constructor
	}

	private static final int PORTRAIT_ORIENTATION = Build.VERSION.SDK_INT < 9
		      ? ActivityInfo.SCREEN_ORIENTATION_PORTRAIT
		      : ActivityInfo.SCREEN_ORIENTATION_SENSOR_PORTRAIT;

	private LinearLayout baseLayout;
	private YouTubePlayerView playerView;
	private YouTubePlayer player;
	private Button fullscreenButton;
	private View otherViews;
	
	private boolean fullscreen;
	
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		
		// Inflate the layout for this fragment
		View view = inflater.inflate(R.layout.limits_all_videos_tab, container, false);
		
		playerView = (YouTubePlayerView) view.findViewById(R.id.player);
	    fullscreenButton = (Button) view.findViewById(R.id.fullscreen_button);
	    otherViews = view.findViewById(R.id.other_views);

	    return view;
	}
	
	public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer player,
			boolean wasRestored) {
		this.player = player;
		setControlsEnabled();
		// Specify that we want to handle fullscreen behavior ourselves.
		player.addFullscreenControlFlag(YouTubePlayer.FULLSCREEN_FLAG_CUSTOM_LAYOUT);
		player.setOnFullscreenListener(this);
		if (!wasRestored) {
			player.cueVideo("avP5d16wEp0");
		}
	}

	protected YouTubePlayer.Provider getYouTubePlayerProvider() {
		return playerView;
	}

	@Override
	public void onClick(View v) {
		player.setFullscreen(!fullscreen);
	}
	
	private void doLayout() {
		LinearLayout.LayoutParams playerParams =
		        (LinearLayout.LayoutParams) playerView.getLayoutParams();
		if (fullscreen) {
		// When in fullscreen, the visibility of all other views than the player should be set to
		// GONE and the player should be laid out across the whole screen.
		playerParams.width = LayoutParams.MATCH_PARENT;
		playerParams.height = LayoutParams.MATCH_PARENT;
	
		otherViews.setVisibility(View.GONE);
	} else {
		// This layout is up to you - this is just a simple example (vertically stacked boxes in
	  	// portrait, horizontally stacked in landscape).
	    otherViews.setVisibility(View.VISIBLE);
	    ViewGroup.LayoutParams otherViewsParams = otherViews.getLayoutParams();
	    if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE) {
	    	playerParams.width = otherViewsParams.width = 0;
	    	playerParams.height = WRAP_CONTENT;
	    	otherViewsParams.height = MATCH_PARENT;
	        playerParams.weight = 1;
	        baseLayout.setOrientation(LinearLayout.HORIZONTAL);
	    } else {
	        playerParams.width = otherViewsParams.width = MATCH_PARENT;
	        playerParams.height = WRAP_CONTENT;
	        playerParams.weight = 0;
	        otherViewsParams.height = 0;
	        baseLayout.setOrientation(LinearLayout.VERTICAL);
	    }
	    setControlsEnabled();
	    }
	}
	
	private void setControlsEnabled() {
		fullscreenButton.setEnabled(player != null);
	}

	@Override
	public void onFullscreen(boolean isFullscreen) {
		fullscreen = isFullscreen;
		doLayout();
	}

	@Override
	public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
		// TODO Auto-generated method stub
		
	}

}
