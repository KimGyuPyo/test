package week3;

public class DoWhileEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c = 'a';
		
		do {		
			System.out.print(c);		
			c = (char)(c + 1);
		} while(c <= 'z');
		
		// 'while'의 경우, 조건이 안맞으면 작업문을 실행하지 않지만, 'do-while'의 경우, 작업문을 최소 한번은 실행.
		
	}

}		// input : 'a'
		// output : abcdefghijklmnopqrstuvwxyz

		// do-while loop 의 기본 형태
		// do {
		//		작업문
		// } while(조건식);     semicolon 꼭 붙이기.