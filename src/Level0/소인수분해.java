package Level0;

import java.util.TreeSet;

public class ���μ����� {

	public static void main(String[] args) {
		// ���μ����ض� � ���� �Ҽ����� ������ ǥ���ϴ� ���Դϴ�. ���� ��� 12�� ���μ� �����ϸ� 2 * 2 * 3 ���� ��Ÿ�� �� �ֽ��ϴ�.
		// ���� 12�� ���μ��� 2�� 3�Դϴ�. �ڿ��� n�� �Ű������� �־��� �� n�� ���μ��� ������������ ���� �迭�� return�ϵ���
		// solution �Լ��� �ϼ����ּ���.
		int n = 377;
		int[] answer = new int[3];
		TreeSet<Integer> arr = new TreeSet<Integer>();
 		int i = 2;
		while(n != 1) {
			if(n % i == 0) {
				n = n/i;
				arr.add(i);
				i = 2;
			}else {
				i++;
			}
		}
		System.out.println(arr);
	}
}
