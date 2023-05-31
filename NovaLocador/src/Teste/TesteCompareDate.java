package Teste;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class TesteCompareDate {
	public static void main(String[] args) {
		
		LocalDate independenceDay = LocalDate.of(2023, 5, 4);
		LocalDate christmas = LocalDate.now();

		System.out.println("Until christmas: " + independenceDay.until(christmas));
		System.out.println("Until christmas (with crono): " 
		   + independenceDay.until(christmas, ChronoUnit.DAYS));
	}
}