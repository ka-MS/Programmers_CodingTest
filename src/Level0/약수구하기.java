package Level0;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.IntStream;

public class ������ϱ� {

	public static void main(String[] args) {
		//���� n�� �Ű������� �־��� ��, n�� ����� ������������ ���� �迭�� return�ϵ��� solution �Լ��� �ϼ����ּ���.
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
		
		// ��Ʈ�� ��� ����
		arr.stream().mapToInt(e -> e).toArray();
		
		//��Ʈ��Ʈ�����
		IntStream.rangeClosed(1, n).filter(i -> n % i == 0).toArray();
	}

}
