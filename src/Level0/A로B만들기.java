package Level0;

public class A��B����� {

	public static void main(String[] args) {
		// ���ڿ� before�� after�� �Ű������� �־��� ��, before�� ������ �ٲپ� after�� ���� �� ������ 1��, ���� �� ������
		// 0�� return �ϵ��� solution �Լ��� �ϼ��غ�����.
		String before = "aolleh";
		String after = "hello";
		int answer = 0;
		String[] arr = after.split("");
		for(int i = 0; i< arr.length ; i++) {
			before = before.replaceFirst(arr[i], "");
		}
		answer = before.length() == 0 ? 1 : 0;
		System.out.println(answer);
		
		
		//���İ� equals
		
	}

}
