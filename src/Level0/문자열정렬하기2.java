package Level0;

import java.util.Arrays;

public class 문자열정렬하기2 {

	public static void main(String[] args) {
		// 영어 대소문자로 이루어진 문자열 my_string이 매개변수로 주어질 때, my_string을 모두 소문자로 바꾸고 알파벳 순서대로 정렬한
		// 문자열을 return 하도록 solution 함수를 완성해보세요.
		String my_string = "Bcad";
		String answer = "";
		my_string = my_string.toLowerCase();
		char[] arr = my_string.toCharArray();
		Arrays.sort(arr);
		answer = new String(arr);
		System.out.println(answer);
		
	}

}
