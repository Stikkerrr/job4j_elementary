package ru.job4j.condition;

public class Triangle {
	
	/**
	 * The method checks for the existence of a triangle with sides the size of which is passed as arguments
	 *
	 * @param ab first side
	 * @param ac second side
	 * @param bc third side
	 */
	public static boolean exist(double ab, double ac, double bc) {
		return ab + ac > bc && ac + bc > ab && ab + bc > ac;
	}
}
