package Level0;

import java.util.*;
import java.lang.*;

public class 제곱수판별하기 {

	public static void main(String[] args) {
		// 어떤 자연수를 제곱했을 때 나오는 정수를 제곱수라고 합니다. 정수 n이 매개변수로 주어질 때, n이 제곱수라면 1을 아니라면 2를
		// return하도록 solution 함수를 완성해주세요.
		int n = 144;
		int result = 2;
		for(int i = 1; i<=n ; i++) {
			if(i*i == n) {
				result = 1;
				break;
			}
			if(i > n/2) {
				break;
			}
		}
		System.out.println(result);
		// Math함수 사용하여 출력 
		System.out.println(n%Math.sqrt(n) == 0);
	}

}
