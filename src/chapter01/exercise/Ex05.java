package chapter01.exercise;

public class Ex05 {

	public static void main(String[] args) {
		double i = Integer.MAX_VALUE + 1.0;
		System.out.println(Integer.MAX_VALUE + " " + (int)i + " " + i);
		
		//계산되는 값이 double아닐 경우 다른 값이 출력됨
		int temp = (int)(Integer.MAX_VALUE + 1);
		System.out.println(temp);

	}

}
