package Level0;

public class ���ѼҼ��Ǻ��ϱ� {

	public static void main(String[] args) {
		// �Ҽ��� �Ʒ� ���ڰ� ��ӵ��� �ʰ� ���Ѱ��� �Ҽ��� ���ѼҼ���� �մϴ�. �м��� �Ҽ��� ��ĥ �� ���ѼҼ��� ��Ÿ�� �� �ִ� �м����� �Ǻ��Ϸ��� �մϴ�. ���ѼҼ��� �Ǳ� ���� �м��� ������ ������ �����ϴ�.
		// ���м��� ��Ÿ������ ��, �и��� ���μ��� 2�� 5�� �����ؾ� �մϴ�.
		// �� ���� a�� b�� �Ű������� �־��� ��, a/b�� ���ѼҼ��̸� 1��, ���ѼҼ���� 2�� return�ϵ��� solution �Լ��� �ϼ����ּ���.

		int a = 3500;
		int b = 500;
		int answer = 1;
		int min = Math.min(a, b);
		int in = 1;
		for(int i = 1; i <= min ; i++) {
			if(a % i == 0 && b % i == 0) {
				in = Math.max(i, in);
			}
		}
		int b2 = b/in;
		for(int i = 2; i<=b/in ;i++) {
			if(i == 2 || i == 5) {
				while(b2%i == 0) {
					b2 = b2/i;
					answer = 1;
				}
			}else if(b2%i == 0){
				answer = 2;
			}
		}
		if(a%b == 0){
			answer = 1;
		}
		System.out.println(answer);
			
	}

}
