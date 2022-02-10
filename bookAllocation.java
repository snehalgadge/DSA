public class bookAllocation {
    public static boolean isPossible(int[] arr,int n,int m,int mid){
        int studentCount = 1;
        int pageSum = 0;
        // System.out.println("isPossible function");
        for(int i =0;i<n;i++){
          if(pageSum+arr[i]<=mid){
             pageSum += arr[i]; 
          }else{

              studentCount++;
              if(studentCount>m || arr[i]>mid){
                  return false;
                }
                pageSum =arr[i];
            }
          
        }
        return true;
    }
    public static int allocateBook(int[] arr, int n,int m){
        int start = 0;
        int sum =0;
        int ans =-1;
        // System.out.println("Allocatebook function");
        for(int i=0;i<n;i++){
            sum +=arr[i];
        }
        int end = sum;
        int mid = start+(end -start)/2;
        while(start<=end){
            if(n<m){
                return -1;
            }
            if(isPossible(arr,n,m,mid)){
                ans = mid;
                end = mid-1;
            }else{
                start =mid+1;
            }
            mid = start+(end - start)/2;
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {5,5,5,5};
        int n=4;
        int m = 2;
        // System.out.println("Main Function");
        System.out.println("the minimum assigment out of maximum is : "+allocateBook(arr, n, m));
    }
}
