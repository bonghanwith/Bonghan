package chapter02.exercise;

/*
 * 4. 자바에서 두 int 변수의 내용을 맞바꾸는 메서드를 구현 할 수 없는 이유는 무엇인가? 대신 두 intHolder 객체의 내용을 맞바꾸는 메서드를 작성하라(API 문서에서 잘 알려지지 않은 intHolder 클래스를 찾아보자) 두 Integer 객체의 내용을 맞바꿀 수 있는가?
 * 
 * A. 8버전까지는 org.omg.CORBA 패키지가 있으나 버전 10은 없어짐.
 *    기본 타입은 참조가 아닌 값 전달이기 때문에 메서드를 통해서  맞바꾸기는 할 수 없음.
 */
public class Ex04 {

	public class IntHolder {
		private int value;
		
		public int getValue() {
			return value;
		}

		public void setValue(int value) {
			this.value = value;
		}

		public IntHolder(){
			
		}
		
		public IntHolder(int value) {
			this.value = value;
		}
		
		@Override
		public String toString() {
			return getValue() + "";
		}

	}

	public static void main(String[] args) {
		Ex04 temp = new Ex04();
		IntHolder a = temp.new IntHolder(4);
		IntHolder b = temp.new IntHolder(3);
		
		System.out.println(a + " " + b);
		
		swap(a, b);
		System.out.println(a + " " + b);
		
	}
	
	public static void swap(IntHolder a, IntHolder b) {
		int temp = a.getValue();
		a.setValue(b.getValue());
		b.setValue(temp);
	}

}

