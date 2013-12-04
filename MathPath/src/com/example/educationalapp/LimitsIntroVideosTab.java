package com.example.educationalapp;

import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayer.OnInitializedListener;
import com.google.android.youtube.player.YouTubePlayer.PlaybackEventListener;
import com.google.android.youtube.player.YouTubePlayer.PlayerStateChangeListener;
import com.google.android.youtube.player.YouTubePlayer.Provider;
import com.google.android.youtube.player.YouTubePlayerSupportFragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * A simple {@link android.support.v4.app.Fragment} subclass.
 * 
 */
public class LimitsIntroVideosTab extends Fragment implements YouTubePlayer.OnInitializedListener {

	public LimitsIntroVideosTab() {
		// Required empty public constructor
	}

	private YouTubePlayer youTubePlayer, youTubePlayer2;
	private YouTubePlayerSupportFragment youTubePlayerFragment, youTubePlayerFragment2;
	 
	private static final int RQS_ErrorDialog = 1;
	
	private MyPlayerStateChangeListener myPlayerStateChangeListener;
	private MyPlaybackEventListener myPlaybackEventListener;
	
	private MyPlayerStateChangeListener2 myPlayerStateChangeListener2;
	private MyPlaybackEventListener2 myPlaybackEventListener2;
	 
	String log = "", log2 = "";
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// Inflate the layout for this fragment
		View view = inflater.inflate(R.layout.limits_intro_videos_tab, container, false);

		youTubePlayerFragment = new YouTubePlayerSupportFragment();
		youTubePlayerFragment2 = new YouTubePlayerSupportFragment();

		LimitsIntroVideosTabVidDescs descs = new LimitsIntroVideosTabVidDescs();

		FragmentManager fm = getFragmentManager();

		FragmentTransaction ft = fm.beginTransaction();

		ft.add(R.id.limits_intro_first, youTubePlayerFragment);	
		ft.add(R.id.limits_intro_second, youTubePlayerFragment2);

		ft.add(R.id.limits_intro_vid_descs, descs);

		ft.commit();

		youTubePlayerFragment.initialize(DeveloperKey.DEVELOPER_KEY, this);

		youTubePlayerFragment2.initialize(DeveloperKey.DEVELOPER_KEY, new OnInitializedListener() {

			@Override
			public void onInitializationFailure(Provider provider,
					YouTubeInitializationResult result) {
				if (result.isUserRecoverableError()) {
					result.getErrorDialog(getActivity(), RQS_ErrorDialog).show(); 
				} else {
					//							Toast.makeText(getActivity(), 
					//							  "YouTubePlayer.onInitializationFailure(): " + result.toString(), 
					//							  Toast.LENGTH_LONG).show(); 
				}
			}

			@Override
			public void onInitializationSuccess(Provider provider,
					YouTubePlayer player, boolean wasRestored) {
				youTubePlayer2 = player;

				//						Toast.makeText(getActivity(), 
				//						  "YouTubePlayer.onInitializationSuccess()", 
				//						  Toast.LENGTH_LONG).show();

				youTubePlayer2.setPlayerStateChangeListener(myPlayerStateChangeListener2);
				youTubePlayer2.setPlaybackEventListener(myPlaybackEventListener2);

				if (!wasRestored) {
					player.cueVideo("gp5efC2n0iM");
				}
			}

		});
		
		myPlayerStateChangeListener = new MyPlayerStateChangeListener();
		myPlaybackEventListener = new MyPlaybackEventListener();
		
		myPlayerStateChangeListener2 = new MyPlayerStateChangeListener2();
		myPlaybackEventListener2 = new MyPlaybackEventListener2();

