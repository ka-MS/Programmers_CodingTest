package Level0;

public class ���ڳ����Ա�2 {

	public static void main(String[] args) {
		// �Ӿ��̳� ���ڰ��Դ� ���ڸ� ���� �������� �߶� �ݴϴ�. ���ڸ� �������� ����� �� n�� �Ű������� �־��� ��, n���� �ֹ��� ���ڸ� ������
		// �ʰ� ��� ���� ���� ���� ������ �Ծ�� �Ѵٸ� �ּ� �� ���� ���Ѿ� �ϴ����� return �ϵ��� solution �Լ��� �ϼ��غ�����.
		int n = 7;
		int answer = 0;
//		int i = 1;
		for(int i = 1; i <=6 ; i++) {
			if((n*i)%6 == 0) {
				answer = n*i/6;
				break;
			}
		}
		System.out.println(answer);
	}

}
