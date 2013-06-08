package com.ap.trycatch;

import android.graphics.Bitmap;

public class Chrome extends Item {
	
	public Chrome(int x, int y, Bitmap bitmap) {
		this.x = x;
		this.y = y;
		this.bitmap = bitmap;
	}

	public int collide() {
		speed /= 2;
		return 5 * scoreModifier;
	}
	
}
