package leetcode;

import java.util.Arrays;

public class ProductofArrayExceptSelf {
    public static void main(String[] args) {
        // 현재 인덱스를 제외한 나머지 배열 값들의 곱을 저장하는 배열을 만들어라
        // o(n) 시간복잡도를 가져야한다.
        // 나누기 연산을 사용하지 않고 제 시간 에 실행되는 알고리즘을 작성해야 한다.
        int[] nums = {1,2,3,4,5,3,4,3,2,4,5,0,3,4,3};
        Integer k = 300;
        Integer k2 = 300;
        System.out.println(System.identityHashCode(k) + "," + System.identityHashCode(k2));
        System.out.println(k.hashCode() + "," + k2.hashCode());
        System.out.println(k == k2);
        int[] result = productExceptSelf3(nums);
        for(int i : result) {
            System.out.print(i+",");
        }

    }

    public static int[] productExceptSelf(int[] nums) {
        int[] array = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            array[i] = 1;
            for (int j = 0; j < nums.length; j++) {
            if(i == j)continue;
                array[i] *= nums[j];
            }
        }
        return array;
    }

    public static int[] productExceptSelf2(int[] nums) {
        // 2중 for문을 돌리지 말아야하고 결과값은 자신을 제외한 모든배열값의 곱이기 때문에
        // total을 구해서 나누는 방식으로 접근했다.
        int[] array = new int[nums.length];
        int total = 1; // 배열의 모든값을 곱하여 넣어줄 변수
        int zeroCheck = 0; // 배열내에 0의 갯수를 파악하기 위한 변수
        int idx = 0; // 0이 한개일 경우 해당 인덱스를 제외한 배열은 모두 0이기 때문에 해당 배열의 인덱스를 알기위한 변수
        
        // 0의 갯수를 파악하면서 total값을 만듦
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == 0){
                zeroCheck++;
                idx = i;
                if(zeroCheck >= 2){
                    break;
                }
                continue;
            }
            total *= nums[i];
        }

        // 배열 내에 0이 있을 경우 반복문으로 진입하지 않고 끝나도록 
        if(zeroCheck >= 2){
            return array;
        }else if(zeroCheck == 1){
            array[idx] = total;
            return array;
        }

        // 배열내에 0이 하나도 없는경우 전체곱에서 자신을 나눠 값을 구함
        for(int i = 0; i<nums.length;i++){
            array[i] = total/nums[i];
        }
        
        // 결론적으로 최악의 경우에도 O(n+n) 이기 때문에 조건 성립
        return array;
    }

    public static int[] productExceptSelf3(int[] nums) {
        int[] array = new int[nums.length];
        int[] array2 = new int[nums.length];
        int total = 1;
        for (int i = 0;i < nums.length-1; i++) {
            array[i] = nums[i+1] * total;
            total *= nums[i];
        }
        int total2 = 1;
        for(int i = nums.length-1;i > 1; i--){
            array2[i] = nums[i-1] * total2;
            total2 *= nums[i];
        }

        for (int i = 0; i < nums.length; i++) {
            array[i] *= array2[nums.length-1-i];
        }
        return array;
    }
}
