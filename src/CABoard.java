/**
 * CASimulator
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
 
import java.awt.Point;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.image.BufferedImage;
import java.awt.image.WritableRaster;
import java.awt.image.ColorModel;
import javax.swing.JPanel;

public class CABoard extends JPanel
{
	private BufferedImage board;
	private WritableRaster raster;
	private ColorModel cmodel;
	private Dimension dimensions;
	private CellularAutomata ca;
	
	// --------------------------------------------------------------------------
	
	public CABoard(Dimension dimensions, CellularAutomata ca)
	{
		this.dimensions = dimensions;
		this.ca = ca;
		this.board = new BufferedImage((int) dimensions.getWidth(), (int) dimensions.getHeight(), BufferedImage.TYPE_INT_RGB);
		this.raster = this.board.getRaster();
		this.cmodel = this.board.getColorModel();
	}
	
	public void setTile(Point coord, Color color)
	{
		raster.setDataElements((int) coord.getX(), (int) coord.getY(), cmodel.getDataElements(color.getRGB(), null));
	}
	
	public void render()
	{
		
	}
}

/* End of file CASimulator.java */
/* Location: ./src/CASimulator.java */