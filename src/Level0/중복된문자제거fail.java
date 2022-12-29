package Level0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.*;

public class 중복된문자제거fail {

	public static void main(String[] args) {
		// 문자열 my_string이 매개변수로 주어집니다. my_string에서 중복된 문자를 제거하고 하나의 문자만 남긴 문자열을
		// return하도록 solution 함수를 완성해주세요.
		String my_string = "people";
		String answer = "";
		char[] arr = my_string.toCharArray();
		List<String> sarr = new ArrayList<String>();

		for (int i = 0; i < arr.length; i++) {
			if(!sarr.contains(arr[i]+"")) {
				sarr.add(arr[i]+"");
			}
		}

		answer = String.join("", sarr);
		System.out.println(answer);
		
		//map과 set을 더 공부해야함
		// set을 이용한 풀이
		String[] answers = my_string.split("");
        Set<String> set = new LinkedHashSet<String>(Arrays.asList(answers));
        System.out.println(set);
	}

}
