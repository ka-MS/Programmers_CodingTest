package Level0;

import java.util.Arrays;
import java.util.Comparator;

public class ����������ϱ� {

	public static void main(String[] args) {
		// �ܰ��ǻ� �Ӿ��̴� ���޽ǿ� �� ȯ���� ���޵��� �������� ���� ������ ���Ϸ��� �մϴ�. ���� �迭 emergency�� �Ű������� �־��� ��
		// ���޵��� ���� ������� ���� ������ ���� �迭�� return�ϵ��� solution �Լ��� �ϼ����ּ���.

		int[] emergency = { 30, 10, 23, 6, 100 };
		int leng = emergency.length;
		int[] answer = new int[leng];
		int[] arr = emergency.clone();
		Arrays.sort(emergency);
		for (int i = 0; i < leng; i++) {
			int j = 1;
			for (int k = leng-1; k >= 0; k--) {
				if (arr[i] == emergency[k]) {
					answer[i] = j;
				}
				j++;
			}
		}
		
		// �迭�� �׳� �ٿ������� �������簡�Ǿ� ���ι迭���� ���ϸ� ������ ��ü�� ���� ���ϰ� �ȴ�
		// clone() Ȥ�� System.arraycopy() �� ����Ͽ� ���� ���縦 ��ų �� �ִ�.
//		void arraycopy(Object src, int srcPos, Object dest, int destPos, int length);
//		src : ���� �迭 ��ü
//		srcPos : src �迭 ��ü���� ���縦 ������ index
//		des : ����� �迭 ��ü
//		desPos : ����� �迭 ��ü�� ���� index
//		length : ������ �迭�� ����
	}

}
