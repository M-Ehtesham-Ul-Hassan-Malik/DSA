import java.util.ArrayList;
import java.util.List;

public class moveZeroAtTheEnd {


    public int[] moveZeros(int [] arr){
        List<Integer> temp= new ArrayList<>();
        int n = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                temp.add(arr[i]);
            } else if (arr[i] == 0) {
                n++;
            }
        }
        for (int i = 0; i < n; i++) {
            temp.add(0);
        }

        for (int i = 0; i < temp.size(); i++) {
            arr[i] = temp.get(i);
        }

        return arr;
    }


    public static void main(String[] args) {
        moveZeroAtTheEnd obj = new moveZeroAtTheEnd();
        int arr[] = {1,3,0,5,6,0,0,6,1,3,0,7,5,14};
        obj.moveZeros(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
