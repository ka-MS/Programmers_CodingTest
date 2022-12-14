package Level0;

import java.util.ArrayList;
import java.util.Arrays;

public class CommonFactor {

	public static void main(String[] args) {
		// ù ��° �м��� ���ڿ� �и� ���ϴ� denum1, num1, �� ��° �м��� ���ڿ� �и� ���ϴ� denum2, num2�� �Ű�������
		// �־����ϴ�. �� �м��� ���� ���� ��� �м��� ��Ÿ���� �� ���ڿ� �и� ������� ���� �迭�� return �ϵ��� solution �Լ���
		// �ϼ��غ�����.
		int denum1 = 1;
		int num1 = 2;
		int denum2 = 1;
		int num2 = 2;

		int max = 1;
		int[] result = new int[2];
		result[0] = denum1 * num2 + denum2 * num1;
		result[1] = num1 * num2;
		int k = Math.max(result[0], result[1]);
		//�ִ����� ã��
		for (int i = 1; i <= k; i++) {
			if (result[0] % i == 0 && result[1] % i == 0) {
				max = i;
			}
		}
		result[0] = result[0] / max;
		result[1] = result[1] / max;
		System.out.println(max +","+result[0] + "," + result[1]);

	}
	
	//��Ŭ���� ȣ����
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
