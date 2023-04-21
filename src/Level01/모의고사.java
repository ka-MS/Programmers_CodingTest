package Level01;

import java.util.ArrayList;

public class 모의고사 {
    public static void main(String[] args) {
        int[] answers = {1, 2, 3, 4, 5};
        solution(answers);
        System.out.println(solution2(answers));
    }

    public static ArrayList<Integer> solution(int[] answers) {
        int[] answer = new int[3];
        int[][] student = {{1, 2, 3, 4, 5},{2, 1, 2, 3, 2, 4, 2, 5},{3, 3, 1, 1, 2, 2, 4, 4, 5, 5}}; // 찍기 방식
        ArrayList<Integer> result = new ArrayList<Integer>();
        int max = 0; // 최대값 판별

        for (int i = 0; i < student.length; i++) {
            int idx = 0;
            for (int j = 0; j < answers.length; j++) {
                if(student[i][idx++] == answers[j]){
                    answer[i]++;
                }
                if(idx >= student[i].length){
                    idx = 0;
                }
            }
        }

        max = Math.max(answer[0], Math.max(answer[1],answer[2]));

        for(int i = 0; i < answer.length; i++) {
            if(max == answer[i]){
                result.add(i+1);
            }
        }
        
        return result;
    }

    public static int[] solution2(int[] answers) {
        int[] answer = new int[3];
        int[][] student = {{1, 2, 3, 4, 5},{2, 1, 2, 3, 2, 4, 2, 5},{3, 3, 1, 1, 2, 2, 4, 4, 5, 5}}; // 찍기 방식
        ArrayList<Integer> list = new ArrayList<Integer>(); //중복 max갯수 판별용 list
        int max = 0; // 최대값 판별

        for (int i = 0; i < answers.length; i++) {
            if(student[0][(i)%student[0].length] == answers[i])answer[0]++; // 0%5 = 0을 이용하여 인덱스에 배열의 크기의 나머지를 활용하여 구함
            if(student[1][(i)%student[1].length] == answers[i])answer[1]++;
            if(student[2][(i)%student[2].length] == answers[i])answer[2]++;
        }

        max = Math.max(answer[0], Math.max(answer[1],answer[2])); // max값

        for(int i = 0; i < answer.length; i++) {
            System.out.println(answer[i]);
            if(max == answer[i]){
                list.add(i+1);
            }
        }

        int[] result = new int[list.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = list.get(i);
        }

        return result;
    }
}
