package ru.job4j.condition;

public class PointEq {
	
	/**
	 * Method checks the equivalence of two points
	 *
	 * @param x1 the x-coordinate of the first point
	 * @param y1 the y-coordinate of the first point
	 * @param x2 the x-coordinate of the second point
	 * @param y2 the y-coordinate of the second point
	 */
	public static boolean eq(int x1, int y1, int x2, int y2) {
		return (x1 == x2) && (y1 == y2);
	}
	
	public static void main(String[] args) {
		System.out.println(eq(1, 1, 2, 2));
		System.out.println(eq(10, 10, 10, 10));
	}
}
