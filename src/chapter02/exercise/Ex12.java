package chapter02.exercise;

/**
 * ch01.sec01 패키지에 HelloWorld 클래스를 선언하는 HelloWorld.java 파일을 만든다. 
 * 만든 파일을 서브디렉터리 ch01/sec01이 아닌 다른 디렉터리에 넣어둔다. 
 * 해당 디렉터리에서 javac HelloWorld.java 명령을 실행한다. 
 * 클래스 파일이 생겼는가? 그럼 어디서 생겼는가? 이제 java HelloWorld 명령을 실행해보자. 
 * 무슨일이 일어나는가? 그 이유는 무엇인가? (힌트 : javap HelloWorld 명령을 실행한 후 경고 메세지를 연구한다) 
 * 마지막으로 javac -d. HelloWorld.java 명령을 실행해보자. 이 방법이 더 좋은 이유는 무엇인가?
 * 
 * A.
 * PS C:\Users\bongh\git\Bonghan\SourceCode\code\ch01\sec02> javac .\HelloWorld.java
 * PS C:\Users\bongh\git\Bonghan\SourceCode\code\ch01\sec02> java .\HelloWorld
 * 오류: 기본 클래스 .\HelloWorld을(를) 찾거나 로드할 수 없습니다.
 * 원인: java.lang.ClassNotFoundException: /\HelloWorld
 * PS C:\Users\bongh\git\Bonghan\SourceCode\code\ch01\sec02>
 * 
 * PS C:\Users\bongh\git\Bonghan\SourceCode\code\ch01\sec02> javap .\HelloWorld.class
 * Compiled from "HelloWorld.java"
 * public class ch01.sec01.HelloWorld {
 * public ch01.sec01.HelloWorld();
 * public static void main(java.lang.String[]);
 * 
 * PS C:\Users\bongh\git\Bonghan\SourceCode\code\ch01\sec02> javac -d . .\HelloWorld.java
 * 
 * PS C:\Users\bongh\git\Bonghan\SourceCode\code\ch01\sec02> java ch01.sec01.HelloWorld
 * Hello, World!
 * PS C:\Users\bongh\git\Bonghan\SourceCode\code\ch01\sec02>
 * @author bongh
 *
 */
public class Ex12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
