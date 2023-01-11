package Level0;

public class 직사각형넓이구하기 {
	public static void main(String[] args) {
		// 2차원 좌표 평면에 변이 축과 평행한 직사각형이 있습니다. 직사각형 네 꼭짓점의 좌표 [[x1, y1], [x2, y2], [x3,
		// y3], [x4, y4]]가 담겨있는 배열 dots가 매개변수로 주어질 때, 직사각형의 넓이를 return 하도록 solution 함수를
		// 완성해보세요.
		int[][] dots = {{1, 1}, {2, 1}, {2, 2}, {1, 2}};
		int[][] minmax = {{256,256},{-256,-256}};
		for(int i = 0; i<4 ; i++) {
			for(int j = 0; j<2; j++) {
				minmax[0][0] = Math.min(minmax[0][0], dots[i][0]);
				minmax[0][1] = Math.min(minmax[0][1], dots[i][1]);
				minmax[1][0] = Math.max(minmax[1][0], dots[i][0]);
				minmax[1][1] = Math.max(minmax[1][1], dots[i][1]);
			}
		}
		int answer = (minmax[1][0] - minmax[0][0])*(minmax[1][1] - minmax[0][1]);
		System.out.println(answer);
	}
}
