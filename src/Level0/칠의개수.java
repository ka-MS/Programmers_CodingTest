package Level0;

public class ĥ�ǰ��� {

	public static void main(String[] args) {
		// �Ӿ��̴� ����� ���� 7�� ���� �����մϴ�. ���� �迭 array�� �Ű������� �־��� ��, 7�� �� �� �� �ִ��� return �ϵ���
		// solution �Լ��� �ϼ��غ�����.
		
		int[] array = {7,77,17};
		int answer = 0;
		String arr = "";
		for(int i : array) {
			arr += i+"";
		}
		answer = arr.length() - arr.replace("7", "").length();
		
		System.out.println(answer);
	}

}
