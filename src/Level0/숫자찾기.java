package Level0;

public class 숫자찾기 {

	public static void main(String[] args) {
		// 정수 num과 k가 매개변수로 주어질 때, num을 이루는 숫자 중에 k가 있으면 num의 그 숫자가 있는 자리 수를 return하고
		// 없으면 -1을 return 하도록 solution 함수를 완성해보세요.
		int num = 29183;
		int k = 6;
		int answer = 0;
		String n = num + "";
		if(n.indexOf(k+"") == -1) {
			answer = -1;
		}else {
			answer = n.indexOf(k+"")+1;
		}
		System.out.println(answer);
		
		// 희표찡 풀이 -를 넣어서 인덱스를 1부터 확인하게 처리 
		answer = ("-"+num).indexOf(k+"");
		System.out.println(answer);
	}

}
