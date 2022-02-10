import java.util.Scanner;

public class product {
    public static int por(int a, int b){
        return a * b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int a = sc.nextInt();
        System.out.println("Enter @");
        int b = sc.nextInt();
        System.out.println("The Product is:" + por(a, b));
    }
}
