package ticTacTow;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;

public class TTW_X {

	/* Variable declaration */
	private Color color;
	private Rectangle2D.Double bounds;
	boolean isVisible = false;

	public TTW_X(Rectangle2D.Double bounds, Color c) {
		setBounds(bounds);
		color = c;
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
