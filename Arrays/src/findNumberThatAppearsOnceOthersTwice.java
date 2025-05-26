public class findNumberThatAppearsOnceOthersTwice {

    public int solution(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int occurance = 0;
            for (int j = 0; j < n; j++) {
                if (arr[j] == arr[i]) {
                    occurance += 1;
                }
            }
        if (occurance == 1){
            return arr[i];
        }

        }
        return -1;

    }

    public static void main(String[] args) {
        findNumberThatAppearsOnceOthersTwice obj = new findNumberThatAppearsOnceOthersTwice();
        int arr[] = {2,2,3,3,8,4,4,5,5}; //3
        int result = obj.solution(arr);
        System.out.println(result+" ");
    }
}
