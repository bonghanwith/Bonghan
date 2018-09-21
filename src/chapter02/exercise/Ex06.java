package chapter02.exercise;

import chapter02.exercise.Ex05.Point;

public class Ex06 {
	public static class Point extends Object{
		private double x, y;
		
		/**
		 * 
		 * @return X좌료를 반환
		 */
		public double getX() {
			return x;
		}

		/**
		 * 
		 * @param x X좌료를 설정
		 */
		public void setX(double x) {
			this.x = x;
		}

		/**
		 * 
		 * @return Y좌료를 반환
		 */
		public double getY() {
			return y;
		}

		/**
		 * 
		 * @param y Y좌료를 설정
		 */
		public void setY(double y) {
			this.y = y;
		}

		/**
		 * 기본 생성자
		 */
		public Point() {
			
		}
		
		/**
		 * X좌표와 Y좌표를 설정
		 * @param x X좌표 값
		 * @param y Y좌표 값
		 */
		public Point(double x , double y) {
			this.x = x;
			this.y = y;
		}
		
		/**
		 * X, Y 값 만큼 좌표를 이동 
		 * @param x X좌표 값
		 * @param y Y좌표 값
		 */
		public void translate(double x, double y) {
			this.x += x;
			this.y += y;
		}
		
		/**
		 * 축척값을 적용
		 * @param value 축척값
		 */
		public void scale(double value) {
			this.x *= value;
			this.y *= value;
		}
		
		@Override
		public boolean equals(Object point) {
			if(point instanceof Point) {
				Point temp = (Point)point;
				return this.x == temp.x && this.y == temp.y;
			}
			
			return false;
		}
		
		@Override
		/**
		 * 
		 */
		public String toString() {
			return "[" + this.x + "," + this.y + "]";
		}	
	}

	public static void main(String[] args) {
		Point p = new Point(3, 4);
		p.translate(1, 3);
		p.scale(0.5);
		System.out.println(p);
	}
}
