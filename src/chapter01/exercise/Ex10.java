package chapter01.exercise;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		long value = scanner.nextLong();
		//value = Math.random() * 100_000_000L
		
		System.out.println(value + " : " + Long.toString(value, 36));

	}

}
