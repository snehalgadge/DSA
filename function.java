import java.util.Scanner;

public class function {
    public static void name(String myName){
        System.out.print("Hello  " +myName);
        System.out.println(myName);
        return;
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Yor Name");
        String myName = sc.next();
        name(myName);

    }

}
