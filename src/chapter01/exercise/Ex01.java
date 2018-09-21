package chapter01.exercise;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		//@SuppressWarnings( "resource" )
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		
		//radix를 설정하여 진수 표현 항법.
		System.out.printf(" 2진수 : %s\n", Integer.toString(input, 2)); //
		System.out.printf(" 8진수 : %s\n", Integer.toString(input, 8));
		System.out.printf("16진수 : %s\n", Integer.toString(input, 16));
		System.out.printf("역수   : %a\n ", 1.0/input);
		
		/* toString 이외에 메서드를 이용한 방법
		Integer.toBinaryString(input);
		Integer.toOctalString(input);
		Integer.toHexString(i);
		*/
		
		//formatter를 이용한 방법
		System.out.printf("%o, %h",input, input);
		
		
		scanner.close();
		//추가 
	}

}
