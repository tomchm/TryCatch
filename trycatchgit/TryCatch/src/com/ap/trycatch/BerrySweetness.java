package com.ap.trycatch;

import android.graphics.Bitmap;

public class BerrySweetness extends Item {
	
	public BerrySweetness(int x, int y, Bitmap bitmap) {
		this.x = x;
		this.y = y;
		this.bitmap = bitmap;
	}

	public int collide() {
		scoreModifier *= 2;
		return 5 * scoreModifier;
	}
	
}
