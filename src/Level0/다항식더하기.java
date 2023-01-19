package Level0;

public class 다항식더하기 {

	public static void main(String[] args) {
		// 한 개 이상의 항의 합으로 이루어진 식을 다항식이라고 합니다. 다항식을 계산할 때는 동류항끼리 계산해 정리합니다. 덧셈으로 이루어진 다항식
		// polynomial이 매개변수로 주어질 때, 동류항끼리 더한 결괏값을 문자열로 return 하도록 solution 함수를 완성해보세요.
		// 같은 식이라면 가장 짧은 수식을 return 합니다.
		String polynomial = "x + x + x";
		String answer= "";
		int num = 0;
		int numx = 0;
		String[] arr = polynomial.split(" [+] ");
		for(int i = 0; i < arr.length ; i++) {
			if(arr[i].indexOf("x") !=-1) {
				numx += arr[i].replace("x", "").equals("") ? 1 : Integer.valueOf(arr[i].replace("x", ""));
			}else if(arr[i] != " "){
				num += Integer.valueOf(arr[i]);
			}
		}
		if(numx == 0) {
			
		}else if(numx == 1) {
			answer += "x";
		}else {
			answer += numx+"x";
		}
		if(numx != 0 && num != 0) {
			answer += " + "+num;
		}else if(numx == 0) {
			answer += num+"";
		}
		
		System.out.println(answer);
	}

}
