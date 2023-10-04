package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		
		int canvasHeight = 512;
		int canvasWidth = 22 * canvasHeight / 16;
		StdDraw.setCanvasSize(canvasWidth, canvasHeight);
		
		StdDraw.setXscale(0, 22);
		StdDraw.setYscale(0, 16);
		
		StdDraw.setPenColor(70, 100, 90);
		StdDraw.filledRectangle(3, 3, 3, 3);
		StdDraw.filledRectangle(3, 30, 30, 3);
		StdDraw.filledRectangle(16, 3, 13, 3);
		StdDraw.filledRectangle(6, 13, 16, 3);
		
		//StdDraw.filledRectangle(11, 8, 11, 1);
		//StdDraw.filledRectangle(8, 8, 1, 8);
		
	
	}
}