package com.ap.trycatch;

import android.graphics.Bitmap;

public class Android extends Item {
	
	public Android(int x, int y, int score, Bitmap bitmap) {
		this.x = x;
		this.y = y;
		this.score = score;
		this.bitmap = bitmap;
	}

	public int collide() {
		return 1 * scoreModifier;
	}
	
}
