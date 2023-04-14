package Level01;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class 특이한정렬 {
    public static void main(String[] args) {
        // 정수 n을 기준으로 n과 가까운 수부터 정렬하려고 합니다. 이때 n으로부터의 거리가 같다면 더 큰 수를 앞에 오도록 배치합니다. 정수가
        // 담긴 배열 numlist와 정수 n이 주어질 때 numlist의 원소를 n으로부터 가까운 순서대로 정렬한 배열을 return하도록
        // solution 함수를 완성해주세요.
        int[] numlist = {10000, 20, 36, 47, 40, 6, 10, 7000};
        int n = 30;
        for(int i : solution2(numlist,n)){
            System.out.print(i+",");
        }
        System.out.println();
        for(int i : solution(numlist,n)){
            System.out.print(i+",");
        }

    }

    public static int[] solution(int[] numlist, int n) {
        int[] check = new int[numlist.length];
        for (int i = 0; i < numlist.length; i++) {
            check[i] = Math.abs(n - numlist[i]);
        }
        for(int i = 0; i < numlist.length; i++) {
            for(int j = i; j < numlist.length; j++){
                if(check[i] > check[j]){
                    int temp = check[j];
                    check[j] = check[i];
                    check[i] = temp;
                    int temp2 = numlist[j];
                    numlist[j] = numlist[i];
                    numlist[i] = temp2;
                } else if (check[i] == check[j]) {
                    if(numlist[i] < numlist[j]){
                        int temp = check[j];
                        check[j] = check[i];
                        check[i] = temp;
                        int temp2 = numlist[j];
                        numlist[j] = numlist[i];
                        numlist[i] = temp2;
                    }
                }
            }
        }
        return numlist;
    }

    public static int[] solution2(int[] numlist, int n) {
        for(int i = 0; i < numlist.length; i++) {
            for(int j = i; j < numlist.length; j++){
                int checki = Math.abs(n - numlist[i]);
                int checkj = Math.abs(n - numlist[j]);
                if(checki > checkj){
                    int temp = numlist[j];
                    numlist[j] = numlist[i];
                    numlist[i] = temp;
                } else if (checki == checkj) {
                    if(numlist[i] < numlist[j]){
                        int temp = numlist[j];
                        numlist[j] = numlist[i];
                        numlist[i] = temp;
                    }
                }
            }
        }
        return numlist;
    }
}
