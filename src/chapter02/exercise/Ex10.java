package chapter02.exercise;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Arrays;

/**
 * 10. RandomNumbers 클래스 안에 정적 메서드 randomElement 두개를 구현하라. 
 * randomElement는 정수의 배열이나 배열 리스트로부터 임의의 요소를 얻는다.
 * (해당 배열이나 배열 리스트가 비여 있으면 0을 반환한다) 이 메서드들은 int[]나 
 * ArrayList<Integer>의 인스턴스 메서드로 만들수 없는 이유는 무엇인가?
 * 
 * A.
 * @author bongh
 *
 */
public class Ex10 {
	
	public static class RandomNumbers{
		public static int randomElement(int[] array) {
			if(array.length == 0) {
				return 0;
			}
			
			int randomElement = array[(int)(Math.random() * array.length)];
			return randomElement;
		}
		
		public static int randomElement(List<Integer> list) {
			if(list.size() == 0) { //list.isEmpty()
				return 0;
			}
			
			int randomElement = list.get((int)(Math.random() * list.size()));
			return randomElement;
		}
	}
	
	public static void main(String [] args) {
		int [] data = {1, 3, 5, 3, 7, 343, 23};
		
		List<Integer> list = Arrays.asList(1, 2, 3, 4);
		ArrayList<Integer> arrayList = new ArrayList<>(list);
		
		System.out.println(RandomNumbers.randomElement(data));
		System.out.println(RandomNumbers.randomElement(list));
	}

}
