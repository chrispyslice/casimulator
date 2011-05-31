/**
 * CASimulator
 * Interface for a cellular automata
 * 
 * @license		CC BY-SA 3.0
 * @author		Chris Atkin
 * @link		http://chrispyslice.wordpress.com
 * @email		v2t04 <at> students <dot> keele <dot> ac <dot> uk
 * 
 * @file		CellularAutomata.java
 * @version		1.0
 * @date		05/26/2011
 * 
 * Copyright (c) 2011 Chris Atkin. All rights reserved.
 */

public interface CellularAutomata
{
	/**
	 * Get the name of the CA
	 */
	public String getName();
	
	/**
	 * 
	 */
	public int rules(int a, int b, int c);
	
	/**
	 * 
	 */
	public int[] line(int line);
}

/* End of file CellularAutomata.java */
/* Location: ./src/CellularAutomata.java */