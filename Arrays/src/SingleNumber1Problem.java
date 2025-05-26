//Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

//You must implement a solution with a linear runtime complexity and use only constant extra space.

//Example 1:
//Input: nums = [2,2,1]
//Output: 1
//Example 2:
//Input: nums = [4,1,2,1,2]
//Output: 4

public class SingleNumber1Problem {

    public int solution(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int occurance = 0;
            for (int j = 0; j < n; j++) {
                if (arr[j] == arr[i]) {
                    occurance += 1;
                }
            }
        if (occurance == 1){
            return arr[i];
        }

        }
        return -1;

    }

    public static void main(String[] args) {
        SingleNumber1Problem obj = new SingleNumber1Problem();
        int arr[] = {2,2,3,3,8,4,4,5,5}; //3
        int result = obj.solution(arr);
        System.out.println(result+" ");
    }
}
