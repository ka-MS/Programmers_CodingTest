package Level0;

public class �ܰ����� {

	public static void main(String[] args) {
		// PROGRAMMERS-962 �༺�� �ҽ����� ���ֺ���� �Ӿ��̴� �ܰ��༺�� �� �����Ϸ��� �մϴ�. ���ĺ��� ��� �迭 spell��
		// �ܰ�� ���� dic�� �Ű������� �־����ϴ�. spell�� ��� ���ĺ��� �ѹ����� ��� ����� �ܾ dic�� �����Ѵٸ� 1, ��������
		// �ʴ´ٸ� 2�� return�ϵ��� solution �Լ��� �ϼ����ּ���.
		String[] spell = {"s", "o", "m", "d"};
		String[] dic = {"moos", "dzx", "smm", "sunmmo", "som"};
		int answer = 2;
		for(String i : dic) {
			int a = 0;
			for(String j : spell) {
				if(i.indexOf(j) >= 0) {
					a++;
				}
				if(a == spell.length) {
					answer = 1;
					System.out.println(i +":"+ a);
					break;
				}
			}
		}
		System.out.println(answer);
	}

}
