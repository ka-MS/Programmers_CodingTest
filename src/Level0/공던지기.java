package Level0;

import java.util.LinkedList;
import java.util.Queue;

public class 공던지기 {

	public static void main(String[] args) {
		// 머쓱이는 친구들과 동그랗게 서서 공 던지기 게임을 하고 있습니다. 공은 1번부터 던지며 오른쪽으로 한 명을 건너뛰고 그다음 사람에게만 던질
		// 수 있습니다. 친구들의 번호가 들어있는 정수 배열 numbers와 정수 K가 주어질 때, k번째로 공을 던지는 사람의 번호는 무엇인지
		// return 하도록 solution 함수를 완성해보세요.
		int answer = -1;
		int[] numbers = { 1, 2, 3, 4 ,5,6};
		int k = 10;
		for (int j = 0; j < k; j++) {
			answer+=2;
			if (answer == numbers.length+1) {
				answer = 1;
			} else if (answer == numbers.length+2) {
				answer = 2;
			}
		}
		// 한줄 방법
		System.out.println( (k-1)*2 % numbers.length +1 );
		// queue 를 사용하여  큐 안에 널값 두개를 넣어서 2개씩 밀어줬음
		// poll() 배열에 먼저들어온걸 빼내고 빼낸값을 리턴한다
		// add() 맨뒤에 넣는다 큐가 가득차면 익셉션 출력 offer() 맨뒤에 넣는다 가득차면 false출력
		// 큐를 어떻게 가득 차게 하지?
		Queue<Integer> queue = new LinkedList<>();
        for(int num : numbers) queue.add(num);
        int cnt = 1;
        while(cnt !=k){
            queue.offer(queue.poll());
            queue.offer(queue.poll());
            System.out.println(queue);
            cnt++;
        }
		System.out.println(queue.poll());

	}

}
