package Level01;

public class x만큼간격이n개있는숫자 {
    public static void main(String[] args) {
        int n = 1000;
        int x = -10000000;
        long[] result = solution(x,n);
        for(long i : result) {
            System.out.print(i +",");
        }
        System.out.println();
        System.out.println(result.length);
    }

    public static long[] solution(int x, int n) {
        long[] answer = new long[n];
        long num = x; // int범위인 21억을 넘으면 정상적으로 저장이 되지 않는부분 주의
        for(int i = 0; i < n; i++){
            answer[i] = num;
            num += x;
        }
        return answer;
    }
}
