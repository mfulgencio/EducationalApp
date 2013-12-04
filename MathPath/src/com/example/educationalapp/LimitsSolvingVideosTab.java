package com.example.educationalapp;

import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerSupportFragment;
import com.google.android.youtube.player.YouTubePlayer.OnInitializedListener;
import com.google.android.youtube.player.YouTubePlayer.PlaybackEventListener;
import com.google.android.youtube.player.YouTubePlayer.PlayerStateChangeListener;
import com.google.android.youtube.player.YouTubePlayer.Provider;

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
public class LimitsSolvingVideosTab extends Fragment implements YouTubePlayer.OnInitializedListener {

	public LimitsSolvingVideosTab() {
		// Required empty public constructor
	}

	private YouTubePlayer youTubePlayer, youTubePlayer2, youTubePlayer3, youTubePlayer4;
	private YouTubePlayerSupportFragment youTubePlayerFragment, youTubePlayerFragment2,
	 youTubePlayerFragment3, youTubePlayerFragment4;
	 
	private static final int RQS_ErrorDialog = 1;
	
	private MyPlayerStateChangeListener myPlayerStateChangeListener;
	private MyPlaybackEventListener myPlaybackEventListener;
	
	private MyPlaybackEventListener2 myPlaybackEventListener2;
	private MyPlayerStateChangeListener2 myPlayerStateChangeListener2;
	
	private MyPlaybackEventListener3 myPlaybackEventListener3;
	private MyPlayerStateChangeListener3 myPlayerStateChangeListener3; 
	
	private MyPlaybackEventListener4 myPlaybackEventListener4;
	private MyPlayerStateChangeListener4 myPlayerStateChangeListener4;
	 
	String log = "", log2 = "", log3 = "", log4 = "";
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// Inflate the layout for this fragment
		View view = inflater.inflate(R.layout.limits_solving_videos_tab, container, false);

		youTubePlayerFragment = new YouTubePlayerSupportFragment();
		youTubePlayerFragment2 = new YouTubePlayerSupportFragment();
		youTubePlayerFragment3 = new YouTubePlayerSupportFragment();
		youTubePlayerFragment4 = new YouTubePlayerSupportFragment();

		LimitsSolvingVideosTabVidDescs descs = new LimitsSolvingVideosTabVidDescs();

		FragmentManager fm = getFragmentManager();

		FragmentTransaction ft = fm.beginTransaction();

		ft.add(R.id.limits_solving_first, youTubePlayerFragment);	
		ft.add(R.id.limits_solving_second, youTubePlayerFragment2);
		ft.add(R.id.limits_solving_third, youTubePlayerFragment3);
		ft.add(R.id.limits_solving_fourth, youTubePlayerFragment4);

		ft.add(R.id.limits_solving_vid_descs, descs);

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
					player.cueVideo("YRw8udexH4o");
				}
			}

		});
		
		youTubePlayerFragment3.initialize(DeveloperKey.DEVELOPER_KEY, new OnInitializedListener() {

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
				youTubePlayer3 = player;

				//						Toast.makeText(getActivity(), 
				//						  "YouTubePlayer.onInitializationSuccess()", 
				//						  Toast.LENGTH_LONG).show();

				youTubePlayer3.setPlayerStateChangeListener(myPlayerStateChangeListener3);
				youTubePlayer3.setPlaybackEventListener(myPlaybackEventListener3);

				if (!wasRestored) {
					player.cueVideo("gWSDDopD9sk");
				}
			}

		});
		
		youTubePlayerFragment4.initialize(DeveloperKey.DEVELOPER_KEY, new OnInitializedListener() {

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
				youTubePlayer4 = player;

				//						Toast.makeText(getActivity(), 
				//						  "YouTubePlayer.onInitializationSuccess()", 
				//						  Toast.LENGTH_LONG).show();

				youTubePlayer4.setPlayerStateChangeListener(myPlayerStateChangeListener4);
				youTubePlayer4.setPlaybackEventListener(myPlaybackEventListener4);

				if (!wasRestored) {
					player.cueVideo("igJdDN-DPgA");
				}
			}

		});
		
		myPlayerStateChangeListener = new MyPlayerStateChangeListener();
		myPlaybackEventListener = new MyPlaybackEventListener();
		
		myPlayerStateChangeListener2 = new MyPlayerStateChangeListener2();
		myPlaybackEventListener2 = new MyPlaybackEventListener2();
		
		myPlayerStateChangeListener3 = new MyPlayerStateChangeListener3();
		myPlaybackEventListener3 = new MyPlaybackEventListener3();
		
		myPlayerStateChangeListener4 = new MyPlayerStateChangeListener4();
		myPlaybackEventListener4 = new MyPlaybackEventListener4();

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
			player.cueVideo("GGQngIp0YGI");
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

	private final class MyPlayerStateChangeListener3 implements PlayerStateChangeListener {

		private void updateLog(String prompt){
			log3 +=  "MyPlayerStateChangeListener" + "\n" + 
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

	private final class MyPlaybackEventListener3 implements PlaybackEventListener {

		private void updateLog(String prompt){
			log3 +=  "MyPlaybackEventListener" + "\n-" + 
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
	
	private final class MyPlayerStateChangeListener4 implements PlayerStateChangeListener {

		private void updateLog(String prompt){
			log4 +=  "MyPlayerStateChangeListener" + "\n" + 
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

	private final class MyPlaybackEventListener4 implements PlaybackEventListener {

		private void updateLog(String prompt){
			log4 +=  "MyPlaybackEventListener" + "\n-" + 
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
