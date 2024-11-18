package week3;

import java.util.Scanner;

public class ArrayEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int i;
		double sum = 0.0, avg;
		double dnum[] = new double[5];		// Array Declaration, Instantiation (1차원)
		
		System.out.println("length of dnum array: " + dnum.length);		// array.length -> 배열의 길이
		System.out.print("uninitialized dnum[] values: ");
		
		for (i = 0; i < dnum.length; i++)			// initialization 을 하지 않았을 경우, Array 에 저장된 값을 출력
			System.out.print(dnum[i] + " ");		// double 형의 경우 without initialization 일때, 0.0이 기본값. 
													//	(byte, short, int, long = 0)(float, double = 0.0)
		
		System.out.println();
		
		for (i = 0; i < dnum.length; i++) {
			System.out.print("dnum[" + i + "] value: ");
			dnum[i] = scanner.nextDouble();		// 데이터를 입력받아 double 형태로 array 에 저장
		}
		
		for (i = 0; i < dnum.length; i++)
			sum += dnum[i];		// 입력받은 array 요소들의 합 계산
		
		System.out.println("sum of the array elements: " + sum);
		avg = sum / dnum.length;		// array 요소들의 합 / array 요소들의 개수 = 평균
		System.out.println("the average of the array elements: " + avg);
		
		scanner.close();
	}

}		

// input : 101.2, 210.3, 330.4, 460.5, 600.6
// output : sum of the array elements : 1703.0
//			the average of the array elements : 340.6
// scanner 사용 후 'scanner.close();'를 써서 Warning 줄이기
// Array 에서 'Declaration', 'Instantiation', 'Initialization' 3가지 기억하기.
