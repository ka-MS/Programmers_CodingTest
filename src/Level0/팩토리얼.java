package Level0;

public class ���丮�� {

	public static void main(String[] args) {
		// i ���丮�� (i!)�� 1���� i���� ������ ���� �ǹ��մϴ�. ������� 5! = 5 * 4 * 3 * 2 * 1 = 120 �Դϴ�. ����
		// n�� �־��� �� ���� ������ �����ϴ� ���� ū ���� i�� return �ϵ��� solution �Լ��� �ϼ����ּ���.
		int n = 7;
		int answer = 0;
		int i = 1;
		while(n >= i) {
			answer++;
			i = answer*i;
			if(i == n) {
				break;
			}else if(i > n) {
				answer = answer -1;
				break;
			}
		}
		System.out.println(answer);
	}

}
