package Level0;

public class �ֻ����ǰ��� {

	public static void main(String[] args) {
		// �Ӿ��̴� ������ü ����� ���ڸ� �ϳ� ������ �ִµ� �� ���ڿ� ������ü ����� �ֻ����� �ִ��� ���� ä��� �ͽ��ϴ�. ������ ����, ����,
		// ���̰� ����Ǿ��ִ� �迭 box�� �ֻ��� �𼭸��� ���� ���� n�� �Ű������� �־����� ��, ���ڿ� �� �� �ִ� �ֻ����� �ִ� ������
		// return �ϵ��� solution �Լ��� �ϼ����ּ���.
		int n = 3;
		int[] box = {10 , 8, 6};
		
		int answer = (box[0]/n) * (box[1]/n) * (box[2]/n);
		System.out.println(answer);
	}

}
