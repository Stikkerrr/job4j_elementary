package ru.job4j.condition;

public class ChessBoard {
	
	/**
	 * The method calculates how many cells the Bishop has moved during the move.
	 * @param x1 the coordinate of the initial position of the figure along the x-axis
	 * @param y1 the coordinate of the initial position of the figure along the y-axis
	 * @param x2 the coordinate of the final position of the figure along the x-axis
	 * @param y2 the coordinate of the final position of the figure along the y-axis
	 */
	public static int way(int x1, int y1, int x2, int y2) {
		int result = Math.abs(x2 - x1);
		return Math.abs(x2 - x1) == Math.abs(y2 - y1) ? result : 0;
	}
}
