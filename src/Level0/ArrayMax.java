package Level0;

import java.util.Arrays;

public class ArrayMax {

	public static void main(String[] args) {
		// ���� �迭 numbers�� �Ű������� �־����ϴ�. numbers�� ���� �� �� ���� ���� ���� �� �ִ� �ִ��� return�ϵ���
		// solution �Լ��� �ϼ����ּ���.
		int[] arr = { 6, 1, 2, 3, 4, 5 };
		Arrays.sort(arr);
		System.out.println(arr[arr.length - 1] * arr[arr.length - 2]);
	}

}
