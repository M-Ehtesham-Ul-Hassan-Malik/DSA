public class linearSearch {

    public int search(int[] arr, int target){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        linearSearch obj = new linearSearch();
        int arr[] = {1,2,3,324,23,31,53,5};
        int target = 23;
        int idx = obj.search(arr,target);

        if (idx != -1) {
            System.out.println("Target value found at: "+idx);
        }else {
            System.out.println("Target value does not exist in the provided array....");
        }
    }
}
