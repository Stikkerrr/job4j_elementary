package ru.job4j.loop;

public class Fitness {
	
	/**
	 * The method calculates the time it takes for Ivan to catch up with Nick in the lifted weight.
	 *
	 * @param ivan weight lifted by Ivan at the start
	 * @param nik  weight lifted by Nick at the start
	 */
	public static int calc(int ivan, int nik) {
		int month = 0;
		while (ivan <= nik) {
			ivan *= 3;
			nik *= 2;
			month++;
		}
		return month;
	}
}
