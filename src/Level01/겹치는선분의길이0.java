package Level01;

import java.util.HashMap;
import java.util.Map;

public class 겹치는선분의길이0 {
    public static void main(String[] args) {
//        선분 3 개가 평행하게 놓여 있습니다.세 선분의 시작과 끝 좌표가[[start, end], [start, end], [start, end]]형태로 들어있는 2 차원 배열 lines가 매개변수로
//        주어질 때, 두 개 이상의 선분이 겹치는 부분의 길이를 return 하도록 solution 함수를 완성해보세요.
//        lines가[[0, 2], [-3, -1], [-2, 1]]일 때 그림으로 나타내면 다음과 같습니다.
//        선분이 두 개 이상 겹친 곳은 [-2, -1], [0, 1]로 길이 2만큼 겹쳐있습니다.
        //[-1, 1], [1, 3], [3, 9] //[[0, 5], [3, 9], [1, 10]]
        int[][] lines = {{-1, 0}, {0, 1}, {1, 2}};
        System.out.println(solution(lines));
    }

    public static int solution(int[][] lines) {
        int answer = 0;
        int start = 101;
        int end = -101;
        for(int i = 0; i < lines.length; i++) {
            start = Math.min(lines[i][0],start);
            end = Math.max(lines[i][1],end);
        }
        int[] line = new int[end - start+1];
        for (int j = 0; j < lines.length; j++) {
            int st = lines[j][0] - start; // 이전 배열의 end값과 다음 배열의 start값이 겹쳤을 때 표시를 하지 않아야한다.
            int ed = lines[j][1] - start;

            for(int i =st; i <= ed; i++) {
                if(lines[j][0] != start  && i == st ){ // 배열의 시작값은 최소값이 아니라면 증가시키지 않는다
                    continue;
                }
                line[i] ++;
            }
        }
        for (int i = 0; i < line.length-1; i++) {
            if (line[i] > 1 ) {
                answer++;
            }
        }
        return answer;
    }
}
