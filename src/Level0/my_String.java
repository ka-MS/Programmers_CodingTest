package Level0;

public class my_String {

	public static void main(String[] args) {
//		문자열 my_string이 매개변수로 주어집니다. my_string을 거꾸로 뒤집은 문자열을 return하도록 solution 함수를 완성해주세요.
		String k = "jaron";
		StringBuilder sb = new StringBuilder();
		sb.append(k);
		sb.reverse();
		System.out.println(sb);
		//StringBuilder의 reverse함수로 쉽게 뒤집을 수 있음
		
	}
	
}
