import java.util.Scanner;

public class sum {
    public static int mySum(int a , int b)
        return a*b;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Number 1");
        int a = sc.nextInt();
        System.out.println("Enter Number 2");
        int b = sc.nextInt();
        System.out.println("the sum is "+mySum(a, b));

    }
}
