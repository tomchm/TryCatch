package com.ap.trycatch;

import android.graphics.Bitmap;

public class Player {

	private int x;
	private Bitmap bitmap;
	
	public Player (int x, Bitmap bitmap) {
		this.x = x;
		this.bitmap = bitmap;
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
}
