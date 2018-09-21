package chapter02.exercise;

/**
 * 5. 평면에 놓은 점을 기술하는 불변 클래스 Point를 구현하라. 특정 점으로 설정하는 생성자와 원점으로 설정하는 인자 없는 
 * 생성자,  getX, getY, translate, scale 메서드를 구현하라. 
 * translate 메서드는 x와 y 방향으로 주어진 길이만큼 점을 옮긴다. 
 * scale 메서드는 주어진 비율로 두 좌표의 크기를 조절한다. 
 * 결과로 새로운 점을 반환하도록 이 메서드들을 구현하라. 예를 들어 다음 문장은 p를 좌표가 (2,3.5)인 점으로 설정해야 한다. 
 * 
 * Point p = new Point(3,4).translate(1,3).scale(0.5);
 *
 * @author bongh
 *
 */
public class Ex05 {
	
	public static class Point extends Object{
		private double x, y;
		/**
		 * X좌료값을 반환
		 * @return X좌표값
		 */
		public double getX() {
			return x;
		}

		/**
		 * X좌표값을 설정
		 * @param x X좌표값
		 */
		public void setX(double x) {
			this.x = x;
		}

		/**
		 * Y좌표값을 반환
		 * @return Y좌표값
		 */
		public double getY() {
			return y;
		}

		/**
		 * Y좌표값을 설정
		 * @param y Y좌표값
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
		 * X, Y좌표값을 설정
		 * @param x X좌표값
		 * @param y Y좌표값
		 */
		public Point(double x , double y) {
			this.x = x;
			this.y = y;
		}
		
		/**
		 * X, Y값 만큼 이동
		 * @param x X좌표값
		 * @param y Y좌표값
		 * @return 이동된 Point 객체
		 */
		public Point translate(double x, double y) {
			return new Point(this.x + x, this.y + y);
		}
		
		/**
		 * 축척값을 적용
		 * @param value 축척값
		 * @return 축척이 적용된 객체를 반환
		 */
		public Point scale(double value) {
			return new Point(this.x *= value, this.y *= value);
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
		public String toString() {
			return "[" + this.x + "," + this.y + "]";
		}	
	}

	public static void main(String[] args) {
		Point p = new Point(3, 4).translate(1, 3).scale(0.5);
		System.out.println(p);
	}

}

