package chapter01.exercise;

import java.util.Scanner;
import java.util.ArrayList;

public class Ex14 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        ArrayList<Integer> data = new ArrayList<>();
        int dim = 0;
        for (String line = in.nextLine(); !line.isEmpty(); line = in.nextLine()) {
            String[] parts = line.split(" ");
            dim = parts.length;
            for (String part : parts) {
                data.add(Integer.valueOf(part));
            }
        }
        
        boolean isMagic = false;
        int sum = 0;
        for (int i = 0; i < dim; i++) {
            sum += data.get(i);
        }
        // Check diagonals
        int diaglrSum = 0;
        int diagrlSum = 0;
        for (int row = 0; row < data.size() / dim; row++) {
            // Check rows
            int rowSum = 0;
            for (int col = row * dim; col < (row + 1) * dim; col++) {
                rowSum += data.get(col);
            }
            if (rowSum != sum) {
            	isMagic  = false;
            	break;
            }
            // Check columns
            int colSum = 0;
            for (int col = row; col < data.size(); col = col + dim) {
                colSum += data.get(col);
            }
            if (colSum != sum) {
            	isMagic  = false;
            	break;

            }
            diaglrSum += data.get(row * dim + row);
            diagrlSum += data.get((dim - row - 1) * dim + (dim - row - 1));
        }
        
        isMagic = diaglrSum == sum && diagrlSum == sum;
        
        System.out.printf("Is Magic?: %b\n", isMagic);
        
        
        
        
        in.close();

	}

}
