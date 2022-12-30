package Level0;

public class A로B만들기 {

	public static void main(String[] args) {
		// 문자열 before와 after가 매개변수로 주어질 때, before의 순서를 바꾸어 after를 만들 수 있으면 1을, 만들 수 없으면
		// 0을 return 하도록 solution 함수를 완성해보세요.
		String before = "aolleh";
		String after = "hello";
		int answer = 0;
		String[] arr = after.split("");
		for(int i = 0; i< arr.length ; i++) {
			before = before.replaceFirst(arr[i], "");
		}
		answer = before.length() == 0 ? 1 : 0;
		System.out.println(answer);
		
		
		//정렬과 equals
		
	}

}
