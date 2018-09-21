package chapter01.exercise;

public class Ex09 {

	public static void main(String[] args) {
		// new 키워드를 사용안한 경우
		String str1 = "ABC";
		String str2 = "ABC";
		
		System.out.printf("str1 == str2 -> %b, str1.equals(str2) -> %b\n", str1 == str2, str1.equals(str2));
		
		// new 키워드를 사용한 경우
		str1 = new String("ABC");
		str2 = new String("ABC");
		
		System.out.printf("str1 == str2 -> %b, str1.equals(str2) -> %b", str1 == str2, str1.equals(str2));
	}

}
