import javax.sound.sampled.SourceDataLine;

public class reverseArray {
    public static void reverseArray(int arr[],int size){
        int start = 0;
        int end = size-1;
        while(start<=end){
            int temp = arr[start];
             arr[start] = arr[end];
            arr[end] = temp;
            
            start++;
            end--;
        }
        return;
    }
    public static void printArray(int arr[], int size){
        for(int i = 0 ; i<size;i++){
            System.out.print(arr[i] +" ");
        }
    }
    
    public static void main(String[] args) {
        int arr[] ={10,20,30,40,50,60};
        int brr[] = {10,20,30,40,50};
        reverseArray(arr,6);
        reverseArray(brr,5);
        System.out.println("Even number array \n");
        printArray(arr,6);
        System.out.println("Odd number array ");
        printArray(brr,5);
    }
    
}
