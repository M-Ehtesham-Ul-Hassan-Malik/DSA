import java.util.ArrayList;
import java.util.List;

public class findMissingElements {
    public int findMissing(int[] arr) {
        int n = arr.length;
        for (int i = 0; i <= n + 1; i++) {
            boolean found = false;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == i) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                return i;
            }
        }
        return -1; // Return -1 if no missing element is found
    }

    public static void main(String[] args) {
        findMissingElements obj = new findMissingElements();
        int[] arr = {1, 2, 3, 4, 5, 6};
        int missing = obj.findMissing(arr);
        System.out.println(missing);
    }
}
