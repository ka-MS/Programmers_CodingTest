package Level0;

public class ������ {

	public static void main(String[] args) {
		// ���� �迭 array�� ���� n�� �Ű������� �־��� ��, array�� ����ִ� ���� �� n�� ���� ����� ���� return �ϵ���
		// solution �Լ��� �ϼ����ּ���.
		
		int[] array = {11,8,12};
		int n = 10;
		int answer = 0;
		int check=1000000000;
		for(int i = 0; i<array.length ; i++) {
			if(check > Math.abs(n - array[i])) {
				check = Math.abs(n - array[i]);
				answer = array[i];
			}else if(check == Math.abs(n - array[i])) {
				check = Math.abs(n - array[i]);
				answer = Math.min(answer, array[i]);
//				answer = answer < array[i] ? answer : array[i];
			}
		}
		System.out.println(answer);

	}

}
