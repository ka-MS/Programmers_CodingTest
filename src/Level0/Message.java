package Level0;

public class Message {

	public static void main(String[] args) {
		// �Ӿ��̴� �ҸӴϲ� ���� ���� ������ ������ �մϴ�. �ҸӴϰ� ���ñ� ���ϵ��� ���� �� �� �� �ڸ� ���� 2cm ũ��� �������� �ϸ�,
		// ������ ���ηθ� ���� ��, ���� ���� message�� ���� ���� �ʿ��� �������� �ּ� ���α��̸� return �ϵ��� solution �Լ���
		// �ϼ����ּ���.
		String message = "happy birthday!";
		String[] arr = message.split("");
		for (String k : arr) {
			System.out.println(k);
		}

	}

}
