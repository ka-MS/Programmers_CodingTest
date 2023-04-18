package level2;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.IntStream;

public class 가장큰수 {
    public static void main(String[] args) {
        /*
        0 또는 양의 정수가 주어졌을 때, 정수를 이어 붙여 만들 수 있는 가장 큰 수를 알아내 주세요.
        예를 들어, 주어진 정수가[6, 10, 2]라면[6102, 6210, 1062, 1026, 2610, 2106]를 만들 수 있고, 이중 가장 큰 수는 6210 입니다.
        0 또는 양의 정수가 담긴 배열 numbers가 매개변수로 주어질 때, 순서를 재배치하여 만들 수 있는
        가장 큰 수를 문자열로 바꾸어 return 하도록 solution 함수를 작성해주세요.
        */
        int[] numbers = {3, 30, 34, 5, 9};
        System.out.println(solution(numbers));

        System.out.println("909".compareTo("990"));
    }

    public static String solution(int[] numbers) {
        String answer = "";
        String[] array = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            array[i] = String.valueOf(numbers[i]);
        }
        Arrays.sort(array, new Comparator<>() {
            @Override
            public int compare(String o1, String o2) {
                return (o2 + o1).compareTo(o1 + o2);
            }
        });

        StringBuilder sb = new StringBuilder();
        for (String i : array) {
            sb.append(i);
        }
        answer = array[0].equals("0") ? "0" : sb.toString();
        return answer;
    }
}
