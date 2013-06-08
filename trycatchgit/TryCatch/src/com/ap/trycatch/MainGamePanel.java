package com.ap.trycatch;

import android.content.Context;
import android.graphics.Canvas;
import android.util.Log;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

public class MainGamePanel extends SurfaceView implements SurfaceHolder.Callback{

	private static final String TAG = MainGamePanel.class.getSimpleName();
	
	private MainThread thread;
	
	public MainGamePanel(Context context) {
		super(context);
		getHolder().addCallback(this);
		
		thread = new MainThread(getHolder(), this);
		
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
		}
		
		return super.onTouchEvent(event);
	}
	
	@Override
	protected void onDraw(Canvas canvas){
		
	}
}
