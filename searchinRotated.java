public class searchinRotated {
    // to get pivot element
   public static int getPivot(int[] arr,int n){
       int start = 0;
       int end = n-1;
       int mid = start+(end -start)/2;
       while(start<end){
           if(arr[mid]>=arr[0]){
               start = mid+1;
           }
           else{
               end = mid;
           }
           mid = start+(end-start)/2;
       }
       return start;
   }
 //Now searching
  public static int binarySearch(int[] arr , int start,int end , int key){
      int mid = start+(end -start)/2;
     while(start<=end){
         if(key==arr[mid]){
             return mid;
         }
         else if(key<arr[mid]){
            end = mid-1;
         }
         else{
             start = mid+1;
         }
         mid = start+(end -start)/2;
     }   
      return -1;
  }

   //searching in rotated array
   public static int searchinRotated(int[] arr,int n , int key){
       int pivot = getPivot(arr, n);
       if(key>=arr[pivot] && key<=arr[n-1]){
           return binarySearch(arr, pivot, n-1, key);
       }
       return binarySearch(arr, 0, pivot-1, key);
   }

   //main function
  public static void main(String[] args) {
      int[] arr ={7,9,1,2,3};
      int n = 5;
      int key = 9;
      System.out.println("the "+key+" is present at index "+searchinRotated(arr, n, key));
  }

}
