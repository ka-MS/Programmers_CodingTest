package Level0;

import java.util.Arrays;

public class ���ڿ������ϱ�2 {

	public static void main(String[] args) {
		// ���� ��ҹ��ڷ� �̷���� ���ڿ� my_string�� �Ű������� �־��� ��, my_string�� ��� �ҹ��ڷ� �ٲٰ� ���ĺ� ������� ������
		// ���ڿ��� return �ϵ��� solution �Լ��� �ϼ��غ�����.
		String my_string = "Bcad";
		String answer = "";
		my_string = my_string.toLowerCase();
		char[] arr = my_string.toCharArray();
		Arrays.sort(arr);
		answer = new String(arr);
		System.out.println(answer);
		
	}

}
