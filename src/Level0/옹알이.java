package Level0;

public class 옹알이 {

	public static void main(String[] args) {
		// 머쓱이는 태어난 지 6개월 된 조카를 돌보고 있습니다. 조카는 아직 "aya", "ye", "woo", "ma" 네 가지 발음을 최대 한
		// 번씩 사용해 조합한(이어 붙인) 발음밖에 하지 못합니다. 문자열 배열 babbling이 매개변수로 주어질 때, 머쓱이의 조카가 발음할 수
		// 있는 단어의 개수를 return하도록 solution 함수를 완성해주세요.
		
		String[] babbling = {"aya", "yee", "u", "maa", "wyeoo"};
		String[] baby = { "aya", "ye", "woo", "ma"};
		int answer = 0;
		
//		for(int i = 0; i < babbling.length ; i++) {
//			if(babbling[i].split("(aya|ye|woo|ma)").length == 0) {
//				answer++;
//			}
//		}
		
		// 가장 정확한 풀이
		for(int i = 0; i < babbling.length ; i++) {
			if(babbling[i].matches("^(aya(?!aya)|ye(?!ye)|woo(?!woo)|ma(?!ma))+$")) {
				answer++;
			}
		}
		
//		for(int i = 0; i < babbling.length ; i++) {
//			for(int j = 0; j < baby.length ; j++) {
//				babbling[i] = babbling[i].replaceFirst(baby[j],";");
//				System.out.println(i + ": "+ babbling[i]);
//			}
//			if(babbling[i].replaceAll(";","").length() == 0) {
//				answer++;
//			}
//		}
		System.out.println(answer);

	}

}
