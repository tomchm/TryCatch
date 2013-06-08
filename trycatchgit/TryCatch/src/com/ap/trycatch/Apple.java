package com.ap.trycatch;

import android.graphics.Bitmap;

public class Apple extends Item {
	
	public Apple(int x, int y, int score, Bitmap bitmap) {
		this.x = x;
		this.y = y;
		this.score = score;
		this.bitmap = bitmap;
	}

	public int collide() {
		return -5 * scoreModifier;
	}
	
}
