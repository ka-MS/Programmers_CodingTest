package Level0;

public class �����ִ¼����ǵ���1 {

	public static void main(String[] args) {
		// ���ڿ� my_string�� �Ű������� �־����ϴ�. my_string���� ��� �ڿ������� ���� return�ϵ��� solution �Լ���
		// �ϼ����ּ���.
		String check = "aAb1B2cC34oOp";
		int result = 0;
		for (int i = 0; i < 10; i++) {
			int k = check.length();
			if (check.contains(i + "")) {
				check = check.replace(i + "", "");
				result += i * (k - (check.length()));
			}
		}
		System.out.println(result);
		
		//���� ���Ű����� ��� ����ϴ°��� �𸣰���
		String myString = "aAb1B2cC34oOp";
		System.out.println(myString.chars().mapToObj(i -> (char) i).filter(Character::isDigit).map(String::valueOf).mapToInt(Integer::valueOf).sum());
		System.out.println(2<<9);
	}
	
}
