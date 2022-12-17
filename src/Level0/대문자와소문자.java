package Level0;

public class 대문자와소문자 {

	public static void main(String[] args) {
		// 문자열 my_string이 매개변수로 주어질 때, 대문자는 소문자로 소문자는 대문자로 변환한 문자열을 return하도록 solution
		// 함수를 완성해주세요.
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
