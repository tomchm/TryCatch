package com.ap.trycatch;

import android.graphics.Bitmap;

public class AndroidItem extends Item {
	
	public AndroidItem(int x, int y, Bitmap bitmap) {
		this.x = x;
		this.y = y;
		this.bitmap = bitmap;
	}

	public int collide() {
		return 1 * scoreModifier;
	}
	
}
