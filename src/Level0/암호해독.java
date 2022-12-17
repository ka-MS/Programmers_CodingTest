package Level0;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class 암호해독 {

	public static void main(String[] args) {
		//군 전략가 머쓱이는 전쟁 중 적군이 다음과 같은 암호 체계를 사용한다는 것을 알아냈습니다.
		//암호화된 문자열 cipher를 주고받습니다.
		//그 문자열에서 code의 배수 번째 글자만 진짜 암호입니다.
		//문자열 cipher와 정수 code가 매개변수로 주어질 때 해독된 암호 문자열을 return하도록 solution 함수를 완성해주세요.
		String cipher = "dfjardstddetckdaccccdegk";
		int code = 4;
		String answer = "";
		String[] arr = cipher.split("");
		
		for(int i = 0 ; i < arr.length ; i++) {
			if((i+1)%code == 0) {
				answer += arr[i];
			}
		}
		System.out.println(answer);
		
		answer = "";
		
		// 조건문에서 배수 설정을 해주고 subString으로 잘라서 저장
		for(int i = code ; i<=cipher.length() ; i += code) {
			answer += cipher.substring(i-1,i);
		}
		System.out.println(answer);
		
		//stream사용
		answer = IntStream.range(0, cipher.length())
                .filter(value -> value % code == code - 1)
                .mapToObj(c -> String.valueOf(cipher.charAt(c)))
                .collect(Collectors.joining());
		System.out.println(answer);
	}

}
