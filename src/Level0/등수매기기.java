package Level0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class 등수매기기 {

	public static void main(String[] args) {
		// 영어 점수와 수학 점수의 평균 점수를 기준으로 학생들의 등수를 매기려고 합니다. 영어 점수와 수학 점수를 담은 2차원 정수 배열
		// score가 주어질 때, 영어 점수와 수학 점수의 평균을 기준으로 매긴 등수를 담은 배열을 return하도록 solution 함수를
		// 완성해주세요.
		int[][] score = {{1, 3}, {3, 1}, {2, 3}, {3, 2}, {1, 2}, {0, 0}};
		 
		int[] answer = new int[score.length];
		for(int i = 0; i < score.length ; i++) {
			answer[i] = (score[i][0]+score[i][1]);
		}
		int[] arr= answer.clone();
		Arrays.sort(arr);
		Map<Integer, Integer> avg = new HashMap<Integer, Integer>();
		int k = score.length;
		for(int i = 0 ; i < score.length ; i++ ) {
			avg.put(arr[i], k--);
		}
		for(int i = 0; i < score.length; i++) {
			answer[i] = avg.get(answer[i]);
		}
		System.out.println(avg);
		for(int i = 0; i < score.length ; i++) {
			System.out.print(answer[i] + " ");
		}
		
		// 인덱스를 활용해서 중복 제거
		List<Integer> scoreList = new ArrayList<>();
        for(int[] t : score){
            scoreList.add(t[0] + t[1]);
        }
        scoreList.sort(Comparator.reverseOrder()); // 내림차순 정렬

        for(int i=0; i<score.length; i++){
            answer[i] = scoreList.indexOf(score[i][0] + score[i][1])+1; //인덱스로 찾으면 중복요소에 대해서 가장 앞의 인덱스를 반환하므로 중복처리가능
        }
	}

}
