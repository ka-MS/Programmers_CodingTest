package Level0;

public class 이진수더하기 {

	public static void main(String[] args) {
		// 이진수를 의미하는 두 개의 문자열 bin1과 bin2가 매개변수로 주어질 때, 두 이진수의 합을 return하도록 solution 함수를
		// 완성해주세요.
		
		String bin1 = "10";
		String bin2 = "11";
		String answer = "";
		
		// integer에는 2진수를 int로 만들어주는 메소드가있음 int를 2진수로 만들어주는 메소드도 있음
		
		int a = Integer.parseInt(bin1, 2) + Integer.parseInt(bin2, 2);		
		answer = Integer.toBinaryString(a);
		System.out.println(answer);

	}

}
