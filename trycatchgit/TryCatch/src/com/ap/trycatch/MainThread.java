package com.ap.trycatch;

import java.util.ArrayList;

import com.example.trycatch.R;

import android.annotation.SuppressLint;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.util.Log;
import android.view.SurfaceHolder;

public class MainThread extends Thread{
	
	private static final String TAG = MainThread.class.getSimpleName();
	
	private boolean running;
	private SurfaceHolder surfaceHolder;
	private MainGamePanel gamePanel;
	private ArrayList<Item> itemList;
	
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
		
		long pastTime = System.currentTimeMillis();
		while (running){
			canvas = null;
			tickCount++;
			
			long nowTime = System.currentTimeMillis();
			if(nowTime - pastTime >= Item.density){
				int choose = (int) Math.random()*100;
				Item adding = null;
				int x = (int) Math.random()*720;
				if(choose < 60){
					adding = new AndroidItem(x, 0, BitmapFactory.decodeResource(gamePanel.getResources(), R.drawable.background));
				}
				else if(choose < 80){
					adding = new Apple(x, 0, BitmapFactory.decodeResource(gamePanel.getResources(), R.drawable.background));
				}
				else if(choose < 87){
					adding = new Java(x, 0, BitmapFactory.decodeResource(gamePanel.getResources(), R.drawable.background));
				}
				else if(choose < 94){
					adding = new Chrome(x, 0, BitmapFactory.decodeResource(gamePanel.getResources(), R.drawable.background));
				}
				else{
					adding = new BerrySweetness(x, 0, BitmapFactory.decodeResource(gamePanel.getResources(), R.drawable.background));
				}
			}
			
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
