public class rotateByKindex {

    public void rotateArray(int arr[], int k){
        k = k % arr.length;     //handle the cases where k > arr.length
        reverse(arr, 0, arr.length-1); //entire array
        reverse(arr, 0,k-1); // reverse first k elements
        reverse(arr, k, arr.length-1); // reverse rest of the array
    }

    public void reverse(int arr[], int start, int end){
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {

        rotateByKindex obj = new rotateByKindex();
        int arr[] = {1,2,3,4,5,6,7};
        obj.rotateArray(arr,3);

        for (int i = 0; i < arr.length-1 ; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
