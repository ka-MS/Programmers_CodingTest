package Level0;

public class 문자열계산하기 {

	public static void main(String[] args) {
		// my_string은 "3 + 5"처럼 문자열로 된 수식입니다. 문자열 my_string이 매개변수로 주어질 때, 수식을 계산한 값을
		// return 하는 solution 함수를 완성해주세요.
		String my_string = "3 + 4 - 3 + 7";
		int answer = 0;
		my_string = my_string.trim();
		String[] arr = my_string.split(" ");
		answer = Integer.parseInt(arr[0]);
		for(int i = 0; i < arr.length ; i++) {
			if(arr[i].equals("+")) {
				answer += Integer.parseInt(arr[i+1]);
			}else if(arr[i].equals("-")) {
				answer -= Integer.parseInt(arr[i+1]);
			}
		}
		System.out.println(answer);
	}

}
