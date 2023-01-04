package Level0;

public class 영어가싫어요 {

	public static void main(String[] args) {
		// 영어가 싫은 머쓱이는 영어로 표기되어있는 숫자를 수로 바꾸려고 합니다. 문자열 numbers가 매개변수로 주어질 때, numbers를
		// 정수로 바꿔 return 하도록 solution 함수를 완성해 주세요.
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
