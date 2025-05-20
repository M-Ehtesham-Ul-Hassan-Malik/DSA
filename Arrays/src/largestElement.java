//Input: nums = [3, 3, 6, 1]
//Output: 6
//Explanation: The largest element in array is 6
//Input: nums = [3, 3, 0, 99, -40]
//Output: 99
//Explanation: The largest element in array is 99
public class largestElement {

    int arr [] =   {3,3,0,99,-40,6,1};
    public int largest_function(){
        int largest = arr[0];
        for (int i=0; i< arr.length-1; i++){
            if (arr[i]>largest){
                largest = arr[i];
            };
        };
        return largest;
    }

    public static void main(String[] args) {
        largestElement obj = new largestElement();
        System.out.println(obj.largest_function());
    }


}
