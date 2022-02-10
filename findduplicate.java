public class findduplicate {
    
    public static int findDuplicate(int[] arr){
        int ans = 0;
        for(int i = 0;i<arr.length;i++){
            ans = ans^arr[i];
        }

        for(int i =0;i<arr.length;i++){
            ans = ans^arr[i];
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,5,3,4,5};
        System.out.println(findDuplicate(arr));
        
    }
}
