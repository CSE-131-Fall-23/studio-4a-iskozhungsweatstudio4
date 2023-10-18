package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		
	
		
		for (int i=0; i<100; i++)
		{
		
		int A = (int) (Math.random()*255);
		int B = (int) (Math.random()*255);
		int C = (int) (Math.random()*255);
		double D = (double)(Math.random());
		double E = (double)(Math.random());
		double F = (double)(Math.random());
		double G = (double)(Math.random());
	
		
		
		
		Color gross1 = new Color(A, B, C);
		StdDraw.setPenColor(gross1);
		if (i%2==0)
		{StdDraw.filledRectangle(D, E, F, G);}
		else
		{StdDraw.filledEllipse(D, E, F, G);}
		
		Color white = new Color(255, 255, 255);
		StdDraw.setPenColor(white);
		StdDraw.filledRectangle(.5, 0, 1, .2);
		StdDraw.filledRectangle(.5, 1, 1, .2);
		StdDraw.filledRectangle(0, .5, .1, 1);
		StdDraw.filledRectangle(1, .5, .1, 1);
		
	
		
		i--;
		}
}
}