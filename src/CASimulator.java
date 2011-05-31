/**
 * CASimulator
 * Main program}
 * 
 * @license		CC BY-SA 3.0
 * @author		Chris Atkin
 * @link		http://chrispyslice.wordpress.com
 * @email		v2t04 <at> students <dot> keele <dot> ac <dot> uk
 * 
 * @file		CASimulator.java
 * @version		1.0
 * @date		05/26/2011
 * 
 * Copyright (c) 2011 Chris Atkin. All rights reserved.
 */

import java.util.LinkedList;
import java.util.ArrayList;
import java.util.ListIterator;
import java.awt.Dimension;
import javax.swing.JFrame;
 
public class CASimulator
{
	private static LinkedList<CellularAutomata> cellautos = new LinkedList<CellularAutomata>();
	private static ArrayList<JFrame> frames = new ArrayList<JFrame>();
	
	// --------------------------------------------------------------------------

	private CASimulator()
	{
		defineAutomatas();
		
		// Load a JFrame for each CA
		ListIterator i = cellautos.listIterator();
		while(i.hasNext())
		{
			// Get the CA
			CellularAutomata ca = (CellularAutomata) i.next();
			CABoard cab = new CABoard(new Dimension(300, 400), ca);
			
			// Create the frame
			JFrame f = new JFrame(ca.getName());
			f.add(cab);
			f.setSize(300, 400);
			f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			f.setVisible(true);
			
			cab.render();
			
			// Add the frame to the ArrayList
			frames.add(f);
			
			//System.out.println("Adding " + ca.getName());
		}
	}
	
	// --------------------------------------------------------------------------

	public static void main(String[] args)
	{		
		new CASimulator();
	}
	
	/**
	 * Define the automatas we want to use
	 */
	private void defineAutomatas()
	{
		// Define the cellautos collection
		cellautos.add(new WolframRuleCA(1));
	}
}

/* End of file CASimulator.java */
/* Location: ./src/CASimulator.java */