import java.util.ArrayList;
import java.util.List;

public class findMissingElements {
//    public int findMissing(int[] arr) {
//        int n = arr.length;
//        for (int i = 0; i <= n + 1; i++) {
//            boolean found = false;
//            for (int j = 0; j < arr.length; j++) {
//                if (arr[j] == i) {
//                    found = true;
//                    break;
//                }
//            }
//            if (!found) {
//                return i;
//            }
//        }
//        return -1; // Return -1 if no missing element is found
//    }

    //=================OPTIMAL SOLUTION=======================================

    public int findMissing(int[]arr){

        int n = arr.length+1; // The length of the array plus one (the missing number)
        int sum = (n*(n+1))/2;
        int k = 0;
        for (int i = 0; i < arr.length ; i++) {
            k = k+arr[i];
        }
        
//        int missing = -1;
//        if (k != sum){
//            return missing = sum-k;
//        }
//        return missing;

        return sum-k;
    }

    public static void main(String[] args) {
        findMissingElements obj = new findMissingElements();
        int[] arr = {1, 2, 3, 5, 6};
        int missing = obj.findMissing(arr);
        System.out.println(missing);
    }
}
