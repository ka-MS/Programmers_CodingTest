package Level0;

public class ����369 {

	public static void main(String[] args) {
		// �Ӿ��̴� ģ����� 369������ �ϰ� �ֽ��ϴ�. 369������ 1���� ���ڸ� �ϳ��� ��� 3, 6, 9�� ���� ���ڴ� ���� ��� 3, 6,
		// 9�� ������ŭ �ڼ��� ġ�� �����Դϴ�. �Ӿ��̰� ���ؾ��ϴ� ���� order�� �Ű������� �־��� ��, �Ӿ��̰� �ľ��� �ڼ� Ƚ����
		// return �ϵ��� solution �Լ��� �ϼ��غ�����.
		int order = 10;
		int answer = 0;
		while(order != 0) {
			if(order%10%3 == 0 && order%10 != 0) answer++;
			order = order/10;
		}
		System.out.println(answer);
	}

}
