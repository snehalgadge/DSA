import java.util.*;
public class arraySum {
    public static int arraySum(int arr[], int size){
        int sum =0;
        for(int i =0; i<size;i++){
            sum += arr[i];
        }
        return sum;
    }

     public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array"); 
        int size = sc.nextInt();
        System.out.print("\nEnter the element of array ");
        int arr[] = new int[100];
        for(int i =0 ; i<size ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("the sum of array is : " + arraySum(arr, size));
     }
}
