package Level0;

import java.util.Arrays;

public class ArraySplit {

	public static void main(String[] args) {
		// ���� �迭 numbers�� ���� num1, num2�� �Ű������� �־��� ��, numbers�� num1�� ° �ε������� num2��°
		// �ε������� �ڸ� ���� �迭�� return �ϵ��� solution �Լ��� �ϼ��غ�����.
		int[] numbers = {1,2,3,4,5,6,7,8};
		int num1 = 2;
		int num2 = 7;
		//Arrays�� Ǯ��
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
