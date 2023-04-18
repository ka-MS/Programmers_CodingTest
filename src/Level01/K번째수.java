package Level01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class K번째수 {
    public static void main(String[] args) {
//        배열 array의 i번째 숫자부터 j번째 숫자까지 자르고 정렬했을 때, k번째에 있는 수를 구하려 합니다.
//        예를 들어 array가[1, 5, 2, 6, 3, 7, 4],i = 2, j = 5, k = 3 이라면
//        array의 2 번째부터 5 번째까지 자르면[ 5, 2, 6, 3]입니다.
//        1 에서 나온 배열을 정렬하면[ 2, 3, 5, 6]입니다.
//        2 에서 나온 배열의 3 번째 숫자는 5 입니다.
//        배열 array, [i, j, k]를 원소로 가진 2 차원 배열 commands가 매개변수로 주어질 때, commands의 모든 원소에 대해 앞서 설명한 연산을 적용했을 때 나온 결과를
//        배열에 담아 return 하도록 solution 함수를 작성해주세요.
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};

        int[] result = solution2(array, commands);
        for (int i : result) {
            System.out.print(i + ",");
        }

    }

    public static int[] solution2(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for (int i = 0; i < commands.length; i++) {
            int start = commands[i][0] - 1;
            int end = commands[i][1];
            int check = commands[i][2]-1;
            int[] temp = Arrays.copyOfRange(array, start, end); // 배열 범위지정하여 카피하는 메소드
//            ArrayList<Integer> list = new ArrayList<>();
//            for (int j = start; j < end; j++) {
//                list.add(array[j]);
//            }
//            Collections.sort(list);
//            answer[i] = list.get(check);

            Arrays.sort(temp);
            answer[i] = temp[check];
        }
        return answer;
    }

    public static int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for (int i = 0; i < commands.length; i++) {
            answer[i] = count(array, commands, i);
        }
        return answer;
    }

    public static int count(int[] array, int[][] commands, int idx) {
        int answer = 0;
        int[] cutArray = new int[commands[idx][1] - commands[idx][0] + 1];
        int k = 0;

        for (int i = commands[idx][0] - 1; i < commands[idx][1]; i++) {
            cutArray[k] = array[i];
            k++;
        }
        Arrays.sort(cutArray);
        answer = cutArray[commands[idx][2] - 1];

        return answer;
    }
}
