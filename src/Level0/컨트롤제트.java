package Level0;

public class ��Ʈ����Ʈ {

	public static void main(String[] args) {
		// ���ڿ� "Z"�� �������� ���еǾ� ��� ���ڿ��� �־����ϴ�. ���ڿ��� �ִ� ���ڸ� ���ʴ�� ���Ϸ��� �մϴ�. �� �� "Z"�� ������ �ٷ�
		// ���� ���ߴ� ���ڸ� ���ٴ� ���Դϴ�. ���ڿ� "Z"�� �̷���� ���ڿ� s�� �־��� ��, �Ӿ��̰� ���� ���� return �ϵ���
		// solution �Լ��� �ϼ��غ�����.
		
		String s = "1 2 Z 3";
		int answer = 0;
		String[] sarr = s.split(" ");
		for(int i = 0; i<sarr.length; i++) {
			if(sarr[i].equals("Z")) {
				answer -= Integer.parseInt(sarr[i-1]);
			}else {
				answer += Integer.parseInt(sarr[i]);
			}
		}
		
		System.out.println(answer);
	}

}
