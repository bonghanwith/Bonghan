package chapter01.exercise;

import java.math.BigInteger;

public class Ex06 {

	public static void main(String[] args) {
		BigInteger result = BigInteger.ONE;
		
		for(int i = 2; i <= 1000; i++) {
			result = result.multiply(BigInteger.valueOf(i));
		}
		
		System.out.println("1000! = " + result);

	}

}
