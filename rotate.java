import java.util.ArrayList;
import java.util.Scanner;
public class rotate {
public static void rotate(int[] arr,int k){
      for(int i =0 ; i<k;i++){
          rotateArray(arr);
      }
}
    public static void rotateArray(int[] arr){
   int temp = arr[0];
   for(int i =0;i<arr.length-1;i++){
       arr[i] =  arr[i+1];
   }
   arr[arr.length-1] =temp;
}

public static void printArray(int[] arr){
    for(int i =0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr ={1,2,3,4,5,6,7};
        char[] name = new char[10];
        System.out.println("Enter Your name");
        name = sc.next().toCharArray();
        for(int i = 0 ; i<name.length;i++){
            System.out.print(name[i]);
        
        }
        rotate(arr, 3);
        printArray(arr);
    }
}
