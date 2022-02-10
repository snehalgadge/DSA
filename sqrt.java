public class sqrt {
    public static int binarySearch(int n){
        int start =0;
        int end = n;
        int ans = -1;
        int mid = start+(end-start)/2;
        while(start<=end){
            int square = mid*mid;
            if(square==n){
                return mid;
            }else if(square<n){
                ans = mid;
                start = mid+1;
            }else{
                end = mid-1;
            }
            mid = start+(end-start)/2;
        }
        return ans;
    }
     public static int intSqrt(int x){
         return binarySearch(x);
     }

     public static void main(String[] args) {
         int x = 19;
         int a = 12;
         System.out.println(intSqrt(x));
         System.out.println(intSqrt(a));
     }
}
