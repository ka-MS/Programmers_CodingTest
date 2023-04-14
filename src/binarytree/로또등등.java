package binarytree;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class 로또등등 {
    public static void main(String[] args) {
        boolean[] balls = new boolean[45];
        int[] lotto = new int[6];
        int idx = 0;
        int choice = 0;
        while(lotto[5] == 0){
            choice = (int) (Math.random()*45);
            if(balls[choice]){
                continue;
            }else{
                lotto[idx] = choice+1;
                balls[choice] = true;
                idx++;
            }
        }

//        for(int j : lotto){
//            System.out.print(j+",");
//        }

        // [7, 3, 2, 9, 4]가 들어있는 배열을 오름차순으로 정렬
        int[] sort = {7,3,2,9,4};
        int temp = 0;
        for(int i = 0; i < sort.length-1; i++){
            for(int j = i; j < sort.length; j++){
                if(sort[i] > sort[j]){
                    temp = sort[j];
                    sort[j] = sort[i];
                    sort[i] = temp;
                }
            }
        }
        for(int  i : sort){
            System.out.println(i);
        }

        System.out.println(factor(4));
//        int[] numbers= new int[1000000000];
//        numbers[560349523] = 960000000;
//        for(int i = 0; i <numbers.length; i++){
//            if(numbers[i] == 960000000){
//                System.out.println(i);
//                break;
//            }
//        }
        System.out.println("완료");
        int result = 0;
        for (int i = 1; i <= 1000; i++) {
            if(i%3 == 0){
                result -= i;
            }else if(i%2 == 1){
                result += i;
            }
        }
        System.out.println(result);
        /* ex)
Sssss
sSsss
ssSss
sssSs
ssssS
sssSs
ssSss
sSsss
Sssss
*/
        int check = 0;
        for(int i = 0; i < 9 ; i++) {
            for(int j = 0; j < 5; j++) {
                if(i == j || 8-i == j) {
                    System.out.print("S");
                }else{
                    System.out.print("s");
                }
            }
            System.out.println();
        }
        String s = "sssss";
        StringBuilder sb =new StringBuilder() ;
        for(int i = 0; i < s.length()*2-1; i++) {
            sb.delete(0, s.length());
            sb.append(s);
            if(i < sb.length()){
                sb.setCharAt(i, 'S');
            }else{
                sb.setCharAt(sb.length()*2-2-i, 'S');
            }
            System.out.println(sb);
        }
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    }

    static int factor(int num){
        if(num == 0) return 0;
        return factor(num-1)+num;
    }
}
