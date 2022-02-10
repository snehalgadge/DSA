import javax.sound.sampled.SourceDataLine;

public class unique {

    public static int unique(int arr[],int size){
        int ans = 0; 
        for(int i = 0;i<size ;i++){
            ans = ans^arr[i];
        }
        return ans;
    }
    public static void printArray(int arr[], int size){
        for(int i =0; i<size;i++){
            System.out.print(arr[i]+" ");
        }
    }
  public static void main(String[] args) {
      int arr[] = {1,4,2,3,3,2,1};
      printArray(arr, 7);
      System.out.println("the unique number is :" + unique(arr, 7));
         
  }  
}
