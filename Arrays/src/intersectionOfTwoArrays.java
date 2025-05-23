import java.util.ArrayList;
import java.util.List;

public class intersectionOfTwoArrays {

    public int[] intersection(int[] arr1, int[] arr2){
        List<Integer> intersection = new ArrayList<>();
        for (int i = 0; i <arr1.length ; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]){
                    if (!intersection.contains(arr1[i])){
                    intersection.add(arr1[i]);
                }
                }
            }
        }
        int arr[] = new int[intersection.size()];
        for (int i = 0; i < intersection.size(); i++) {
            arr[i] = intersection.get(i);
        }
        return arr;
    }

    public static void main(String[] args) {
        intersectionOfTwoArrays obj = new intersectionOfTwoArrays();
        int arr1[] = {1,2,3,4,5,5};
        int arr2[] = {3,4,5,6,7};
        int arr [] = obj.intersection(arr1,arr2);
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
