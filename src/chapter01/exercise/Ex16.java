package chapter01.exercise;

public class Ex16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static double average(double... values) {
		double sum = 0;
		
		for(double v : values) {
			sum += v;
		}
		
		return values.length == 0 ? 0 : sum / values.length;
	}
	
	public static double average2(double first, double... values) {
		double sum = first;
		
		for(double v : values) {
			sum += v;
		}
		
		return  sum / (values.length + 1);
	}

}
