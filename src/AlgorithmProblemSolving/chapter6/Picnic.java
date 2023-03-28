package AlgorithmProblemSolving.chapter6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Picnic {
    // 문제를 읽을때 완전탐색임을 알아야한다. -> 그래야 재귀를 쓰는것
    // 해당 문제는 조건이 하나밖에 없는상태였다.
    public static void main(String[] args) throws IOException {
        // 문제 해석
        // 1. 테스트 케이스의 수 c<50 가 주어지고
        // 2. 학생수 2<=n<=10 과 친구 쌍의 수 m이 입력으로 주어짐
        // 3. 서로 친구인 학생의 관계가 주어짐 학생의 번호가 m*2만큼 주어지는데 [0,1,0,2,2,3] 이런식이면 0,1/0,2/2,3 그룹이 친구관계
        // 4. 2번과 3번 묶음이 하나의 테스트 케이스다.
        // 5. 테스트 케이스 c 만큼 반복하여 친구 명단을 이용하여 짝이 될 수 있는 경우의 수를 구한다.

        /* 풀이 고민
         1. 각 조건들을 입력받아야하기 때문에 bufferedreader를 생성하여 조건을 입력받는다.
         2. int c에 테스트 케이스를 입력받는다.
         3. 테스트 케이스 만큼 반복시켜줄 for문을 작성한다.
         4. n과 m에 각각 학생수와 친구쌍 수 를 입력받는다.
         5. m만큼 반복하는 for문을 작성하여 학생들의 관계를 입력받는다.
         5-1. 어떤 형식으로 입력받을것인가? int[][]이중배열로 ex) {(1,2,3),(3,0),(1,3)..} 입력받는 방법을 생각해보았으나
            학생마다 친구의 수가 다른데 배열의 크기를 변경할 수 없기때문에 불가.
            2중 ArrayList<ArrayList<int>> 같은 방식도 생각해 보았으나 너무 복잡할것같아 패스
            boolean[][]배열을 사용하면 default값이 false이기 때문에 입력받는 관계들만 true로 설정해주고 for문을 돌리며 true를 제거해주면 될것같음.
         6. boolean[] 배열에 선택된 학생들을 true처리 해 놓으면 false인 경우만 체크할 수 있을것임
         7. 인원수만큼 그룹이 완성되었으면 기저사례로 보내서 스택이 해제 되도록
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int c = Integer.parseInt(br.readLine());// 테스트 케이스 수
        // 테스트 케이스의 수 만큼 테스트 케이스 생성
        for(int i = 0; i < c; i++){
            int n = 0; // 학생수
            int m = 0; // 친구 쌍 수
            boolean[][] friends = new boolean[n][n];
            boolean[] check = new boolean[n];

            while(n < 2 || n >10 || m < 0 || m > n*(n-1)/2){
                System.out.print("n 입력 : ");
                n = Integer.parseInt(br.readLine());
                System.out.print("m 입력 : ");
                m = Integer.parseInt(br.readLine());
            }

            for(int j = 0; j < m; j++){
                System.out.println(m);
                System.out.print("first 입력 : ");
                int first = Integer.parseInt(br.readLine());
                System.out.print("second 입력 : ");
                int second = Integer.parseInt(br.readLine());
                friends[first][second] = true;
                friends[second][first] = true;
            }

            System.out.println(picnic(check,friends,n,n/2));
        }
    }
    static int picnic(boolean[] check,boolean[][] friends,int n,int count){
        if(count == 0){ // 기저사례 : 선택한 그룹이 n/2가 된 경우 return ex)학생이 6명일때 3그룹이 생기면 return
            return 1;
        }

        int k = 0; // 시작할 번호 지정
        for(int i = 0; i < n; i++){
            if(check[i] == false){ // 이전에 선택된적 없는 번호 선택
                k=i;
                break;
            }
        }

        int result = 0; // 기저사례에 도착할 때 마다 +1 되어 횟수 카운트
        for(int i = 0; i < n; i++){
            if(check[i] == false && friends[k][i] == true){ // 시작번호가 선택된적없고, 두 번호가 친구리스트에 있는경우
                check[k] = true; // 체크리스트에 선택된 번호 체크
                check[i] = true; // 체크리스트에 선택된 번호 체크
                count--; // 한 그룹이 생길 때 마다 count에서 -1
                result += picnic(check, friends, n, count);
                count++; // 기저사례 도착하면 count +1
                check[i] = false; // 마지막에 생긴 그룹의 선택을 해제 해 줘야 다른 경우의 수를 찾을 수 있음
                check[k] = false;
            }
        }

//        for(int i = n-1; i >= 0; i--){
//            if(check[i] == true)continue;
//            check[i] = true;
//            for(int j = n-1; j >= 0; j--){
//                if(check[j] == true) continue;
//                check[j] = true;
//                System.out.println(i+","+j);
//                picnic(check,friends,n);
//                k++;
//            }
//        }
        return result;

    }


}
