package level2;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class HIndex {
    public static void main(String[] args) {
//        문제 설명
//        H-Index는 과학자의 생산성과 영향력을 나타내는 지표입니다. 어느 과학자의 H-Index를 나타내는 값인 h를 구하려고 합니다.
//        위키백과1에 따르면, H-Index는 다음과 같이 구합니다.
//        어떤 과학자가 발표한 논문 n편 중, h번 이상 인용된 논문이 h편 이상이고 나머지 논문이 h번 이하 인용되었다면 h의 최댓값이 이 과학자의 H-Index입니다.
//        어떤 과학자가 발표한 논문의 인용 횟수를 담은 배열 citations가 매개변수로 주어질 때, 이 과학자의 H-Index를 return 하도록 solution 함수를 작성해주세요.
//        제한사항
//        과학자가 발표한 논문의 수는 1편 이상 1,000편 이하입니다.
//        논문별 인용 횟수는 0회 이상 10,000회 이하입니다.


        // 문제가 어렵다 먼저 문제 해석을 해야한다.
        // h-index는 h번 이상 인용된 논문이 h편인 h를 구하는 지표다
        // { 9,8,7,6,5,4,3,2,1,0} 해당 과학자는 10편의 논문을 가지고 있다.
        // 여기서 h(0) 0번이상 인용된 논문은 10편이다
        // 1번이상 인용된 논문 = 9편
        // .... 5번 이상 인용된 논문 = 5편 = h(5) -> H-index
        // 6번 이상 인용된 논문 = 4편 < h(6)
        // 7번 이상 인용된 논문 = 3편 ....
        // 즉 이처럼 h번 이상 인용된 논문이 h라면 이것이 H-Index라고 할 수 있다.
        // {1000,999,888,777,666,555,444}
        // 7번 이상 인용된 논문 7편 = 7편 이상 -> H-index
        // 8번 이상 인용된 논문 8편 < 8편 미만

        int[] citations = {0,0,0,0,1,1};
        System.out.println(solution(citations));


    }
    public static int solution(int[] citations) {
        // 정렬 후 배열 에서 index 보다 큰 배열의 갯수 h를 계산 하고 index와 h가 일치하면 될것같다
        //원소 값은 점점 감소하고, 원소 값 이상인 것의 개수는 점점 감소
//        Integer[] sortCitations = Arrays.stream(citations).boxed().toArray(Integer[]::new);
//        Arrays.sort(sortCitations,Collections.reverseOrder());
//        int h = 0;
//        for (int i = 0; i < sortCitations.length; i++) {
//            sortCitations[i] > i;
//        }
        int idx = 0;

        Arrays.sort(citations);

        for (int i = 0; i < citations.length; i++) {
            if(citations[i] >= citations.length-i){
                idx = citations.length-i;
                break;
            }
        }

        return idx;
    }
}
