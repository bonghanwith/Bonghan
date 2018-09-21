package chapter01.exercise;

public class Ex04 {

	public static void main(String[] args) {
		System.out.println("양의 Double 최소값 : " + Math.nextUp(0.0));
		System.out.println("양의 Double 최대값 : " + Math.nextDown(Double.POSITIVE_INFINITY));
		
		
		System.out.println("양의 Double 최소값 : " + Math.nextUp(1.1));
		System.out.println("양의 Double 최대값 : " + Math.nextDown(1.1));
		System.out.println(Double.MAX_VALUE);

	}

}
