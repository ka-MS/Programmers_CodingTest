package programmers_school.sort;

public class 마법의엘리베이터 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int storey = 55;
		for(int i = 0; i< 1000; i++) {
			if(solution(i) != solution2(i)) {
				System.out.println(i);
//				break;
			}
		}
		System.out.println(solution(storey));;
		System.out.println(solution2(storey));
	}
	
	public static int solution(int storey) {
        int answer = 0;
        while(storey != 0) {
        	int less = storey%10;
//        	System.out.println(storey/10%10);
        	if( less > 5) {
        		answer += 10 - less;
        		storey += 10;
        	}else if(less == 5 && (storey%100 >= 60 || storey%100 == 55)) {
        		answer += 10 - less;
        		storey += 10;
        	}else {
        		answer += less;
        	}
        	storey /= 10;
        }
        return answer;
    }
	

		  public static int solution2(int storey) {
		    return elevator(storey);
		  }

		  private static int elevator(int floor) {
		    if(floor <= 1) return floor;
		    
		    int under10 = floor % 10;
		    int rest = floor / 10;

		    int c1 = under10 + elevator(rest);
		    int c2 = (10 - under10) + elevator(rest + 1);
		    return Math.min(c1, c2);
		  }

}
