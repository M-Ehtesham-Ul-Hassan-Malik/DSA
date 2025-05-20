//Find Second Largest and Second-Smallest Element
// without sorting the array.

public class secondLargestElement {

    int arr [] = {3,0,99,-33,5,8,9,5};

    public int sLargest(){

        int largest = Integer.MIN_VALUE;
        int sLargest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length ; i++) {
            if (arr[i] > largest){
                sLargest = largest;
                largest = arr[i];
            } else if (arr[i]>sLargest && arr[i]!=largest) {
                sLargest = arr[i];
            }
        }
        return sLargest;
    };

    public int sSmallest(){
        int smallest = arr[0];
        int sSmallest = Integer.MAX_VALUE;

        for (int i = 1; i < arr.length ; i++) {
            if (arr[i]<smallest){
                sSmallest = smallest;
                smallest = arr[i];


            } else if (arr[i]<sSmallest && arr[i]!= smallest) {
                sSmallest = arr[i];
            }
        }
        return sSmallest;
    }

    public static void main(String[] args) {
        secondLargestElement obj = new secondLargestElement();
        System.out.println("Second Largest Element: "+obj.sLargest());
        System.out.println("Second Smallest Element: "+obj.sSmallest());
    }
}
