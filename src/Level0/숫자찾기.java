package Level0;

public class ����ã�� {

	public static void main(String[] args) {
		// ���� num�� k�� �Ű������� �־��� ��, num�� �̷�� ���� �߿� k�� ������ num�� �� ���ڰ� �ִ� �ڸ� ���� return�ϰ�
		// ������ -1�� return �ϵ��� solution �Լ��� �ϼ��غ�����.
		int num = 29183;
		int k = 6;
		int answer = 0;
		String n = num + "";
		if(n.indexOf(k+"") == -1) {
			answer = -1;
		}else {
			answer = n.indexOf(k+"")+1;
		}
		System.out.println(answer);
		
		// ��ǥ�� Ǯ�� -�� �־ �ε����� 1���� Ȯ���ϰ� ó�� 
		answer = ("-"+num).indexOf(k+"");
		System.out.println(answer);
	}

}
