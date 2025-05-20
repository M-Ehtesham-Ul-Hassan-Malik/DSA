//Check whether the array is sorted or not
//
public class checkingSortedArray {

    int arr [] = {1,2,3,4,5,6};
//    int arr [] = {23,16,12,10,7};
//    int arr [] = {3,2,5,25,75,9};
    boolean ascending = true, descending = true;

    public void arrayCheck(){
        for (int i = 0; i <arr.length -1 ; i++) {
            if ( arr[i+1] >= arr[i] ){
                descending = false;
            } else if (arr[i] >= arr[i+1]) {
                ascending = false;
            }
        }

        if (ascending){
            System.out.println("Sorted in Ascending.");
        } else if (descending) {
            System.out.println("Sorted in Descending");
        }else{
            System.out.println("Array not sorted!");
        }
    }

    public static void main(String[] args) {
        checkingSortedArray obj = new checkingSortedArray();
        obj.arrayCheck();
    }
}
