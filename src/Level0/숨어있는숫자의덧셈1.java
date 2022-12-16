package Level0;

public class 숨어있는숫자의덧셈1 {

	public static void main(String[] args) {
		// 문자열 my_string이 매개변수로 주어집니다. my_string안의 모든 자연수들의 합을 return하도록 solution 함수를
		// 완성해주세요.
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
		
		//람다 쓴거같은데 어떻게 사용하는건지 모르겠음
		String myString = "aAb1B2cC34oOp";
		System.out.println(myString.chars().mapToObj(i -> (char) i).filter(Character::isDigit).map(String::valueOf).mapToInt(Integer::valueOf).sum());
		System.out.println(2<<9);
	}
	
}