		return view;
	}

	@Override
	public void onInitializationFailure(Provider provider,
	  YouTubeInitializationResult result) {
	  
		if (result.isUserRecoverableError()) {
			result.getErrorDialog(getActivity(), RQS_ErrorDialog).show(); 
		} else {
//	   		Toast.makeText(getActivity(), 
//	     		"YouTubePlayer.onInitializationFailure(): " + result.toString(), 
//	     		Toast.LENGTH_LONG).show(); 
	  }
	}

	@Override
	public void onInitializationSuccess(Provider provider, YouTubePlayer player,
	  boolean wasRestored) {
	  
		youTubePlayer = player;
		  
	//	Toast.makeText(getActivity(), 
	//	   "YouTubePlayer.onInitializationSuccess()", 
	//	   Toast.LENGTH_LONG).show();
		  
		youTubePlayer.setPlayerStateChangeListener(myPlayerStateChangeListener);
		youTubePlayer.setPlaybackEventListener(myPlaybackEventListener);
	  
		if (!wasRestored) {
			player.cueVideo("riXcZT2ICjA");
	    }

	}
	 
	private final class MyPlayerStateChangeListener implements PlayerStateChangeListener {

		private void updateLog(String prompt){
			log +=  "MyPlayerStateChangeListener" + "\n" + 
					prompt + "\n\n=====";
			//	    textVideoLog.setText(log);
		};

		@Override
		public void onAdStarted() {
			updateLog("onAdStarted()");
		}

		@Override
		public void onError(
				com.google.android.youtube.player.YouTubePlayer.ErrorReason arg0) {
			updateLog("onError(): " + arg0.toString());
		}

		@Override
		public void onLoaded(String arg0) {
			updateLog("onLoaded(): " + arg0);
		}

		@Override
		public void onLoading() {
			updateLog("onLoading()");
		}

		@Override
		public void onVideoEnded() {
			updateLog("onVideoEnded()");
		}

		@Override
		public void onVideoStarted() {
			updateLog("onVideoStarted()");
		}

	}

	private final class MyPlaybackEventListener implements PlaybackEventListener {

		private void updateLog(String prompt){
			log +=  "MyPlaybackEventListener" + "\n-" + 
					prompt + "\n\n=====";
			//	   textVideoLog.setText(log);
		};

		@Override
		public void onBuffering(boolean arg0) {
			updateLog("onBuffering(): " + String.valueOf(arg0));
		}

		@Override
		public void onPaused() {
			updateLog("onPaused()");
		}

		@Override
		public void onPlaying() {
			updateLog("onPlaying()");
		}

		@Override
		public void onSeekTo(int arg0) {
			updateLog("onSeekTo(): " + String.valueOf(arg0));
		}

		@Override
		public void onStopped() {
			updateLog("onStopped()");
		}

	}
	
	private final class MyPlayerStateChangeListener2 implements PlayerStateChangeListener {

		private void updateLog(String prompt){
			log2 +=  "MyPlayerStateChangeListener" + "\n" + 
					prompt + "\n\n=====";
			//	    textVideoLog.setText(log);
		};

		@Override
		public void onAdStarted() {
			updateLog("onAdStarted()");
		}

		@Override
		public void onError(
				com.google.android.youtube.player.YouTubePlayer.ErrorReason arg0) {
			updateLog("onError(): " + arg0.toString());
		}

		@Override
		public void onLoaded(String arg0) {
			updateLog("onLoaded(): " + arg0);
		}

		@Override
		public void onLoading() {
			updateLog("onLoading()");
		}

		@Override
		public void onVideoEnded() {
			updateLog("onVideoEnded()");
		}

		@Override
		public void onVideoStarted() {
			updateLog("onVideoStarted()");
		}

	}

	private final class MyPlaybackEventListener2 implements PlaybackEventListener {

		private void updateLog(String prompt){
			log2 +=  "MyPlaybackEventListener" + "\n-" + 
					prompt + "\n\n=====";
			//	   textVideoLog.setText(log);
		};

		@Override
		public void onBuffering(boolean arg0) {
			updateLog("onBuffering(): " + String.valueOf(arg0));
		}

		@Override
		public void onPaused() {
			updateLog("onPaused()");
		}

		@Override
		public void onPlaying() {
			updateLog("onPlaying()");
		}

		@Override
		public void onSeekTo(int arg0) {
			updateLog("onSeekTo(): " + String.valueOf(arg0));
		}

		@Override
		public void onStopped() {
			updateLog("onStopped()");
		}

	}
	
}
