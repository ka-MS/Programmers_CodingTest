package Level0;

public class �������ü��� {

	public static void main(String[] args) {
		// �������� Ȥ�� ������ common�� �Ű������� �־��� ��, ������ ���� �������� �� ���ڸ� return �ϵ��� solution �Լ���
		// �ϼ��غ�����.
		int[] common = {3,3,3};
		int answer = 0;
		if(common[1] - common[0] == common[2] - common[1]) {
			answer = common[1] - common[0] + common[common.length-1];
		}else{
			answer = common[common.length-1]*(common[1]/common[0]);
		}
		System.out.println(answer);
	}

}
