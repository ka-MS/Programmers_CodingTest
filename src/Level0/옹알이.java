package Level0;

public class �˾��� {

	public static void main(String[] args) {
		// �Ӿ��̴� �¾ �� 6���� �� ��ī�� ������ �ֽ��ϴ�. ��ī�� ���� "aya", "ye", "woo", "ma" �� ���� ������ �ִ� ��
		// ���� ����� ������(�̾� ����) �����ۿ� ���� ���մϴ�. ���ڿ� �迭 babbling�� �Ű������� �־��� ��, �Ӿ����� ��ī�� ������ ��
		// �ִ� �ܾ��� ������ return�ϵ��� solution �Լ��� �ϼ����ּ���.
		
		String[] babbling = {"aya", "yee", "u", "maa", "wyeoo"};
		String[] baby = { "aya", "ye", "woo", "ma"};
		int answer = 0;
		
//		for(int i = 0; i < babbling.length ; i++) {
//			if(babbling[i].split("(aya|ye|woo|ma)").length == 0) {
//				answer++;
//			}
//		}
		
		// ���� ��Ȯ�� Ǯ��
		for(int i = 0; i < babbling.length ; i++) {
			if(babbling[i].matches("^(aya(?!aya)|ye(?!ye)|woo(?!woo)|ma(?!ma))+$")) {
				answer++;
			}
		}
		
//		for(int i = 0; i < babbling.length ; i++) {
//			for(int j = 0; j < baby.length ; j++) {
//				babbling[i] = babbling[i].replaceFirst(baby[j],";");
//				System.out.println(i + ": "+ babbling[i]);
//			}
//			if(babbling[i].replaceAll(";","").length() == 0) {
//				answer++;
//			}
//		}
		System.out.println(answer);

	}

}
