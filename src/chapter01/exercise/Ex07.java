package chapter01.exercise;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		short first = (short)scanner.nextInt();
		short second= (short)scanner.nextInt();
		
		//변환전
		System.out.println(first + second);
		System.out.println(first - second);
		System.out.println(first * second);
		System.out.println(first / second);
		
		//변환후
		System.out.println(convert(first) + convert(second));
		System.out.println(convert(first) - convert(second));
		System.out.println(convert(first) * convert(second));
		System.out.println(convert(first) / convert(second));
		
		
		scanner.close();
		

	}
	
	public static long convert(short value) {
		return value >= 0 ? value : 2L * Short.MAX_VALUE + value + 2;
	}

}
