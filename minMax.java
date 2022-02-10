import java.util.*;
public class minMax{
    public static int getMax(int arr[], int size){
        int max =Integer.MIN_VALUE;
        for(int i = 0; i< size ;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println("The maximum Elemeny in the array is: ");
        return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array ");
        int size = sc.nextInt();
        System.out.println("\nenter the array Elements");
        int arr[] = new int[100];
        for(int i = 0; i<size ; i++){
            arr[i] =  sc.nextInt();
        }
        System.out.print( getMax(arr, size));

    }
}