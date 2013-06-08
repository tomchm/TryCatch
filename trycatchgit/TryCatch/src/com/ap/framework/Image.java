package com.ap.framework;

import com.ap.framework.Graphics.ImageFormat;

public interface Image {
	public int getWidth();
    public int getHeight();
    public ImageFormat getFormat();
    public void dispose();
}
