package ru.job4j.condition;

public class SwitchWeek {
	
	/**
	 * The method returns the name of the day of the week by its ordinal number.
	 *
	 * @param day ordinal number
	 */
	public static String nameOfDay(int day) {
		return switch (day) {
			case 1 -> "Понедельник";
			case 2 -> "Вторник";
			case 3 -> "Среда";
			case 4 -> "Четверг";
			case 5 -> "Пятница";
			case 6 -> "Суббота";
			case 7 -> "Воскресенье";
			default -> "Ошибка";
		};
	}
}
