import java.util.Scanner;

class hello{
    public static void main(String as[]){
        // System.out.print("@\n@@\n@@@\n@@@@\n@@@@@");
         Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // System.out.println("a = " +a+  "\nb = " +b);
        // int sum = a+b;
        // System.out.println("sum = " +sum);

        // System.out.println("Enter Your Age");
        // int age = sc.nextInt();
        
        // if(age>18)
        // {
        //     System.out.println("adult");
        // }else{
        //     System.out.println("not adult");
        // }
        
         //odd even
         /*
        System.out.println("Enter number");
        int num = sc.nextInt();
        
        if(num%2==0){
            System.out.println("Even number");
        }else{
            System.out.println("Odd number");
        }*/

        //nested if/else
         /*
        System.out.println("Enter value of a");
        int a = sc.nextInt();
        System.out.println("Enter value of b");
        int b = sc.nextInt();
        if(a == b){
            System.out.println("Both values are equal");
        }else if(a > b){
            System.out.println("a is greater ");
        }else{
            System.out.println("b is greater");
        }*/

        //switch
        /*
        System.out.println("\nEnter your choice \n1.English\n2.Hindi\n3.Spanish");
        int a = sc.nextInt();
        switch(a){
            case 1 :
            System.out.println("Hello");
            break;
            case 2:
            System.out.println("Namaste");
            break;
            case 3:
            System.out.println("Hola");
            break;
            default:System.out.println("Please enter a valid choice" );
        }*/

        System.out.println("\nEnter your choice \n1.English\n2.Hindi\n3.Spanish");
        int choice = sc.nextInt();
        if(choice == 1){
            System.out.println("hello");
        }else if(choice == 2){
            System.out.println("Namste");
        }else{
            System.out.println("Hola");
        }
        

    }
}