package Level0;

public class ���������ϱ� {

	public static void main(String[] args) {
		// �������� �ǹ��ϴ� �� ���� ���ڿ� bin1�� bin2�� �Ű������� �־��� ��, �� �������� ���� return�ϵ��� solution �Լ���
		// �ϼ����ּ���.
		
		String bin1 = "10";
		String bin2 = "11";
		String answer = "";
		
		// integer���� 2������ int�� ������ִ� �޼ҵ尡���� int�� 2������ ������ִ� �޼ҵ嵵 ����
		
		int a = Integer.parseInt(bin1, 2) + Integer.parseInt(bin2, 2);		
		answer = Integer.toBinaryString(a);
		System.out.println(answer);

	}

}
