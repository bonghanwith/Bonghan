package chapter02.exercise;

import java.time.LocalDate;
import static java.lang.System.out;
import static java.time.LocalDate.now;
import static java.time.LocalDate.of;


/**
 * 11. Cal 클래스를 다시 작성해서 System과 LocalDate클래스에 정적 
 * 임포트를 사용하도록 하라.
 * 
 * @author bongh
 *
 */
public class Ex11 {
public static void main(String[] args) {
		
		LocalDate today = now();
		LocalDate cal = of(today.getYear(), today.getMonth(), 1);
		int end = cal.plusMonths(1).minusDays(1).getDayOfMonth();
		int days = cal.getDayOfWeek().getValue();
		
		printTitle(cal);
		
		//for문을 이용한 방법
		for(int i = 1; i <= end; i++) {
			out.printf("%3s\t", i);
			if((i + days -1) % 7 == 6) {
				out.println();
			}
		}
		out.println("\n");
		
		printTitle(cal);
		
		//while문을 이용한 방법
		while(cal.getMonthValue() == today.getMonthValue()) {
			out.printf("%3s\t", cal.getDayOfMonth());
			if(cal.getDayOfWeek().getValue() == 6) {
				out.println();
			}
			cal = cal.plusDays(1);
		}
		
		out.println("\n");
		
    }

	/**
	 * 달려의 년, 월, 그리고 요일을 출력 한다.
	 * @param cal
	 */
	public static void printTitle(LocalDate cal) {
		out.println(cal.getYear() + ", " + cal.getMonthValue());
		out.println("SUN\tMON\tTUE\tWED\tTHUR\tFRI\tSAT");
		int startDayOfWeek = cal.getDayOfWeek().getValue() % 7;
		for(int i = 0; i < startDayOfWeek; i++) {
			out.print("\t");
		}
	}
}
