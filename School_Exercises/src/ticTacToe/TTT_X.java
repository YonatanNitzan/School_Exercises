package ticTacToe;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;

public class TTT_X {

	/* Variable declaration */
	private Color color;
	private Rectangle2D.Double bounds;
	private TTT_Grid_Piece grid;
	boolean isVisible = false;

	public TTT_X(Rectangle2D.Double bounds, Color c, TTT_Grid_Piece grid) {
		setBounds(bounds);
		color = c;
		this.grid = grid;
	}

	public Rectangle2D.Double getBounds() {
		return bounds;
	}

	public void setBounds(Rectangle2D.Double bounds) {
		this.bounds = bounds;
	}

	public void toggle() {
		isVisible = !isVisible;
	}

	public void tryPaint(Graphics2D g2) {
		if (isVisible) {
			g2.setColor(color);
			g2.fill(bounds);
			g2.setColor(Color.BLACK);
		}
	}
}