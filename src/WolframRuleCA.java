/**
 * CASimulator
 * 
 * @license		CC BY-SA 3.0
 * @author		Chris Atkin
 * @link		http://chrispyslice.wordpress.com
 * @email		v2t04 <at> students <dot> keele <dot> ac <dot> uk
 * 
 * @file		
 * @version		1.0
 * @date		05/26/2011
 * 
 * Copyright (c) 2011 Chris Atkin. All rights reserved.
 */
 
public class WolframRuleCA implements CellularAutomata
{
	private int rule, generation;
	private String name;
	private int[] ruleset = new int[8];
	private int[] cells;

	// --------------------------------------------------------------------------

	public WolframRuleCA(int rule)
	{
		if(rule > 255) throw new IllegalArgumentException("Invalid WolframRuleCA rule number");
		this.rule = rule;
		this.name = new String("Wolfram Rule [rule " + rule + "]");
		
		generateRuleset();
	}
	
	/**
	 * Generate the ruleset for the CA based on the Wolfram number
	 */
	private void generateRuleset()
	{
		for(int i = 0; i < 8; i++) ruleset[i] = (int) Math.round(Math.random());
	}
	
	public int rules(int a, int b, int c)
	{
		if (a == 1 && b == 1 && c == 1) return ruleset[0];
		if (a == 1 && b == 1 && c == 0) return ruleset[1];
		if (a == 1 && b == 0 && c == 1) return ruleset[2];
		if (a == 1 && b == 0 && c == 0) return ruleset[3];
		if (a == 0 && b == 1 && c == 1) return ruleset[4];
		if (a == 0 && b == 1 && c == 0) return ruleset[5];
		if (a == 0 && b == 0 && c == 1) return ruleset[6];
		if (a == 0 && b == 0 && c == 0) return ruleset[7];
		return 0;
	}
	
	public int[] line(int line)
	{
		int[] i = {0, 1};
		return i;
	}
	
	public String getName()
	{
		return name;
	}
}