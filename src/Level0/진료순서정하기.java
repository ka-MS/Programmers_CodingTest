package Level0;

import java.util.Arrays;
import java.util.Comparator;

public class 진료순서정하기 {

	public static void main(String[] args) {
		// 외과의사 머쓱이는 응급실에 온 환자의 응급도를 기준으로 진료 순서를 정하려고 합니다. 정수 배열 emergency가 매개변수로 주어질 때
		// 응급도가 높은 순서대로 진료 순서를 정한 배열을 return하도록 solution 함수를 완성해주세요.

		int[] emergency = { 30, 10, 23, 6, 100 };
		int leng = emergency.length;
		int[] answer = new int[leng];
		int[] arr = emergency.clone();
		Arrays.sort(emergency);
		for (int i = 0; i < leng; i++) {
			int j = 1;
			for (int k = leng-1; k >= 0; k--) {
				if (arr[i] == emergency[k]) {
					answer[i] = j;
				}
				j++;
			}
		}
		
		// 배열은 그냥 붙여넣으면 얕은복사가되어 메인배열값이 변하면 복사한 객체의 값도 변하게 된다
		// clone() 혹은 System.arraycopy() 을 사용하여 깊은 복사를 시킬 수 있다.
//		void arraycopy(Object src, int srcPos, Object dest, int destPos, int length);
//		src : 원본 배열 객체
//		srcPos : src 배열 객체에서 복사를 시작할 index
//		des : 복사될 배열 객체
//		desPos : 복사될 배열 객체의 시작 index
//		length : 복사할 배열의 길이
	}

}
