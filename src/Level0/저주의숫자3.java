package Level0;

public class �����Ǽ���3 {

	public static void main(String[] args) {
		// 3x ���� ������� 3�� ������ ���ڶ�� �����ϱ� ������ 3�� ����� ���� 3�� ������� �ʽ��ϴ�. 3x ���� ������� ���ڴ� ������ �����ϴ�.
		//10����	3x �������� ���� ����	10����	3x �������� ���� ����
		//1	1	6	8
		//2	2	7	10
		//3	4	8	11
		//4	5	9	14
		//5	7	10	16
		//���� n�� �Ű������� �־��� ��, n�� 3x �������� ����ϴ� ���ڷ� �ٲ� return�ϵ��� solution �Լ��� �ϼ����ּ���.
		int n = 40;
		int answer = 0;
		for(int i = 0; i < n ; i++) {
			answer++;
			while(answer % 3 == 0 || String.valueOf(answer).indexOf("3") != -1) {
				answer++;
			}
		}
		System.out.println(answer);
	}

}
