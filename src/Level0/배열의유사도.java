package Level0;

public class �迭�����絵 {

	public static void main(String[] args) {
		// �� �迭�� �󸶳� �������� Ȯ���غ����� �մϴ�. ���ڿ� �迭 s1�� s2�� �־��� �� ���� ������ ������ return�ϵ��� solution
		// �Լ��� �ϼ����ּ���.
		int result = 0;
		String[] s1 = {"a","b","c"};
		String[] s2 = {"com", "b", "d", "p", "c"};
		for(String i : s1) {
			for(String j : s2) {
				if(i.contains(j)){
					result++;
				}
			}
		}
		System.out.println(result);
	}

}
