package ru.job4j.condition;

public class Club {
	
	/**
	 * The method permission determines the possibility of visiting the club.
	 *
	 * @param hasMoney existence of money
	 * @param beFriend having a friend among the staff
	 */
	public static void permission(boolean hasMoney, boolean beFriend) {
		if (hasMoney || beFriend) {
			System.out.println("I can go to the club.");
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
