package Level0;

public class Triangle1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 2600000;
		int answer = 0;
        for(int i = n; i >= 1 ; i--){
            for(int k = 1; k <= n; k++ ){
                if(i*k == n ){
                    answer++;
                    System.out.println(answer);
                }
            }
        }
	}

}
