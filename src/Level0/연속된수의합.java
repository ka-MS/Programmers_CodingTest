package Level0;

public class 연속된수의합 {

	public static void main(String[] args) {
		// 연속된 세 개의 정수를 더해 12가 되는 경우는 3, 4, 5입니다. 두 정수 num과 total이 주어집니다. 연속된 수 num개를 더한
		// 값이 total이 될 때, 정수 배열을 오름차순으로 담아 return하도록 solution함수를 완성해보세요.
		int num = 3;
		int total = 12;
		int[] answer = new int[num];
		for(int i = -num; i < 1000 ; i++) {
			int k = 0;
			for(int j = 0; j < num ; j++) {
				k +=i+j;
			}
			if(total == k) {
				for(int j = 0; j< num; j++) {
					answer[j] = i+j;
				}
				break;
			}
		}
		int p = 0;
		for(int i = 1 ; i <=100; i++) {
			p+=i;
		}
		
		//등차수열을 이용한 풀이
//		테스트 1번을 예시로 들면 총 3개의 숫자를 이용해서 12라는 숫자를 만들어야합니다.
//		a0=a, d=1이라 할때 a0+a1+a2=a+(a+d)+(a+2d)=15라는 식이 나옵니다.
//		즉 3a+3=12 -> a=(12-3)/3이라는 식으로 나옵니다.
//		이때 a는 리스트 자료의 첫번째 숫자라는 것을 알 수 있습니다. 이런 방식을 이용해 반복문 돌려서 리스트 전체 숫자를 구하면 됩니다.
		
		int check = (num-1)*(num)/2; // num~n까지 합
		int start = (total-check)/num; // 등차수열 시작값
        for (int i = 0; i < answer.length; i++) {
                answer[i] = start + i ;
        }
		
		for(int i = 0 ; i < num ; i++) {
			System.out.println(answer[i]);
		}
		

	}

}
