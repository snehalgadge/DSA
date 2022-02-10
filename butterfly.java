import java.util.*;

public class butterfly {
    public static void main(String[] args) {
        int n = 5;

        // first half
        for(int i = 1 ; i<=n ; i++){
            // for(int j = 1; j<=i ; j++){
            //     System.out.print("*");
            // }
            for(int j = 1 ; j<=i ; j++){
                if(i==1 || j==1 || i==j || j==i){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
                for(int j = 1; j<= (n-i); j++){
                    System.out.print(" ");
                }
                System.out.println();
            }
        }

        // second half
        
        for(int i =n ;i>=1 ; i--){
            for(int j=i ; j>= 1 ; j--){
                System.out.print("*");
            }
            for(int j=2*(n-i) ; j>=1 ; j--){
                System.out.print(" ");
            }
            for(int j = 1 ;j<=i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
