package Level0;

public class �ڸ������ϱ� {

	public static void main(String[] args) {
		// ���� n�� �Ű������� �־��� �� n�� �� �ڸ� ������ ���� return�ϵ��� solution �Լ��� �ϼ����ּ���
		int n = 1234993;
		String check = n + "";
		int result = 0;
		for (int i = 0; i < 10; i++) {
			int k = check.length();
			if (check.contains(i + "")) {
				check = check.replace(i + "", "");
				result += i * (k - (check.length()));
			}
		}
		System.out.println(result);
		//while�� �̿��� ���
		result =0;
		while(n>0) {
			result += n%10;
			n = n/10;
		}
		System.out.println(result);
	}

}
