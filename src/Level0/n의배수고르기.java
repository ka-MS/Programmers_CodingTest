package Level0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class n�ǹ������ {

	public static void main(String[] args) {
		// ���� n�� ���� �迭 numlist�� �Ű������� �־��� ��, numlist���� n�� ����� �ƴ� ������ ������ �迭�� return�ϵ���
		// solution �Լ��� �ϼ����ּ���.
		int n = 3;
		int[] numlist = {4, 5, 6, 7, 8, 9, 10, 11, 12};
		List<Integer> arr = new ArrayList<Integer>();
		for(int i : numlist) {
			if(i%n == 0 ) {
				arr.add(i);
			}
		}
		int[] answer = new int[arr.size()];
		for(int i = 0; i < arr.size(); i++) {
			answer[i] = arr.get(i);
		}
		
		//stream����Ͽ� ó��
		Arrays.stream(numlist).filter(value -> value % n == 0).toArray();
	}

}
