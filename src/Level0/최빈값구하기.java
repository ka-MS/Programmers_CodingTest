package Level0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class �ֺ󰪱��ϱ� {

	public static void main(String[] args) {
		// �ֺ��� �־��� �� �߿��� ���� ���� ������ ���� �ǹ��մϴ�. ���� �迭 array�� �Ű������� �־��� ��, �ֺ��� return �ϵ���
		// solution �Լ��� �ϼ��غ�����. �ֺ��� ���� ���� -1�� return �մϴ�.
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
		
		//Map���� �ٽ� Ǯ��
		
	}

}
