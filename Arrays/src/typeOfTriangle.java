public class typeOfTriangle {


    public String triangleType(int[] arr) {
        String status = null;
        if(arr[0]+arr[1]>arr[2] && arr[0]+arr[2]>arr[1] && arr[1]+arr[2]>arr[0]){
            if((arr[0]!=arr[1]) && (arr[0]!=arr[2]) && (arr[1]!=arr[2])){
                status = "scalene";
            }else if(arr[0] == arr[1] && arr[0] == arr[2]){
                status = "equilateral";
            }else{
                status = "isosceles";
            }
        }else{
            status = "Not a triangle";
        }

        return status;
    }

    public static void main(String[] args) {
        int arr[] = {2,7,7};
        typeOfTriangle obj = new typeOfTriangle();
        System.out.println(obj.triangleType(arr));
    }
}
