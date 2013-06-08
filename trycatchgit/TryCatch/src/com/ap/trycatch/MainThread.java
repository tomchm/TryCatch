package com.ap.trycatch;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.util.Log;
import android.view.SurfaceHolder;

public class MainThread extends Thread{
	
	private static final String TAG = MainThread.class.getSimpleName();
	
	private boolean running;
	private SurfaceHolder surfaceHolder;
	private MainGamePanel gamePanel;
	
	public MainThread(SurfaceHolder surfaceHolder, MainGamePanel gamePanel){
		super();
		this.surfaceHolder = surfaceHolder;
		this.gamePanel = gamePanel;
	}
	
	public void setRunning(boolean running){
		this.running = running;
	}
	
	@SuppressLint("WrongCall")
	@Override
	public void run(){
		long tickCount = 0L;
		Canvas canvas;
		Log.d(TAG, "Starting game loop");
		while (running){
			canvas = null;
			tickCount++;
			
			try{
				canvas = this.surfaceHolder.lockCanvas();
				synchronized (surfaceHolder){
					this.gamePanel.onDraw(canvas);
				}
			} finally{
				if(canvas != null){
					surfaceHolder.unlockCanvasAndPost(canvas);
				}
			}
		}
		Log.d(TAG, "Game loop executed "+ tickCount + " times");
	}
}
