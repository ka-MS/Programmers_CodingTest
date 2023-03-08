package programmers_school.greedy;

import java.util.HashMap;

public class 자전거공장 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] cost = {{0,10},{50,20},{100,30},{200,40}};
		int[][] order = {{3,270},{7,200},{8,200}};
		System.out.println(solution(cost, order));

	}
	
	public static int solution(int[][] cost, int[][] order) {
		int answer = 0;
		int maxMonth = 0;
		
		int need = 0; // 총 필요 수량
		for(int[] o : order) {
			maxMonth = Math.max(maxMonth, o[0]);
		}
		int[] monthlyOrder = new int[maxMonth];
		for(int[] o : order) {
			monthlyOrder[o[0]-1] += o[1];
			need += o[1];
		}
		int made = 0; // 만들어 놓은 자전거 갯수
		for(int i = 0; i < cost.length -1; i++) {
			if(need == 0 || made >= need) break;
			int price = cost[i][1]; // kw당 가격
			int costLimit = cost[i+1][0] - cost[i][0]; // 구간별 갯수
			int rest = 0; // 생산하지 못한 부분
			
			for(int j = 0; j < monthlyOrder.length ; j++) {
				if(need == 0 || made >= need) break;
				int making = Math.min(costLimit, need-made);
				answer += price * making;
				made += making;
				need -= monthlyOrder[j];
				if(monthlyOrder[j] != 0) {
					made -= Math.min(made, monthlyOrder[j]);
					monthlyOrder[j] -=  Math.min(made, monthlyOrder[j]);
					rest += monthlyOrder[j];
				}
			}
			need = rest;
			made = 0;
		}
		answer += need * cost[cost.length - 1][1];
		
        return answer;
    }
}
