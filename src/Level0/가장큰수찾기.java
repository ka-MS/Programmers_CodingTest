package Level0;

public class ����ū��ã�� {

	public static void main(String[] args) {
		// ���� �迭 array�� �Ű������� �־��� ��, ���� ū ���� �� ���� �ε����� ���� �迭�� return �ϵ��� solution �Լ���
		// �ϼ��غ�����.
		
		int[] array = {1, 8, 3};
		int[] answer = new int[2];
		int max = 0;
		for(int i = 0 ; i<array.length ; i++) {
			if(max < array[i]) {
				max = array[i];
				answer[0] = array[i];
				answer[1] = i;
			}
		}
		System.out.println(answer[0] + "," + answer[1]);
	}

}
