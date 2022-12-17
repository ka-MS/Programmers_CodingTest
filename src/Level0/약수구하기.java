package Level0;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.IntStream;

public class 약수구하기 {

	public static void main(String[] args) {
		//정수 n이 매개변수로 주어질 때, n의 약수를 오름차순으로 담은 배열을 return하도록 solution 함수를 완성해주세요.
		int n = 24;
		ArrayList<Integer> arr = new ArrayList<Integer>();
		for(int i = 1; i <=n ; i++) {
			if(n%i == 0) {
				arr.add(i);
			}
		}
		Collections.sort(arr);
		int[] answer =  new int[arr.size()];
		for(int i = 0; i <arr.size() ; i++) {
			answer[i] = i;
		}
		
		// 스트림 사용 정렬
		arr.stream().mapToInt(e -> e).toArray();
		
		//인트스트림사용
		IntStream.rangeClosed(1, n).filter(i -> n % i == 0).toArray();
	}

}
