package programmers_school.greedy;

import java.util.*;

public class 기지국설치 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 200000000;
		int[] stations = { 4, 11, 18 };
		int w = 2;
		System.out.println(solution3(n, stations, w));

	}

	public static int solution(int n, int[] stations, int w) {
		HashSet<Integer> apList = new HashSet<Integer>();
		int answer = 0;
		for (int i = 1; i <= n; i++) {
			apList.add(i);
		}
		for (int k : stations) {
			for (int i = 0; i < 1 + w * 2; i++) {
				if (apList.contains(k - w + i)) {
					apList.remove(k - w + i);
				}
			}
		}
		Iterator it = apList.iterator();
		int count = 1;
		while (it.hasNext()) {
			int start = (int) it.next();
			if (apList.contains(start + 1) && count < 1 + w * 2) {
				it.remove();
				count++;
			} else {
				it.remove();
				answer++;
				count = 1;
			}
		}
		return answer;
	}

	public static int solution2(int n, int[] stations, int w) {
		int answer = 0;
		Queue<Integer> sq = new LinkedList<Integer>();
		for (int s : stations) {
			sq.offer(s);
		}
		// 효율성 테스트에서 시간을 가장 많이 잡아먹는건 루프
		// 그 다음은 변수 속성체크 -> 기본타입 객체를 사용하면 훨씬 빠름
		int position = 1; // 포지션은 최대 전파범위 바깥이 됨
		while (position <= n) {
			if (!sq.isEmpty() && sq.peek() - w <= position) {
				position = sq.poll() + w + 1;
			} else {
				answer++;
				System.out.println(position);
				position += w * 2 + 1;
			}
		}

		return answer;
	}

	public static int solution3(int n, int[] stations, int w) {
		int answer = 0;

		int si = 0;
		// 큐의 역할을 인덱스로 대신함 굳이 큐에 넣어줄 필요 없이 인덱스로 배열값을 꺼내와서 비교해 주면 됨

		int position = 1; // 포지션은 최대 전파범위 바깥이 됨
		while (position <= n) {
			if (si < stations.length && stations[si] - w <= position) { // 설치되어있는 기지국과 범위가 겹치는지 체크
				position = stations[si] + w + 1;
				si++;
			} else {
				answer++;
				position += w * 2 + 1;
			}
		}

		return answer;
	}

}
