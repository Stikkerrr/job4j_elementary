package ru.job4j.condition;

public class Game {
	
	/**
	 * The menu method starts the game,
	 * the name of which is passed in the parameter
	 * @param name of the game
	 */
	public static void menu(String name) {
		if (name.equals("super mario")) {
			System.out.println("Start - super mario");
		}
		if (name.equals("tanks")) {
			System.out.println("Start - tanks");
		}
		if (name.equals("tetris")) {
			System.out.println("Start - tetris");
		}
	}
	
	public static void main(String[] args) {
		Game.menu("tanks");
	}
}
