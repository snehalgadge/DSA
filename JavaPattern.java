public class JavaPattern {
    public static void main(String[] args) {
        // for(int i = 0; i<=3; i++){
            // for(int j = 0 ; j<=i ; j++){
                // System.out.println(" * * * * ");
            // }
            // System.out.println("");
        // } 
        //   int n = 4;
        //   int m = 5;
        //   for(int i = 1 ; i <= n; i++){
        //       for(int j = 1; j<= m; j++){
        //           if(i == 1|| j==1 || i == n|| j == m){
        //               System.out.print(" * ");
        //           }else{
        //               System.out.print("   ");
        //           }
        //         }
        //         System.out.println(" ");
        //   } 
        
        // for(int i = 3; i>=0; i--){
        //     for(int j = i; j>= 0 ; j--){
        //         System.out.print(" *  ");
        //     }
        //     System.out.println("");
        // } 

        // int n= 4;
        // for(int i= 1; i<=n;i++){
        //     for(int j = 1 ; j <=n-i ; j++){
        //         System.out.print("   ");
        //     }
        //     for(int j = 1; j<=i ; j++){
        //         System.out.print(" * ");
        //     }
        //     System.out.println("");
        // }


        // for(int i = 1 ; i<=5 ; i++){
        //     for(int j = 1; j<=i; j++){
        //         System.out.print(j+" ");
        //     }
        //     System.out.println();
        // }

        for(int i = 1; i<=5 ; i++){
            for(int j =1 ; j<=5-i+1 ; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }

        // int n = 5;
        // int number = 1;
        // for(int i=1; i<=n; i++){
        //     for(int j =1; j<=i; j++ ){
        //         System.out.print(number+" ");
        //         number++;
        //     }
        //     System.out.println();

        // }
        // for(int i=1; i <=5 ; i++){
        //     for(int j=1 ; j<= 5; j++ ){
        //         System.out.print(" * ");
        //     } 
        //     System.out.println();
        // }


        // for(int i = 1; i<=5; i++){
        //     for(int j = 1; j<=i; j++){
        //         int sum = i+j;
        //         if(sum%2==0){
        //             System.out.print(1+" ");
        //         }else{
        //             System.out.print(0+" ");
        //         }
        //     }
        //     System.out.println();
        // }
    }
}
