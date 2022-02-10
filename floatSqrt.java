public class floatSqrt {
    public static int intSqrt(int n){
        int start =0;
        int end = n;
        int ans = -1;
        int mid = start+(end-start)/2;
        while(start<=end){
            int square = mid*mid;
            if(square==n){
                ans = mid;        
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
 
    public static float floatSqrt(int n ,int precision,int tempSol) {
        int factor =1;
        int ans = tempSol;

        for(int i=0;i<precision;i++){
            factor = factor/10;

            for(float j=ans; j*j<=n; j=j+factor){
                ans = j;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int n = 107;
        int precision =3;
        int tempSol= intSqrt(n);
        // System.out.println("the sqrt of "+n+" is "+floatSqrt(n, precision, tempSol));

        System.out.println(tempSol);
    }

}
