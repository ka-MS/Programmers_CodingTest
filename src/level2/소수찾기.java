package level2;

public class 소수찾기 {
    public static void main(String[] args) {
        System.out.println((int)Math.sqrt(2));
        int answer = 0;
        for (int i = 2; i < 10000000; i++) {
        int k = 0;
        int l = (int)Math.sqrt(i);
            for(int j = 1; j <= l; j++) {
               if(i%j == 0)k++;
            }
            if(k == 1)answer++;
        }

        System.out.println(answer);
    }
    // 1. 먼저 종이를 붙여 만들 수 있는 수를 전부 구해야함
    // 2. 해당 수들이 소수인지 아닌지 판별
    // 3. 갯수 리턴
    // 1번을 해결하기 위해서는 재귀가 필요할 것 같음
    public static int solution(String numbers) {
        int answer = 0;

        return answer;
    }
}
