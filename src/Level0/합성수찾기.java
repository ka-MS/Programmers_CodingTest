package Level0;

public class �ռ���ã�� {

	public static void main(String[] args) {
		// ����� ������ �� �� �̻��� ���� �ռ������ �մϴ�. �ڿ��� n�� �Ű������� �־��� �� n������ �ռ����� ������ return�ϵ���
		// solution �Լ��� �ϼ����ּ���.
		int n = 15;
		int answer = 0;
		for (int i = 1; i <= n; i++) {
			int j = 0;
			for (int k = 1; k <= n; k++) {
				if(i%k == 0) {
					j++;
				}
			}
			if(j >= 3) {
				answer++;
			}
		}
		System.out.println(answer);

	}

}
