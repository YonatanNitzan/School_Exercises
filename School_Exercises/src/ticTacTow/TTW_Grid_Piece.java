package ticTacTow;

import java.awt.Color;
import java.awt.geom.Rectangle2D;

public class TTW_Grid_Piece {

	/* Variable declaration */
	private TTW_X x;
	private TTW_O o;
	private Rectangle2D.Double bounds;
	public boolean isOccupied = false;

	public TTW_Grid_Piece(Rectangle2D.Double bounds, Color colorX, Color colorO) {
		setBounds(bounds);
		setX(new TTW_X(getBounds(), colorX));
		setO(new TTW_O(getBounds(), colorO));
	}
	
	public void toggle() {
		isOccupied = !isOccupied;
	}

	public TTW_X getX() {
		return x;
	}

	public TTW_O getO() {
		return o;
	}

	public void setX(TTW_X x) {
		this.x = x;
	}

	public void setO(TTW_O o) {
		this.o = o;
	}

	public Rectangle2D.Double getBounds() {
		return bounds;
	}

	public void setBounds(Rectangle2D.Double bounds) {
		this.bounds = bounds;
	}
}
