package chapter01.exercise;

import java.util.ArrayList;
import java.util.Collections;

public class Ex13 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>(49);
		ArrayList<Integer> result = new ArrayList<>(6);
		
		for(int i = 1 ; i <= 49; i++) {
			list.add(i);
		}
		
		for(int i = 0 ; i < 6; i++) {
			int temp = (int)(Math.random() * (list.size() + 1));
			result.add(list.remove(temp));
		}
		
		Collections.sort(result);
		
		System.out.println(result);

	}

}
