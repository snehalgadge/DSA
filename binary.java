public class binary {
    public static int binarySearch(int[] arr,int key){
        int lb = 0;
        int ub = (arr.length)-1;
        int mid=lb+(ub-lb)/2;
        while(lb<=ub){
            if(arr[mid]==key){
             return mid;
                }
           if(key>arr[mid]){
             lb = mid+1;
         }
             else{
            ub = mid-1;
        }
       mid = lb+(ub-lb)/2;
}
    return -1;
}
    
    public static void main(String[] args){
        int[] arr ={12,23,31,41,51,61};
        int[] brr ={11,32,34,54,65};
       System.out.println("Element present at "+binarySearch(arr,31));
       System.out.println("Element present at "+binarySearch(arr,30));
       System.out.println("Element present at "+binarySearch(brr,34));
    }
    
}
