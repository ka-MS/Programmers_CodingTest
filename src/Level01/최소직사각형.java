package Level01;

import java.util.Arrays;
import java.util.Comparator;

public class 최소직사각형 {
    public static void main(String[] args) {
        /*
        문제해석
        1. 모든 크기의 명함을 수납할 수 있으면서 최대크기의 명함 사이즈여야함
        2. 가로 최대 80x40인 명함과 세로 최대 30x70 그리고 60x50 명함이 있으면
        3. 30x70을 눕혀 넣으면 80x50이 최대 사이즈가 되게됨
         */
        /*
        풀이
        어떻게 비교하는것이 좋을것인가
        각 명함의 가로세로를 비교해서 긴쪽을 가로로 변경시켜준다
        -> 긴 부분을 한쪽으로 몰아줌
         */
        int[][] sizes = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};
        Arrays.sort(sizes, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0]-o2[0];
            }
        });
        for (int i = 0; i < sizes.length; i++) {
            System.out.println(sizes[i][0]+","+sizes[i][1]);
        }

        solution(sizes);
    }

        public static int solution(int[][] sizes) {
            int answer = 0;
            int lengthChange = 0;
            int wMax = 0;
            int hMax = 0;
            for (int i = 0; i < sizes.length; i++) {
                if(sizes[i][0] < sizes[i][1]){
                    lengthChange = sizes[i][0];
                    sizes[i][0] = sizes[i][1];
                    sizes[i][1] = lengthChange;
                }
                wMax = Math.max(wMax,sizes[i][0]);
                hMax = Math.max(hMax, sizes[i][1]);
            }
//            System.out.println(wMax +"," +hMax);
            return wMax*hMax;
        }

    public static int solution2(int[][] sizes) {
        int wMax = 0;
        int hMax = 0;

        for (int i = 0; i < sizes.length; i++) {
            wMax = Math.max(wMax,Math.max(sizes[i][0],sizes[i][1]));
            hMax = Math.max(hMax, Math.min(sizes[i][0],sizes[i][1]));
        }

        return wMax*hMax;
    }

}
