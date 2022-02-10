public class peakIndex {
    public static int prakIndex(int[] arr){
        int start = 0;
        int end = (arr.length)-1;
        int mid = start+(end -start)/2;
        while(start<end){
            if(arr[mid]<arr[mid+1]){
                start = mid+1;
            }else{
                end = mid ;
            }
            mid = start +(end - start)/2;
        }
        System.out.println("The mounted elemenys is: "+arr[mid]);
        return end;
        
    }
    public static void main(String[] args) {
        int[] arr = {1,2,6,8,5,3,0};
        System.out.println("The index of peak element in mOuntain array is : " 
        +prakIndex(arr));
    }
    
}
