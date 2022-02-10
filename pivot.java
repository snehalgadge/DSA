public class pivot {

    public static int findPivot(int[] arr){
        int start = 0;
        int end = (arr.length)-1;
        int mid = start +(end -start)/2;
        while(start<end){
            if(arr[mid]>=arr[0]){
                start = mid+1;
            }else{
                end = mid;
            }
            mid = start+(end -start)/2;
        }
        return arr[end];
    }

    public static void main(String[] args) {
        int[] arr = {8,9,10,17,0,1,3};
        int[] brr = {3,8,10,17,1};
        System.out.println("the pivot is:"+findPivot(arr));
        System.out.println("the pivot is:"+findPivot(brr));
    }

}
    