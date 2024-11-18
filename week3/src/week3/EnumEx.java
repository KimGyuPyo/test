package week3;

public class EnumEx {
	
	enum Week {월, 화, 수, 목, 금, 토, 일}		// enumeration Type, class 안/밖 둘다 선언 가능

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(Week day : Week.values())		// for - each loop		
			System.out.println(day + "요일 ");		// 반복될 때마다 day : 월, 화, 수, 목, 금, 토, 일 로 설정됨 
		
		System.out.println();
		
		for(Week day : Week.values())
			System.out.println(day + "요일 has value " + day.ordinal());	// ordinal : 열거된 순서를 integer value 로 반환
		
		System.out.println();
		
		
		Week weekTest1 = Week.목;
		Week weekTest2 = Week.valueOf("토");			// .valueOf() : return the element in the enumeration Week.
		
		System.out.println(weekTest1);
		System.out.println(weekTest2);
		
		System.out.println();
	}

}		// input : 월, 화, 수, 목, 금, 토, 일
		// output : 월요일
		//			화요일
		//			수요일
		//			목요일
		//			금요일
		//			토요일
		//			일요일
		//			월요일 has value 0
		//			화요일 has value 1
		//			수요일 has value 2
		//			목요일 has value 3
		//			금요일 has value 4
		//			토요일 has value 5
		//			일요일 has value 6
		// 			목
		//			토

// Enumeration : define constant values, index values increase sequentially(0 start), 선언 후 semicolon 사용 x (조심하기)
