public class twoSum {

    public int[] twosum(int[] arr, int target){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j <arr.length ; j++) {
                if (arr[i]+arr[j] == target){
                    return new int[] {i,j};
                }
            }
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        twoSum obj = new twoSum();
        int arr1[] = {2,7,11,15};
        int target1 = 22;

        int n[] = obj.twosum(arr1,target1);

        for (int i = 0; i < n.length; i++) {
            System.out.print(n[i]+" "); // [1,3]
        }
    }
}
