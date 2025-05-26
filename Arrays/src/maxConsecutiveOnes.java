public class maxConsecutiveOnes {


    public int solution(int arr[]){
        int max = 0;
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                counter += 1;
                if (max<counter){
                    max=counter;
                }
            } else{
                counter = 0;
            }

        }
        return max;
    }

    public static void main(String[] args) {
        maxConsecutiveOnes obj = new maxConsecutiveOnes();
        int arr[] = {1,1,0,0,1,1,1,0,1,1,1,1,0,0,1,1,1,1,1,1,1,1,1,1,0,1,1,1,}; //10
        int result = obj.solution(arr);
        System.out.println(result+" ");
    }
}
