public class swapAlternate {

    public static void swapAlternate(int arr[], int size){
        int start = 0;
        int next = 1;
        while(start<size){
            int temp = arr[start];
            arr[start]= arr[next];
            arr[next] = temp;
            start+=2;
            next+=2;
        }
        return;
    }

    public static void printArray(int arr[],int size){
        for(int i=0;i<size;i++){
            System.out.print(arr[i] +" ");
        }
    }
    public static void main(String[] args){
        int arr[] = {1,2,3,4,5,6};
        int brr[] ={1,2,7,8,5};

        swapAlternate(arr,5);
        swapAlternate(brr,4);
        
        System.out.println("The  swapping of even number");
        printArray(arr,6);
        System.out.println("\nThe swapping of oddd number");

        printArray(brr,5);
    }
    
}
