package Level0;

import java.util.Arrays;

public class ArraySplit {

	public static void main(String[] args) {
		// 정수 배열 numbers와 정수 num1, num2가 매개변수로 주어질 때, numbers의 num1번 째 인덱스부터 num2번째
		// 인덱스까지 자른 정수 배열을 return 하도록 solution 함수를 완성해보세요.
		int[] numbers = {1,2,3,4,5,6,7,8};
		int num1 = 2;
		int num2 = 7;
		//Arrays로 풀기
//		int[] arr = Arrays.copyOfRange(numbers, num1, num2+1);
//		for(int k : arr) {
//			System.out.println(k);
//		}
		
		int[] result = new int[num2-num1+1];
		int k = 0;
		for(int i = num1; i<=num2; i++) {
			result[k] = numbers[i];
			System.out.println(result[k]);
			k++;
		}
		
	}

}
