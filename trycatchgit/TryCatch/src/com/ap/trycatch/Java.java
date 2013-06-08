package com.ap.trycatch;

import android.graphics.Bitmap;

public class Java extends Item {
	
	public Java(int x, int y, Bitmap bitmap) {
		this.x = x;
		this.y = y;
		this.bitmap = bitmap;
	}

	public int collide() {
		density *= 2;
		return 5 * scoreModifier;
	}
	
}
