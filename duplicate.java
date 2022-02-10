public class duplicate{

    public static int findDuplicate(int[] arr){
        int ans = 0;
        for(int i = 0;i<arr.length;i++){
            ans = ans^arr[i];
        }

        for(int i=1;i<arr.length;i++){
            ans = ans^i;
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {7,8,5,3,4,5};
        System.out.println(findDuplicate(arr));
    }
}