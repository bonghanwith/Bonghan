package chapter02.exercise;

import java.time.LocalDate;

/**
 * 1. 달력 출력 프로그램을 수정해서 일요일부터 한주를 시작하게 하라. 또한 끝에 줄 넘김을 한번만 출력하게 만든다.
 * @author bongh
 *
 */
public class Ex01 {

	public static void main(String[] args) {
		
		LocalDate today = LocalDate.now();
		LocalDate cal = LocalDate.of(today.getYear(), today.getMonth(), 1);
		int end = cal.plusMonths(1).minusDays(1).getDayOfMonth();
		int days = cal.getDayOfWeek().getValue();
		
		printTitle(cal);
		
		//for문을 이용한 방법
		for(int i = 1; i <= end; i++) {
			System.out.printf("%3s\t", i);
			if((i + days -1) % 7 == 6) {
				System.out.println();
			}
		}
		System.out.println("\n");
		
		printTitle(cal);
		
		//while문을 이용한 방법
		while(cal.getMonthValue() == today.getMonthValue()) {
			System.out.printf("%3s\t", cal.getDayOfMonth());
			if(cal.getDayOfWeek().getValue() == 6) {
				System.out.println();
			}
			cal = cal.plusDays(1);
		}
		
		System.out.println("\n");
		
    }

	/**
	 * 달려의 년, 월, 그리고 요일을 출력 한다.
	 * @param cal
	 */
	public static void printTitle(LocalDate cal) {
		System.out.println(cal.getYear() + ", " + cal.getMonthValue());
		System.out.println("SUN\tMON\tTUE\tWED\tTHUR\tFRI\tSAT");
		int startDayOfWeek = cal.getDayOfWeek().getValue() % 7;
		for(int i = 0; i < startDayOfWeek; i++) {
			System.out.print("\t");
		}
	}
	
}
