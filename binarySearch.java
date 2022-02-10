public class binarySearch {

   public static void binarySearch(int a[],int lb, int ub, int value){
        int mid;
        while(lb<ub){
           if(value==a[mid]){
               return mid;
           }else if(value<a[mid]) {
               ub = mid-1;
           }else{
               lb = mid+1;
           }
           return -1;
        }
    }
    public static void main(String[] args) {
        int a[] = new int[2];
        a[0] = 12;
        a[1] = 13;
        binarySearch(a,0,n-1, 87);
    }

}
