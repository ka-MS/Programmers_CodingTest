package Level1;

public class �ڸ������ϱ� {

	public static void main(String[] args) {
		// �ڿ��� N�� �־�����, N�� �� �ڸ����� ���� ���ؼ� return �ϴ� solution �Լ��� ����� �ּ���.
		// ������� N = 123�̸� 1 + 2 + 3 = 6�� return �ϸ� �˴ϴ�.
		int n = 123;
		int answer = 0;
		String[] arr = (n+"").split("");
//		for(String i : arr) {
//			answer += Integer.parseInt(i);
//		}
		
		// ����� �����غ��� ���İ� �Ʒ����� ��û�� ����ð� ���̰� ����
		while(n != 0) {
			answer += n%10;
			n = n/10;
		}
		System.out.println(answer);
	}

}
