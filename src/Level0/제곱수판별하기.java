package Level0;

import java.util.*;
import java.lang.*;

public class �������Ǻ��ϱ� {

	public static void main(String[] args) {
		// � �ڿ����� �������� �� ������ ������ ��������� �մϴ�. ���� n�� �Ű������� �־��� ��, n�� ��������� 1�� �ƴ϶�� 2��
		// return�ϵ��� solution �Լ��� �ϼ����ּ���.
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
		// Math�Լ� ����Ͽ� ��� 
		System.out.println(n%Math.sqrt(n) == 0);
	}

}
