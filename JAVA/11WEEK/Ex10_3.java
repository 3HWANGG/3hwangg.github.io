// 예외 처리 ArrayIndexOutOfBoundsException 발생 화면
package org.javaro.lecture;
public class Ex10_3 {
	public static void main(String[] args) {
		try {		// java  Ex10_3	10 20
			System.out.println("매개변수로 받은 두개의 값");
			int a = Integer.parseInt(args[0]);		// 콘솔 입력 문자열을 정수로 변환
			int b = Integer.parseInt(args[1]);
			System.out.println("a="+a+", b="+b );
			System.out.println("a/b="+(a/b));
			System.out.println("나누기 수행됨");
		}catch(ArithmeticException e) {		// java Ex10_3	10 0
			System.out.println("ArithmeticException 처리루틴:");
			System.out.println(e+" 예외발생");
		}catch(ArrayIndexOutOfBoundsException e) {		// java Ex10_3	10
			System.out.println("ArrayIndexOutOfBoundsException 처리루틴:");
			System.out.println(e+" 예외발생");
		}catch(NumberFormatException e) {		// java Ex10_3	10 b
			System.out.println("NumberFormatException 처리루틴:");
			System.out.println(e+" 예외발생");
		}finally {
			System.out.println("예외처리후 finally 블럭 수행함");
		}
	}
}
