package chapter01.exercise;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
        ArrayList<ArrayList<Integer>> result = new ArrayList<>(n);
        for (int row = 0; row <= n; row++) {
        	ArrayList<Integer> nextRow = new ArrayList<>(row + 1);
            if (row == 0) {
                nextRow.add(1);
            } else if (row == 1) {
                nextRow.add(1);
                nextRow.add(1);
            } else {
                ArrayList<Integer> prev = result.get(row - 1);
                nextRow.add(1);
                for (int pos = 1; pos < row; pos++) {
                    nextRow.add(prev.get(pos - 1) + prev.get(pos));
                }
                nextRow.add(1);
            }
            result.add(nextRow);
        }
        
        for(ArrayList<Integer> temp : result) {
        	System.out.println(temp);
        }
        
        in.close();
        

	}

}
