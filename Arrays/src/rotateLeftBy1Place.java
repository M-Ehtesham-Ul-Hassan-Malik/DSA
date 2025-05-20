public class rotateLeftBy1Place {


    public void rotateArray(int [] arr){
        int temp = arr[0];
        for (int i = 1; i < arr.length; i++) {
            arr[i-1] = arr[i];
        }
        arr[arr.length-1] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        rotateLeftBy1Place obj = new rotateLeftBy1Place();
        obj.rotateArray(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" "+ arr[i]);

        }
    }
}


