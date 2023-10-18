package studio4;

import java.awt.Color;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class InterpretDrawingFile {

	public static void main(String[] args) throws FileNotFoundException {
		JFileChooser chooser = new JFileChooser("resources");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); //making Scanner with a File
String shape = in.next();
int colorR = in.nextInt();
int colorG =in.nextInt();
int colorB = in.nextInt();
boolean filled = in.nextBoolean();

if (shape == ("rectangle") || shape == "ellipse") 
	{
	double x = in.nextDouble();
	double y = in.nextDouble();
	double halfWidth = in.nextDouble();
	double halfHeigh = in.nextDouble();
		Color rectangle = new Color (colorR, colorG, colorB);
		StdDraw.setPenColor(rectangle);
		if (filled = true)
			{StdDraw.filledRectangle(x,  y,  halfWidth,  halfHeigh);}
		if (filled = false)
			{StdDraw.rectangle(x,  y,  halfWidth,  halfHeigh);}
	}
if (shape == "triangle")
{

	double x1 = in.nextDouble();
	double y1 = in.nextDouble();
	double x2 = in.nextDouble();
	double y2 = in.nextDouble();
	double x3 = in.nextDouble();
	double y3 = in.nextDouble();
	double[] x = { x1, x2, x3 };
	double[] y = { y1, y2, y3};
	Color triangle = new Color (colorR, colorG, colorB);
	StdDraw.setPenColor(triangle);
	if (filled = true)
		{StdDraw.filledPolygon(x,y);}
	if (filled = false)
		{StdDraw.polygon(x,y);}

	}
	
}
}