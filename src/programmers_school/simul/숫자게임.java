package programmers_school.simul;

import java.util.*;

public class 숫자게임 {
    public static void main(String[] args) {

    }
    public static int solution(int[] A, int[] B) {
        Arrays.sort(B);
        Arrays.sort(A);
        int answer = 0;
        int index = B.length;

        for(int i = A.length-1; i >= 0; i++){
            if(A[i] < B[index - 1]){
                answer++;
                index--;
            }
        }
        return answer;
    }
}
