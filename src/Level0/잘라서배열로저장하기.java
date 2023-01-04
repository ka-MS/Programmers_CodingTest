package Level0;

public class 잘라서배열로저장하기 {

	public static void main(String[] args) {
		// 문자열 my_str과 n이 매개변수로 주어질 때, my_str을 길이 n씩 잘라서 저장한 배열을 return하도록 solution 함수를
		// 완성해주세요.
		int n = 1;
		String my_str = "abc1Addfggg4556b";
		int leng = my_str.length()%n == 0 ? my_str.length()/n : my_str.length()/n+1;
		String[] answer = new String[leng];
		
		for(int i = 0; i< leng; i++) {
			if(my_str.length() < n) {
				answer[i] = my_str.substring(0, my_str.length());
			}else {
				answer[i] = my_str.substring(0,n);
				my_str = my_str.replaceFirst(answer[i], "");
			}
		}
		for(int i = 0; i < answer.length; i++) {
			
			System.out.println(answer[i]);
		}
	}

}
