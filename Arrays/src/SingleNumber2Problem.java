//Given an integer array nums where every element appears three times except for one, which appears exactly once. Find the single element and return it.
//
//You must implement a solution with a linear runtime complexity and use only constant extra space.

//Example 1:
//Input: nums = [2,2,3,2]
//Output: 3
//Example 2:
//Input: nums = [0,1,0,1,0,1,99]
//Output: 99

public class SingleNumber2Problem {

    public int solution(int arr[]){
        int occurance =0;

        for (int i = 0; i < arr.length; i++) {
            occurance =0;
            for (int j = 0; j < arr.length; j++) {
                if(arr[j] == arr[i]){
                    occurance+=1;
                }
            }
            if (occurance == 1){
                return arr[i];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        SingleNumber2Problem obj = new SingleNumber2Problem();
        int arr[]= {2,2,3,2};
        int res = obj.solution(arr);
        System.out.println(res+" ");
    }
}
