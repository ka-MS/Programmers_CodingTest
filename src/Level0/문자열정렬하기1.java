package Level0;

import java.util.Arrays;

public class ���ڿ������ϱ�1 {

	public static void main(String[] args) {
		// ���ڿ� my_string�� �Ű������� �־��� ��, my_string �ȿ� �ִ� ���ڸ� ��� �������� ������ ����Ʈ�� return �ϵ���
		// solution �Լ��� �ۼ��غ�����.
		String my_string = "hi12392";
		my_string = my_string.replaceAll("[a-z]", "");
		int[] answer = new int[my_string.length()];
		for(int i = 0; i<answer.length; i++) {
			answer[i] = Integer.parseInt(my_string.substring(i, i+1));
		}
		Arrays.sort(answer);
		System.out.println(answer[4]);
		
	}

}
