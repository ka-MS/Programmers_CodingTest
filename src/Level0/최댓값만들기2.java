package Level0;

public class �ִ񰪸����2 {

	public static void main(String[] args) {
		// ���� �迭 numbers�� �Ű������� �־����ϴ�. numbers�� ���� �� �� ���� ���� ���� �� �ִ� �ִ��� return�ϵ���
		// solution �Լ��� �ϼ����ּ���.
		
		int[] numbers = {-500 , 2};
		int answer = 0;
		
		for(int i = 0; i<numbers.length ; i++) {
			for(int k = 0; k<numbers.length;k++ ) {
				if(i != k) {
					if(numbers[i]*numbers[k] > answer) {
						answer = numbers[i]*numbers[k];
					}
					
				}
			}
		}
		if(numbers.length == 2) {
			answer = numbers[0]*numbers[1];
		}
		System.out.println(answer);
			
	}

}
