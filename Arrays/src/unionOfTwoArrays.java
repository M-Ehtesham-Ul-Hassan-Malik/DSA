import java.util.ArrayList;
import java.util.List;

public class unionOfTwoArrays {

    public int[] union(int arr1[], int arr2[]) {
        List<Integer> temp = new ArrayList<>();
        for (int i = 0; i < arr1.length; i++) {
            if (!temp.contains(arr1[i])){
                temp.add(arr1[i]);
            }
        }
        for (int i = 0; i < arr2.length; i++) {
            if (!temp.contains(arr2[i])) {
                temp.add(arr2[i]);
            }
        }
        int union[] = new int[temp.size()];

        for (int i = 0; i < temp.size(); i++) {
            union[i] = temp.get(i);
        }
        return union;
    }

    public static void main(String[] args) {
        unionOfTwoArrays obj = new unionOfTwoArrays();

//      Test Case 1: Basic Overlap : Expected Output: [1, 2, 3, 4, 5, 6]
//        int[] arr1 = {1, 2, 3, 4};
//        int[] arr2 = {3, 4, 5, 6};

//      Test Case 2: No Overlap: Expected Output: [1, 2, 3, 4]
//      int[] arr1 = {1, 2};
//      int[] arr2 = {3, 4};

//      Test Case 3: All Elements Same: Expected Output: [1]
//      int[] arr1 = {1, 1, 1};
//      int[] arr2 = {1, 1}; //

//       Test Case 4: One Array Empty : Expected Output: [5, 6, 7]
        int[] arr1 = {};
        int[] arr2 = {5, 6, 7};
//

        int union [] = obj.union(arr1,arr2);

        for (int i = 0; i < union.length; i++) {
            System.out.print(union[i]+" ");
        }
    }

}
