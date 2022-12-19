package Level0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class 최빈값구하기 {

	public static void main(String[] args) {
		// 최빈값은 주어진 값 중에서 가장 자주 나오는 값을 의미합니다. 정수 배열 array가 매개변수로 주어질 때, 최빈값을 return 하도록
		// solution 함수를 완성해보세요. 최빈값이 여러 개면 -1을 return 합니다.
		int[] array = {1,1,2,3,4,4,5,5,5,6,1};
		int answer = 0;
		int count = 0;
		int controll = -1;
		int last = 0;
		for(int i = 0; i<array.length ; i++) {
			count = 0;
			for(int j = 0; j<array.length; j++) {
				if(controll == array[i]) {
					break;
				}
				if(array[i] == array[j]) {
					count++;
				}
			}
			if(controll != array[i]) {
				if(count > answer) {
					answer = count;
					controll = array[i];
					last = 0;
				}else if(count == answer) {
					last = 1;
				}
			}
			
		}
		if(last == 1) {
			answer = -1;
		}else {
			answer = controll;
		}
		System.out.println(answer);
		
		//Map으로 다시 풀이
		
	}

}
