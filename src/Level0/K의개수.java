package Level0;

public class K�ǰ��� {

	public static void main(String[] args) {
		// 1���� 13������ ������, 1�� 1, 10, 11, 12, 13 �̷��� �� 6�� �����մϴ�. ���� i, j, k�� �Ű������� �־��� ��,
		// i���� j���� k�� �� �� �����ϴ��� return �ϵ��� solution �Լ��� �ϼ����ּ���.
		int i = 10;
		int j = 50;
		int k = 5;
		int answer =0;
		
		for(int u = i; u <= j ; u++) {
			String num = u+"";
			answer += num.length() - num.replace(k+"", "").length();
		}
		System.out.println(answer);
		

	}

}
