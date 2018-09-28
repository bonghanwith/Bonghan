package chapter02.exercise;

/**
 * 14. Network 클래스를 컴파일하자. 내부 클래스 파일의 이름이 Network$Member.class임을 유의해야 한다. 
 * 생성된 코드를 javap 프로그램으로 조사해보자 (리눅스 / OS X에서는 javap를 시행할 때 $기호 앞에 \를 붙여야 한다.) 다음 명령은 메서드와 인스턴스 변수를 표시한다.
 * javap -private 클래스명  
 * 외부클래스에 대한 참조가 어디에 있는가?
 * 
 * A. 
 * PS C:\Users\bongh\git\Bonghan> javap -private ./bin/chapter02/exercise/Network.class
 * Compiled from "Network.java"
 * public class chapter02.exercise.Network {
 *  private java.util.ArrayList<chapter02.exercise.Network$Member> members;
 *   public chapter02.exercise.Network();
 *   public chapter02.exercise.Network$Member enroll(java.lang.String);
 *   public java.lang.String toString();
 *   static java.util.ArrayList access$0(chapter02.exercise.Network);
 * }
 * PS C:\Users\bongh\git\Bonghan>
 *
 * @author bongh
 *
 */
public class Ex14 {

}
