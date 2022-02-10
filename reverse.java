public class reverse {
    public static void printArray(int[] arr){
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void array(int arr[]){
        int start =0;
        int end = arr.length-1;

        while(start<end){
            int temp =arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] arr ={12,13,14,15,16,17,11};
        printArray(arr);
        array(arr);


    }
}
