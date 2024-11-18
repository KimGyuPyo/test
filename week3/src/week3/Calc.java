package week3;

public class Calc {

	public static void main(String[] args) {	// public : 접근 제한X (자유롭게 접근가능), static : 객체 생성하지 않더라도 호출가능
		// TODO Auto-generated method stub		   void : return 값 X, String[] : 문자열 배열, args : String[] 배열의 변수
		double sum = 0.0;
		
		for(int i = 0; i < args.length; i++)		// arguments 의 length 만큼 반복 (Program arguments 의 개수 만큼 반복)
			sum += Double.parseDouble(args[i]);		// 문자열에서 double 형으로 변환, 변환한 값을 합산 
		
		// Double.parseDouble(args[i]) : 문자열에서 double 형으로 변환
		
		System.out.println("합계 : " + sum);		// 합산 값 출력

	}

}		// input : 2 20.5 66.8 14
		// output : 합계 : 103.3
