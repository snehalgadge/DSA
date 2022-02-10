public class uniqueOcc {

    public static int uniqueOcc(int[] arr){
        int start = 0;
        int end = (arr.length)-1;
        int count = 0;
        int ans =0;
       while(start<end){
        //    System.out.print(start);
           if(arr[start]==arr[end]){
               ans = count++;
               end--;
           }else{
               end--;
           }
        }
        start++;
       return ans;
    
        }
    
    public static void main(String[] args) {
        int[] arr = {1,2,3,1,2,3};
        int[] brr = {1,2,2,3,3,3};
       System.out.println( uniqueOcc(arr));
        // uniqueOcc(brr);
        
    }
    
}
