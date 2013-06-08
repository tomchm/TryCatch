package com.ap.trycatch;

import android.graphics.Bitmap;

public class Item {

	private int x, y;
	private Bitmap bitmap;
	private static int speed;
	
	public Item(int x, int y, Bitmap bitmap, int speed) {
		this.x = x;
		this.y = y;
		this.bitmap = bitmap;
		this.speed = speed;
	}
	
	public int getX(){
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public Bitmap getBitmap() {
		return bitmap;
	}
	
	public int getSpeed() {
		return speed;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public void setBitmap(Bitmap bitmap) {
		this.bitmap = bitmap;
	}
	
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
}
