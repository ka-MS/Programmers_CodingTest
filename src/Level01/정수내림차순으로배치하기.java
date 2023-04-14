package Level01;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.LongStream;

public class 정수내림차순으로배치하기 {
    public static void main(String[] args) {
        /*
        함수 solution은 정수 n을 매개변수로 입력받습니다. n의 각 자릿수를 큰것부터 작은 순으로 정렬한 새로운 정수를 리턴해주세요.
        예를들어 n이 118372면 873211을 리턴하면 됩니다.
        제한 조건
        n은 1이상 8000000000 이하인 자연수입니다.
         */
        long n = 118372;
        solution(n);


    }
    public static long solution(long n) {
        long answer = 0;
        String[] s = String.valueOf(n).split("");
        String sort = Arrays.stream(String.valueOf(n).split(""))
                .sorted((s1, s2) -> (s2+s1).compareTo(s1+s2))
                .collect(Collectors.joining());
        answer = Long.valueOf(sort);
        return answer;
    }
}
