package com.ap.trycatch;

import com.example.trycatch.R;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.util.Log;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

public class MainGamePanel extends SurfaceView implements SurfaceHolder.Callback{

	private static final String TAG = MainGamePanel.class.getSimpleName();
	
	private MainThread thread;
	
	private boolean isTouching;
	private Player player;
	
	public MainGamePanel(Context context) {
		super(context);
		getHolder().addCallback(this);
		
		thread = new MainThread(getHolder(), this);
		isTouching = false;
		player = new Player(360, BitmapFactory.decodeResource(getResources(), R.drawable.background));
		
		setFocusable(true);
	}

	@Override
	public void surfaceChanged(SurfaceHolder holder, int format, int width,
			int height) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void surfaceCreated(SurfaceHolder holder) {
		thread.setRunning(true);
		thread.start();
		
	}

	@Override
	public void surfaceDestroyed(SurfaceHolder holder) {
		boolean retry = true;
		while(retry){
			try{
				thread.join();
				retry = false;
			} catch(InterruptedException e){
				
			}
		}
		
	}

	@Override
	public boolean onTouchEvent(MotionEvent event){
		if(event.getAction() == MotionEvent.ACTION_DOWN){
			Log.d(TAG, "Coords: x="+ event.getX() + ",y="+ event.getY());
			isTouching = true;
			
		}
		
		return super.onTouchEvent(event);
	}
	
	@Override
	protected void onDraw(Canvas canvas){
		player.draw(canvas);
	}
}
