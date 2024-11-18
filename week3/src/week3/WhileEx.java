package week3;

public class WhileEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c = 'a';
		
		while(c <= 'z') {		// a ~ z 까지 순서대로 출력
			System.out.print(c);	
			c = (char)(c + 1);	
		}		// while : 조건문 (c <= 'z') 안의 내용이 'True'일 경우, 작업문을 실행. 'False'일 경우, while loop 빠져나옴. 

	}

}		// input : 'a'
		// output : abcdefghijklmnopqrstuvwxyz

		// while loop 의 기본 형태
		// while (조건식) {
		//		작업문
		// }
		// 조건문이 참일 경우 -> loop 실행 (작업문 실행)
		// 조건문이 거짓일 경우 -> loop 탈출