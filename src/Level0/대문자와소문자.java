package Level0;

public class �빮�ڿͼҹ��� {

	public static void main(String[] args) {
		// ���ڿ� my_string�� �Ű������� �־��� ��, �빮�ڴ� �ҹ��ڷ� �ҹ��ڴ� �빮�ڷ� ��ȯ�� ���ڿ��� return�ϵ��� solution
		// �Լ��� �ϼ����ּ���.
		String my_string = "cccCCC";
		String answer = "";
		char[] cha = my_string.toCharArray();
		for(char i : cha) {
			if(Character.isUpperCase(i)) {
				answer = answer + Character.toLowerCase(i);
			}else {
				answer = answer + Character.toUpperCase(i);
			}
		}
		System.out.println(answer);
		System.out.println(my_string.charAt(0));
	}

}
