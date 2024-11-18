package week3;

import java.util.InputMismatchException;		// InputMismatchException : 정수로 입력받고자 하였지만, 문자를 입력한 경우 예외 발생

import java.util.Scanner;

public class InputException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("이름, 나이를 빈칸으로 분리하여 입력하세요");
		Scanner scanner = new Scanner(System.in);
		
		try {			
		String name = scanner.next();		// Exception 발생 가능한 실행문
		System.out.print("이름은 " + name + ", ");
		
		int age = scanner.nextInt();
		System.out.print("나이는 " + age + "살, ");
		
		} catch (InputMismatchException e) {		// Exception Type (InputMismatchException) 선언
			System.out.println("Exception : InputMismatchException");		// Exception 발생 시 호출됨, 예외 없으면 건너뒴
		}
		
		finally {
			scanner.close();	 // Exception 발생 여부와 상관없이 무조건 실행, 생략해도됨
		}

	}

}		// input : 김규표 이십삼살
		// output : 이름은 김규표, Exception : InputMismatchException
		// try-catch-finally : if-else 와 달리 조건문 check 안하고 순차적으로 실행된다.