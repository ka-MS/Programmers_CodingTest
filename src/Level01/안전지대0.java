package Level01;

public class 안전지대0 {
    public static void main(String[] args) {
//        다음 그림과 같이 지뢰가 있는 지역과 지뢰에 인접한 위, 아래, 좌, 우 대각선 칸을 모두 위험지역으로 분류합니다.
//        지뢰는 2차원 배열 board에 1로 표시되어 있고 board에는 지뢰가 매설 된 지역 1과, 지뢰가 없는 지역 0만 존재합니다.
//        지뢰가 매설된 지역의 지도 board가 매개변수로 주어질 때, 안전한 지역의 칸 수를 return하도록 solution 함수를 완성해주세요.
        int[][] board = {{1, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 1, 1, 1}, {0, 0, 0, 0, 1}};
        boolean[][] flag = new boolean[board.length][board.length];
        System.out.println(checkBoard(board, -1, -1, flag));

    }

    public static int checkBoard(int[][] board, int x, int y, boolean[][] flag) {
        int answer = 0; // 결과값
        // 최초에 X값과 Y값을 -1로 설정하여 지뢰가 있는 칸을 찾았음
        if (x == -1) {
            for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board.length; j++) {
                    if (board[i][j] == 1) {
                        x = i;
                        y = j;
                        answer += checkBoard(board, x, y, flag); // 지뢰가 발견되면 위험지역 체크하기위해
                    }
                }
            }
            answer = board.length * board.length - answer; // 위험지역을 제외한 칸수 계산
        } else {
            for (int i = -1; i < 2; i++) {
                if ((x == 0 && i == -1) || (x == board.length - 1 && i == 1)) continue;
                for (int j = -1; j < 2; j++) {
                    if ((y == 0 && j == -1) || (y == board.length - 1 && j == 1)) continue;
                    if (flag[x + i][y + j] != true) {
                        flag[x + i][y + j] = true;
                        answer++;
                    }
                }
            }
        }
        return answer;
    }
}
