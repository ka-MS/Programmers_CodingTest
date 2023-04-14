package AlgorithmProblemSolving.chapter7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class QuardTree {
    public static String str;
    public static int idx;

    // 어떤 규칙이 있는지 파악해야함
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int c = Integer.parseInt(br.readLine());
        str = "xbwxwbbwb"; // x가 나오면 재귀 안나오면 위치저장
        int index = 0;
        System.out.println(quadTree(str,index));;
    }

    static String quadTree(String str,int index) {

        char c = str.charAt(index); // 문자열 index 로 가져옴

        if (c != 'x') { //x가 아니라면 c값을 리턴
            return c+"";
        }
        // x 이후로 나오는 4사분면을 나누어 재귀 - divided

        index++; // x 다음 문자열 1사분면 재귀
        String first = quadTree(str,index); // x가 아니라면 알파벳 리턴 x라면 한번더 재귀가 돌것임
        index++;
        String second = quadTree(str, index);
        index++;
        String third = quadTree(str, index);
        index++;
        String fourth = quadTree(str, index);
        
        // 3+4+1+2 로 순서 변경

        return "x"+third+fourth+first+second; // 결과값을 합쳐 return - merge
    }


}
