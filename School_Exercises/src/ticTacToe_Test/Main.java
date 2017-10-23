package ticTacToe_Test;

import java.awt.Color;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;

import ticTacToe.TTT_Grid_Piece;

public class Main {

	private boolean running = true;
	private final ArrayList<Gird_Piece> grid = new ArrayList<>();
	
	public static void main(String[] args) {
		new Main();
	}
	
	public Main()
	{
		while(running)
		{
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++)
					grid.add(null);
			}
		}
	}

}