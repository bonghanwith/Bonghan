package chapter02.exercise;

/**
 * 9. x축을 따라 이동하며 가스를 소비하는 자동차를 모델링하는 Car클래스를 구현하라. 
 * 지정한 마일만큼 드라이브하는 메서드, 지정한 수만큼 가스 탱크에 갤런을 채우는 메서드, 
 * 원점과 연료 레벨로 현재 거리를 구하는 메서드를 구현하라. 
 * 생성자에 갤런당 마일 단위로 연료 효율성을 지정하라. 불변 클래스로 만들어야 하는가? 
 * 그렇거나 그렇지 않은 이유를 제시하라
 * 
 * A.
 * 클래스의 용도상 불변 클래스로 만드는 것 보단 변경 가능한 클래스로 만드는 것이 좋다.
 * 이전에 상태를 기억해야 되고, 또한 공유 될 객체가 될 수 있기 때문이다.
 * @author bongh
 *
 */
public class Ex09 {

	public static class Car{
		private double milesPerGallons, distance, gallons;
		
		/**
		 * 효율성을 설정하는 생성자
		 * @param milesPerGallons 효율성
		 */
		public Car(double milesPerGallons){
			this(milesPerGallons, 10);
		}
		
		/**
		 * 효율성과 갤런을 설정하는 생성자
		 * @param milesPerGallons 효율성
		 * @param gallons 갤런
		 */
		public Car(double milesPerGallons, double gallons) {
			this.milesPerGallons = milesPerGallons;
			this.gallons = gallons;
		}
		
		/**
		 * 효율성을 반환 한다.
		 * @return 효율성
		 */
		public double getMilesPerGallons() {
			return milesPerGallons;
		}

		/**
		 * 현재 운행한 거리를 반환 한다.
		 * @return 운행한 거리
		 */
		public double getDistance() {
			return distance;
		}

		/**
		 * 현재 남은 갤런을 반환 한다.
		 * @return 남은 갤런
		 */
		public double getGallons() {
			return gallons;
		}
		
		/**
		 * 입력한 마일 만큼 달린다.
		 * @param miles 마일
		 */
		public void drive(double miles) {
			double need = miles / this.milesPerGallons;
			if(this.gallons < need) {
				System.out.println("가스가 모자름");
				return;
			}
			
			this.gallons -= need;
			this.distance += miles;
		}
		
		/**
		 * 입력한 갤런만큼 채운다
		 * @param gallons 갤런
		 */
		public void fillGallons(double gallons) {
			this.gallons += gallons;
		}

	}
	public static void main(String[] args) {
		

	}

}
