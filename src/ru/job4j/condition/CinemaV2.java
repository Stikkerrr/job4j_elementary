package ru.job4j.condition;

public class CinemaV2 {
	
	/**
	 * The method permission determines the possibility of visiting the cinema.
	 * @param allowByParent parental permission
	 * @param hasMoney      existence of money
	 */
	public static void permission(boolean allowByParent, boolean hasMoney) {
		if (allowByParent && hasMoney) {
			System.out.println("I can go to the cinema.");
		} else {
			System.out.println("I can't.");
		}
	}
	
	public static void main(String[] args) {
		permission(true, true);
		permission(true, false);
		permission(false, true);
		permission(false, false);
	}
}
