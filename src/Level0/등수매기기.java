package Level0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ����ű�� {

	public static void main(String[] args) {
		// ���� ������ ���� ������ ��� ������ �������� �л����� ����� �ű���� �մϴ�. ���� ������ ���� ������ ���� 2���� ���� �迭
		// score�� �־��� ��, ���� ������ ���� ������ ����� �������� �ű� ����� ���� �迭�� return�ϵ��� solution �Լ���
		// �ϼ����ּ���.
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
		
		// �ε����� Ȱ���ؼ� �ߺ� ����
		List<Integer> scoreList = new ArrayList<>();
        for(int[] t : score){
            scoreList.add(t[0] + t[1]);
        }
        scoreList.sort(Comparator.reverseOrder()); // �������� ����

        for(int i=0; i<score.length; i++){
            answer[i] = scoreList.indexOf(score[i][0] + score[i][1])+1; //�ε����� ã���� �ߺ���ҿ� ���ؼ� ���� ���� �ε����� ��ȯ�ϹǷ� �ߺ�ó������
        }
	}

}
