package chapter01.exercise;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        String line = in.nextLine();
        
        //일반적인 방법
        for(char c : line.toCharArray()){
        	if(c >= 128) {
        		System.out.printf("%s \\u%04x\n", Character.toString((char) c), (int)c);
        	}
        	
        }
        //람다식 이용
        line.chars().forEach(value -> {
            if (value >= 128) {
                System.out.printf("%s \\u%04x\n", Character.toString((char) value), value);
            }
        });
        
        in.close();

	}

}
