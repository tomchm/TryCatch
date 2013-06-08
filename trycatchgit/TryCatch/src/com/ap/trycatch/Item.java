package com.ap.trycatch;

import android.graphics.Bitmap;

public abstract class Item {

	private int x, y, score;
	private Bitmap bitmap;
	private static int speed, scoreModifier, density;

	public int getX(){
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public int getScore() {
		return score;
	}
	
	public Bitmap getBitmap() {
		return bitmap;
	}
	
	public int getSpeed() {
		return speed;
	}
	
	public int getScoreModifier() {
		return scoreModifier;
	}
	
	public int getDensity() {
		return density;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public void setScore(int score) {
		this.score = score;
	}
	
	public void setBitmap(Bitmap bitmap) {
		this.bitmap = bitmap;
	}
	
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public void setScoreModifier(int scoreModifier) {
		this.scoreModifier = scoreModifier;
	}
	
	public void setDensity(int density) {
		this.density = density;
	}
	
	public abstract void collide();
	
}
