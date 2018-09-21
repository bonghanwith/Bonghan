package chapter01.exercise;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int input = scanner.nextInt();
		
		System.out.printf("   %%  이용 : %d\n", input % 360);
		System.out.printf("Math  이용 : %d\n", Math.floorMod(input, 360));
		scanner.close();

	}

}
