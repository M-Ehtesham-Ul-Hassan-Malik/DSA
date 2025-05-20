import java.util.Arrays;

public class copyingArray {
    public static void main(String[] args) {

        int arr1 [] = {1,2,3,4};
        int arr2 [] = {8,11,14};
        int result[] = new int[arr1.length+arr2.length];

        System.arraycopy(arr2,0,result, 0,arr2.length);
        System.arraycopy(arr1,0,result,arr2.length,arr1.length);

        System.out.println(Arrays.toString(result));
    }
}
