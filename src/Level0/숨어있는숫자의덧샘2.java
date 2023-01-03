package Level0;

public class 숨어있는숫자의덧샘2 {

	public static void main(String[] args) {
		// 문자열 my_string이 매개변수로 주어집니다. my_string은 소문자, 대문자, 자연수로만 구성되어있습니다. my_string안의
		// 자연수들의 합을 return하도록 solution 함수를 완성해주세요.
		String my_string = 	"1a2b3c4d123Z";
		int answer = 0;
		String[] arr = my_string.split("[a-zA-Z]");
		System.out.println(arr.length);
		for(int i = 0; i < arr.length; i++) {
			if(!arr[i].equals("")) {
				answer += Integer.parseInt(arr[i]);
			}
		}
		System.out.println(answer);
	}

}
