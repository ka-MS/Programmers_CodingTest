package mergeSort;

public class MergeSort {
    /*
    * n개만큼씩 logn만큼 반복하기 때문에 O(nlogn)시간복잡도
    1. 주어진 리스트를 절반으로 분할하여 부분리스트로 나눈다.(divide)
    2. 해당 부분리스트의 길이가 1이 아니라면 1번과정을 되풀이한다.
    3. 인접한 부분리스트끼리 정렬하여 합친다. conquer
    [Top-Down 방식]
     */
    private static int[] sorted;
    // 합치는 과정에서 정렬하여 원소를 담을 임시저장공간 
    // 메모리를 추가로 더 사용하게 된다

    public static void mergeSort(int[] arr) {
        
        sorted = new int[arr.length];
        mergeSort(arr,0, arr.length - 1);
        //
        sorted = null;
    }

    private static void mergeSort(int[] arr, int left, int right) {
        /* Divide
        left == right 즉 부분리스트가 1개의 원소만 갖고있는 경우
        더이상 쪼갤 수 없으므로 리턴
         */
        if (left == right) {
            return;
        }
        int mid = (left + right) / 2; // 절반위치

        mergeSort(arr, left, mid); // 배열의 앞부분 절반중 왼쪽 부분 left ~ mid
        mergeSort(arr, mid + 1, right); // 배열의 뒷 부분 절반중 오른쪽 부분 mid ~ right

        merge(arr, left, mid, right); //병합

    }

    /**
     *합칠 부분리스트는 arr배열의 left ~ right 까지
     * @param arr   정렬할 배열
     * @param left  배열의 시작
     * @param mid   배열의 중간
     * @param right 배열의 끝
     */
    private static void merge(int[] arr, int left, int mid, int right) {
        int l = left; // 왼쪽 부분리스트 시작 인덱스
        int r = mid + 1; // 오른쪽 부분리스트 시작 인덱스
        int idx = left; // 채워넣을 배열의 인덱스

        while(l <= mid && r <= right){
            // 왼쪽 부분 리스트 l번째 원소가 오른쪽 부분리스트 r번째 원소보다 작거나 같을경우
            // 왼쪽의 l번째 원소를 새 배열에 넣고 l과 idx를 1증가
            if(arr[l] <= arr[r]) {
                sorted[idx] = arr[l];
                idx++;
                l++;
            }else{// 앞쪽거가 크면 앞쪽거를 배열에 넣고 앞쪽++ 배열인덱스++
                  // 뒤쪽거가 크면 뒤쪽거 배열에 넣고 뒤쪽인덱스++ 배열인덱스++
                /*
                오른쪽 부분 리스트 r번째 원소가 왼쪽 부분리스트 l번째 원소보다 작거나 같을 경우
                오른쪽 r번째 원소를 새 배열에 넣고 r과 idx를 1 증가시킨다.
                 */
                sorted[idx] = arr[r];
                idx++;
                r++;
            }
        }
        /* 앞쪽배열은 비어있고 뒤에는 데이터가 남아있을때
        왼쪽 부분리스트가 먼저 모두 새 배열에 채워졌을 경우 (l > mid)
        = 오른쪽 부분 리스트 원소가 아직 남아있을 경우
        오른쪽 부분리스트의 나머지 원소들을 새 배열에 채워준다.
         */
        if(l > mid) {
            while (r <= right) {
                sorted[idx] = arr[r];
                idx++;
                r++;
            }
        }else{
            /*
            오른쪽(뒤쪽)배열이 먼저 채워졌을 경우 (r > right)
            왼쪽에 데이터가 남아있는경우
             */
            for(int i = 0; i <= mid - l; i++){
                sorted[idx] = arr[l+i]; //왼쪽 남아있는 애들 차례로 배열에 넣어줌
                idx++;
            }
        }
        
        // 정렬된 배열을 기존배열에 복사하여 옮겨줌
        for(int i = left; i <= right; i++){
            arr[i] = sorted[i];
        }

    }

    public static void main(String[] args) {
        int[] arr = {2,3,1,4,6,8,9,10,7};
        mergeSort(arr);
        for(int data : arr){
            System.out.print(data + ", ");
        }

    }

}
