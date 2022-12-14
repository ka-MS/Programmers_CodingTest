package Level0;

import java.util.ArrayList;
import java.util.Arrays;

public class CommonFactor {

	public static void main(String[] args) {
		// 첫 번째 분수의 분자와 분모를 뜻하는 denum1, num1, 두 번째 분수의 분자와 분모를 뜻하는 denum2, num2가 매개변수로
		// 주어집니다. 두 분수를 더한 값을 기약 분수로 나타냈을 때 분자와 분모를 순서대로 담은 배열을 return 하도록 solution 함수를
		// 완성해보세요.
		int denum1 = 1;
		int num1 = 2;
		int denum2 = 1;
		int num2 = 2;

		int max = 1;
		int[] result = new int[2];
		result[0] = denum1 * num2 + denum2 * num1;
		result[1] = num1 * num2;
		int k = Math.max(result[0], result[1]);
		//최대공약수 찾기
		for (int i = 1; i <= k; i++) {
			if (result[0] % i == 0 && result[1] % i == 0) {
				max = i;
			}
		}
		result[0] = result[0] / max;
		result[1] = result[1] / max;
		System.out.println(max +","+result[0] + "," + result[1]);

	}
	
	//유클리드 호제법
	public static int gcd(int a, int b) {
		if (a < b) {
			int temp = a;
			a = b;
			b = temp;
		}
		while (b > 1) {
			int r = a % b;
			if (r == 0) break;
			a = b;
			b = r;
		}
		return b;
	}

}
