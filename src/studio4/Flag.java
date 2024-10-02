package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		Color pink = new Color (255, 175, 175 );
			StdDraw.setPenColor(pink);
		StdDraw.filledRectangle(.5, .5, .4, .3);
			
		Color green = new Color (0, 128, 0);
			StdDraw.setPenColor(green);
		StdDraw.filledEllipse(.5, .5, .3, .03);
		
		Color yellow = new Color (255, 255, 0);
		StdDraw.setPenColor(yellow);
	StdDraw.filledCircle(.3, .55, .05);
	
		Color silver = new Color (192, 192, 192);
		StdDraw.setPenColor(silver);
	StdDraw.filledRectangle(.1, .3, .004, .5);
	
		
	}
}