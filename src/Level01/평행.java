package Level01;

import java.util.HashSet;
import java.util.Set;

public class 평행 {
    public static void main(String[] args) {
//        점 네 개의 좌표를 담은 이차원 배열 dots가 다음과 같이 매개변수로 주어집니다
//        [[x1, y1], [x2, y2], [x3, y3], [x4, y4]]
//        주어진 네 개의 점을 두 개씩 이었을 때, 두 직선이 평행이 되는 경우가 있으면 1 을 없으면 0 을 return 하도록 solution 함수를 완성해보세요.
        //[3, 5], [4, 1], [2, 4], [5, 10]
        int[][] dots = {{0, 4}, {2, 2}, {0, 8}, {4, 4}};
        System.out.println(solution2(dots));
    }

    public static int solution(int[][] dots) {
        // 여기서 두개씩 이었을 때 라는건 
        // a-b , c-d / a-c , b-d/ a-d , b-c/ 세가지 경우만 사용한다는 의미

        int answer = 0;
        Set<Double> check = new HashSet<Double>();
        for (int i = 0; i < dots.length - 1; i++) {
            for (int j = i + 1; j < dots.length; j++) {
                double x = Math.abs(dots[i][0] - dots[j][0]);
                double y = Math.abs(dots[i][1] - dots[j][1]);
                System.out.println(y / x);
                ;
                if (check.contains(y / x)) {
                    answer++;
                } else {
                    check.add(y / x);
                }
            }
        }
        System.out.println(answer);
        return answer > 0 ? 1 : 0;
    }

    public static int solution2(int[][] dots) {
        int answer = 0;
        for (int i = 1; i < dots.length; i++) {
            double x = dots[0][0] - dots[i][0];
            double y = dots[0][1] - dots[i][1];
            double check = Math.abs(y/x);
            int idx1 = 0;
            int idx2 = 0;
            for (int j = 1; j < dots.length; j++) {
                if(j == i)continue;
                if(idx1 == 0){
                    idx1 = j;
                }else{
                    idx2 = j;
                }
            }
            x = dots[idx1][0] - dots[idx2][0];
            y = dots[idx1][1] - dots[idx2][1];
            if(check == Math.abs(y/x)){
                return 1;
            }
        }
        return 0;
    }
}
