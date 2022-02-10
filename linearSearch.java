import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

public class linearSearch {

    public static void linearSearch(int[] arr , int size , int x){
        System.out.println("The array is : ");
        for(int i =0 ; i<size; i++){
            System.out.println(arr[i]);
        }
        for(int i = 0 ; i<arr.length ;i++){
            if(arr[i]==x){
                System.out.println("element " +arr[i]+" found at " +i);
            }
        }
        return;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int size = sc.nextInt();
        int [] arr = new int[size];
        for(int i =0;i<size;i++){
           arr[i]=sc.nextInt();
        }
        linearSearch(arr,size ,x);
    }
    
}
