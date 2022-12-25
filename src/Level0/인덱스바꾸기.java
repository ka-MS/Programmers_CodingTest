package Level0;

public class 인덱스바꾸기 {

	public static void main(String[] args) {
		// 문자열 my_string과 정수 num1, num2가 매개변수로 주어질 때, my_string에서 인덱스 num1과 인덱스 num2에
		// 해당하는 문자를 바꾼 문자열을 return 하도록 solution 함수를 완성해보세요.
		String my_string = "hello";
		int num1 = 1;
		int num2 = 2;
		String answer = "";

		char[] arr = { my_string.charAt(num1), my_string.charAt(num2) };
		String[] str = my_string.split("");
		for (int i = 0; i < str.length; i++) {
			if (i == num1) {
				answer += arr[1];
			} else if (i == num2) {
				answer += arr[0];
			} else {
				answer += str[i];
			}
		}
		answer = String.valueOf(arr);
		System.out.println(answer);

		// char배열 + String.valueOf 풀이
		char[] ch = my_string.toCharArray();

		ch[num1] = my_string.charAt(num2);
		ch[num2] = my_string.charAt(num1);

		answer = String.valueOf(ch);
		
		// 얕은복사 깊은복사 풀이
		String[] arr2 = my_string.split("");
        String temp = arr2[num1];
        arr2[num1] = arr2[num2];
        arr2[num2] = temp;
        for(String str2 : arr2){
            answer += str2;
        }
        System.out.println(answer);
	}

}
