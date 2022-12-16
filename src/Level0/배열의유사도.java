package Level0;

public class 배열의유사도 {

	public static void main(String[] args) {
		// 두 배열이 얼마나 유사한지 확인해보려고 합니다. 문자열 배열 s1과 s2가 주어질 때 같은 원소의 개수를 return하도록 solution
		// 함수를 완성해주세요.
		int result = 0;
		String[] s1 = {"a","b","c"};
		String[] s2 = {"com", "b", "d", "p", "c"};
		for(String i : s1) {
			for(String j : s2) {
				if(i.contains(j)){
					result++;
				}
			}
		}
		System.out.println(result);
	}

}
