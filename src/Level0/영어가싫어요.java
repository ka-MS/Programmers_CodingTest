package Level0;

public class ����Ⱦ�� {

	public static void main(String[] args) {
		// ��� ���� �Ӿ��̴� ����� ǥ��Ǿ��ִ� ���ڸ� ���� �ٲٷ��� �մϴ�. ���ڿ� numbers�� �Ű������� �־��� ��, numbers��
		// ������ �ٲ� return �ϵ��� solution �Լ��� �ϼ��� �ּ���.
		String numbers = "onefourzerosixseven"	;
		String answer = "";
		number[] arr = number.values();
		for(int i = 0; i<10 ; i++) {
			numbers = numbers.replaceAll(arr[i]+"", arr[i].getNum());
		}
			System.out.println(Long.parseLong(numbers));
	}
	
	enum number {
		zero("0"),
		one("1"),
		two("2"),
		three("3"),
		four("4"),
		five("5"),
		six("6"),
		seven("7"),
		eight("8"),
		nine("9");
		private String num;
		number(String num) {
			this.num = num;
		}
		public String getNum(){
			return num;
		}
	}

}
