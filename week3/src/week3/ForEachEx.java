package week3;

public class ForEachEx {
	
	enum Week {월, 화, 수, 목, 금, 토, 일}		// enumeration Type

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] n = {1, 2, 3, 4, 5};		// Array Declaration, Instantiation, Initialization (1차원)
		String names[] = {"사과", "배", "바나나", "체리", "딸기", "포도"};		
		
		int sum = 0;
		
		for(int k : n) {					// for - each loop, 
			System.out.print(k + " ");		// 반복될 때마다 k : 1, 2, 3, 4, 5 로 설정됨.
			sum += k;
		}
		System.out.println(" -> 합은 " + sum);
		
		for(String s : names) {				// for - each loop, 
			System.out.print(s + " ");		// 반복될 때마다 s : 사과, 배, 바나나, 체리, 딸기, 포도 로 설정됨.
		}
		System.out.println();
		
		for (Week day : Week.values()) {		// for - each loop, 
			System.out.print(day + "요일");		// 반복될 때마다 day : 월, 화, 수, 목, 금, 토, 일 로 설정됨 
		}
		System.out.println();

	}

}		// input : 1, 2, 3, 4, 5   
		//		   사과, 배, 바나나, 체리, 딸기, 포도
		//		   월, 화, 수, 목, 금, 토, 일
		// output : 1, 2, 3, 4, 5 -> 합은 15
		//			사과 배 바나나 체리 딸기 포도
		//			월요일화요일수요일목요일금요일토요일일요일

		//  for - each loop		
		//  for (type variableName : arrayName) : for 문 반복될때마다 variable 은 array[0], array[1], .... 값으로 설정됨.