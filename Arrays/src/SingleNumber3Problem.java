//Given an integer array nums, in which exactly two elements appear only once and all the other elements appear exactly twice. Find the two elements that appear only once. You can return the answer in any order.

//You must write an algorithm that runs in linear runtime complexity and uses only constant extra space.

import java.util.ArrayList;
import java.util.List;

//Example 1:
//Input: nums = [1,2,1,3,2,5]
//Output: [3,5]
//Explanation:  [5, 3] is also a valid answer.
//Example 2:
//Input: nums = [-1,0]
//Output: [-1,0]
//Example 3:
//Input: nums = [0,1]
//Output: [1,0]
public class SingleNumber3Problem {

    public int[] solution(int arr[]){
        List<Integer> once = new ArrayList<>();
        int occrance = 0;
        for (int i = 0; i < arr.length; i++) {
            occrance=0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == arr[i]) {
                    occrance+=1;
                }
            }
            if (occrance == 1) {
                once.add(arr[i]);
            }
        }

        int res[] = new int[once.size()];
        for (int i = 0; i < once.size(); i++) {
            res[i] = once.get(i);
        }
        return res;
    }

    public static void main(String[] args) {
        SingleNumber3Problem obj = new SingleNumber3Problem();
        int arr[] = {1,2,1,3,2,5}; // [3,5]
        int result [] = obj.solution(arr);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]+" ");
        }



    }
}
