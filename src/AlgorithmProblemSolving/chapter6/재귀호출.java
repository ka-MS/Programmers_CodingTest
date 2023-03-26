package AlgorithmProblemSolving.chapter6;

import java.util.ArrayList;

public class 재귀호출 {
    public static void main(String[] args) {
        System.out.println(sum(6));
        System.out.println(recursiveSum(6));

        System.out.println(pick(3));
        pick(3,new ArrayList<>(),4);

    }
    static int sum(int a){
        //1~n까지의 합을 구하는 일반적인 반복문
        int result = 0;
        for(int i=1; i<=a; i++){
            result += i;
        }
        return result;
    }

    static int recursiveSum(int a){
        // a가 1이면 1 반환 1이 아니면 a값 + 함수(a-1) 재귀 호출
        // 재귀 호출을 이용하기 위해서는 n개의 숫자의 합을 구하는 작업을 n개의 조각으로 쪼개
        // 더할 각 숫자가 하나의 조각이 되도록 함.
        // 모든 재귀함수는 더이상 쪼개지지 않는 최소한의 작업에 도달했을 때 답을 반환하는 조건문을 포함해야함
        // 최소한의 작업을 base case 기저사례 라고 함
        if(a == 1)return 1;
        return a + recursiveSum(a-1);
    }

    static int pick(int n){
        //0번부터 차례대로 번호 매겨진 n개의 원소중 m개를 고르는 모든 경우의수 -> m만큼 for문을 돌려줘야하는 문제
        int result = 0;
        for(int i = 0; i < n; i++){
            for(int j = i+1 ; j < n; j++){
                for(int k = j+1 ; k < n; k++){
                    for (int l = k+1; l < n; l++){
                        System.out.println(i+","+j+","+k +","+l);
                        result ++;
                    }
                }
            }
        }
        return result;
    }

    /* 1. n: 원소의 수 0~n까지
       2. picked : 지금까지 고른 원소리스트 (배열)
       3. toPick : 원소를 몇개 고를것인지(배열크기) 위 함수에서는 m
     */
    static void pick(int n, ArrayList<Integer> picked, int toPick) {
        // 원소를 모두 골랐으면 탈출
        //
        if(toPick == 0){
            System.out.println(picked);
            return;
        }

        int startNum = 0; // 숫자 고르기
        if (picked.size() != 0) {
            startNum = picked.get(picked.size() - 1) + 1; // 직전에 고른 숫자보다 1 큰 숫자부터 반복문시작
        }

        for (int i = startNum; i <= n; i++) {
            picked.add(i);  // 작은 숫자부터 반복을 시작하여 고른 원소 리스트에 담음
            System.out.println("재귀 진입전 : " + i);
            pick(n, picked, toPick - 1);    // 작은 원소부터 차례로 담는 과정을 재귀로 반복
            System.out.println("재귀탈출 : " + picked);
            picked.remove(picked.size() - 1);   // 마지막 원소를 지우고 또 다시 추가, 재귀 반복
            System.out.println("마지막원소삭제");
            // 반복문의 조건이 끝나야 재귀도 종료

            /* for문이 돌면 서 재귀를 반복하는과정
            [n = 4, 고를 원소 갯수는 3일때]
            1. startNum 숫자 0 으로 초기화
            2. size가 0이면 (저장된 숫자가 없으면) for문으로 바로진입
            3. i = 0 배열에 저장 후 다음칸(toPick-1 = 2) 재귀 호출
            4. 배열 사이즈가 1임 startNum = (picked.size() - 1)+1 = 1 할당 후 for문 진입
            5. i = 1 배열에 저장 후 다음칸(toPick-1 = 1) 재귀 호출
            6. 배열 사이즈가 2임 startNum = 2 할당 후 for문 진입
            7. i = 2 배열에 저장 후 다음칸(toPick-1 = 0) 재귀 호출
            8. 기저사례 도착 [0,1,2]배열 출력 후 return;
            9. 7번에서 생성한 재귀탈출하여 picked.remove 도착 마지막원소 [0,1,2]중 2 삭제
            10. 7번 루프에서 i++ 되어 i = 3 배열에 저장 후 다음칸(toPick-1 = 0) 재귀 호출
            11. 기저사례 도착 배열 [0,1,3]출력 후 return; picked.remove 도착 마지막원소 [0,1,3]중 3 삭제
            12. 7번루프에서 i++ 되어 i = 4 배열에 저장 후 다음칸(toPick-1 = 0) 재귀 호출
            13. 기저사례 도착 배열 [0,1,4]출력 후 return; picked.remove 도착 마지막원소 [0,1,4]중 4 삭제
            14. i = n 도달하여 for문 종료 -> 다음 자리수 시작 5번 으로 다시 이동...
            반복
             */
        }
    }
}
