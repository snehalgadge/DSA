public class firstlast {
public static int firstOcc(int[] arr,int key){
    int start = 0;
    int end = (arr.length)-1;
    int ans = -1;
    int mid = start + (end -start)/2;
    while(start<=end){
        if(arr[mid]==key){
            ans = mid ;
            end = mid-1;
        }
        if(arr[mid]<key){
            start = mid+1;
        }
        else{
            end = mid-1;
        }
        mid = start + (end - start)/2;
    }
    
    return ans;

}
public static int lastOcc(int[] arr,int key){
    int start = 0;
    int end = (arr.length)-1;
    int ans = -1;
    int mid = start + (end -start)/2;
    while(start<=end){
        if(arr[mid]==key){
            ans = mid ;
            start = mid+1;
        }
        else if(arr[mid]<key){
            start = mid+1;
        }
        else{
            end = mid-1;
        }
        mid = start + (end - start)/2;
    }
    
    return ans;

}

    public static void main(String[] args) {
      int[] arr = {1,2,2,2,2,3,3,3,3,4,5,5};
      int key = 2;
      System.out.println("first Occurence of 3 is at : "+firstOcc(arr, key)); 
      System.out.println("last occurence of 3 is at:  "+lastOcc(arr, key));
      //total number of occurence
      System.out.println("the total occ : "+((lastOcc(arr, key)-firstOcc(arr, key))+1));
    }
    
}
