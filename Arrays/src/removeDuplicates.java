//Remove duplicates from the sorted array.

public class removeDuplicates {
//    int arr [] = {1,2,2,3,3,3,4,4,4,4};

    public int remDup(int [] arr){
       if (arr.length == 0) return 0;
       int w = 1;
       for (int i= 1; i < arr.length ; i++) {
            if (arr[i] != arr[i-1]){
                arr[w] = arr[i];
                w++;
            }
        }
        return w;
    }

    public static void main(String[] args) {
        removeDuplicates obj = new removeDuplicates();
        int [] arr = {1,2,2,3,3,3,4,4,4,4};
        int k = obj.remDup(arr);  //num of unique elements
        System.out.println("Number of unique elements: "+k);
        System.out.println("Array with unique elements:");
        for (int i = 0; i < k; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}

