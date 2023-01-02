package Level0;

import java.util.HashSet;
import java.util.TreeSet;

public class 한번만등장한문자 {

	public static void main(String[] args) {
		// 문자열 s가 매개변수로 주어집니다. s에서 한 번만 등장하는 문자를 사전 순으로 정렬한 문자열을 return 하도록 solution 함수를
		// 완성해보세요. 한 번만 등장하는 문자가 없을 경우 빈 문자열을 return 합니다.
		String s = "reabcabcadc";
		String answer = "";
		String[] sarr = s.split("");
		TreeSet<String> arr = new TreeSet<String>();
		for(int i = 0; i<s.length(); i++) {
			if(s.length() - s.replaceAll(sarr[i],"").length() == 1) {
				arr.add(sarr[i]);
			}
		}
		// String.join() 메소드로 for문 없이 배열값 문자열화 할 수 있음
		System.out.println(String.join("", arr));;
		for(String i : arr) {
			answer += i;
		}
		System.out.println(answer);
	
	}

}
