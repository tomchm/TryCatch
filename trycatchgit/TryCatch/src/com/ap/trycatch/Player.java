package com.ap.trycatch;

import android.graphics.Bitmap;
import android.graphics.Canvas;

public class Player {

	private int x, y;
	private Bitmap bitmap;
	
	public Player (int x, Bitmap bitmap) {
		this.x = x;
		this.bitmap = bitmap;
		this.y = bitmap.getHeight() / 2;
	}
	
	public int getX() {
		return x;
	}
	
	public Bitmap getBitmap() {
		return bitmap;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public void setBitmap(Bitmap bitmap) {
		this.bitmap = bitmap;
	}
	
	public void draw(Canvas canvas){
		canvas.drawBitmap(bitmap, x - (bitmap.getWidth() / 2), y - (bitmap.getHeight() / 2), null);
	}
}
