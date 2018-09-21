package chapter01.exercise;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int first = scanner.nextInt();
		int second = scanner.nextInt();
		int third = scanner.nextInt();
		
		System.out.printf("%d %d %d : %d\n", first, second, third, first < second ? (second >= third ? second : third) : (first >= third ? first : third) );
		System.out.printf("%d %d %d : %d\n", first, second, third, Math.max(Math.max(first, second), third));
		
		//아래 코드는 솔루션에 있는 코드! 그러나 원하는 결과는 나오지 않음. 참고......
		System.out.printf("Largest using ?: %d\n", first >= second ? first : second >= third ? second : third);
		scanner.close();
	}
}
