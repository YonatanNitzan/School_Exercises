package ticTacToe;

import java.awt.Color;
import java.awt.geom.Rectangle2D;

public class TTT_Grid_Piece {

	/* Variable declaration */
	private TTT_X x;
	private TTT_O o;
	private Rectangle2D.Double bounds;
	public boolean isOccupied = false;

	public TTT_Grid_Piece(Rectangle2D.Double bounds, Color colorX, Color colorO) {
		setBounds(bounds);
		setX(new TTT_X(getBounds(), colorX, this));
		setO(new TTT_O(getBounds(), colorO, this));
	}
	
	public void toggle() {
		isOccupied = !isOccupied;
	}

	public TTT_X getX() {
		return x;
	}

	public TTT_O getO() {
		return o;
	}

	public void setX(TTT_X x) {
		this.x = x;
	}

	public void setO(TTT_O o) {
		this.o = o;
	}

	public Rectangle2D.Double getBounds() {
		return bounds;
	}

	public void setBounds(Rectangle2D.Double bounds) {
		this.bounds = bounds;
	}
}
