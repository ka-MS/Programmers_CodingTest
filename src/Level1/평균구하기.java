package Level1;

public class ��ձ��ϱ� {

	public static void main(String[] args) {
		// ������ ��� �ִ� �迭 arr�� ��հ��� return�ϴ� �Լ�, solution�� �ϼ��غ�����.
		int[] arr = {1,2,3,4};
		double answer =0;
		for(int i : arr) {
			answer += i;
		}
		answer = answer/arr.length;
		System.out.println(answer);
	}

}
