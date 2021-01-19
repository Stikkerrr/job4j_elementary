package ru.job4j;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Info {
	
	public static void main(String[] args) {
		Calendar   calendar   = new GregorianCalendar();
		DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
		
		System.out.println(dateFormat.format(calendar.getTime()));
	}
}
