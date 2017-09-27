package ticTacTow;

import java.awt.Dimension;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class TTW_Frame extends JFrame {

	/* Variable declaration */
	private final static int WIDTH = 617, HEIGHT = 648; // Finals for the frame's size
	private TTW_Panel panel;

	public static void main(String[] args) {
		new TTW_Frame();
	}

	public TTW_Frame() {
		/* Frame setup */
		setTitle("Tic Tac Tow!"); // Sets the frame's title
		setResizable(false); // Makes the frame's dimensions permanent
		setMinimumSize(new Dimension(WIDTH, HEIGHT)); // Sets the size of the frame
		setVisible(true); // Makes the frame visible
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Makes the program terminate when the frame closes

		/* Adds panel */
		panel = new TTW_Panel(this);
		add(panel);

		validate();
		pack();
	}

	/* Gives the panel */
	public TTW_Panel getPanel() {
		return panel;
	}

}
