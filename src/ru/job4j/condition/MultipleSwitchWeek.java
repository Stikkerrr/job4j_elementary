package ru.job4j.condition;

public class MultipleSwitchWeek {
	
	/**
	 * The method returns the ordinal of the day of the week passed as an argument.
	 *
	 * @param name weekday name
	 */
	public int numberOfDay(String name) {
		return switch (name) {
			case "Понедельник", "Monday" -> 1;
			case "Вторник", "Tuesday" -> 2;
			case "Среда", "Wednesday" -> 3;
			case "Четверг", "Thursday" -> 4;
			case "Пятница", "Friday" -> 5;
			case "Суббота", "Saturday" -> 6;
			case "Воскресенье", "Sunday" -> 7;
			default -> -1;
		};
	}
}
