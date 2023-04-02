import java.util.Scanner;

public class Operators {
    public static void main(String[] args) {
        //ternary operators
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Number what do you want");
        System.out.println("1 for addition,2 for subtraction,3 for multiplication,4 for division");
        int x= sc.nextInt();
        System.out.println("Enter your first number ");
        int a=sc.nextInt();
        System.out.println("Enter your 2 nd number");
        int b= sc.nextInt();
        switch (x){
            case 1:
                int add=a+b;
                System.out.println(add);
            break;
            case 2:
                int sub=a-b;
                System.out.println(sub);
                break;
            case 3:int mul=a*b;
                System.out.println(mul);
                break;
            case 4:int div=a/b;
                System.out.println(div);
                break;
            default:
                System.out.println("enter a valid number");



        }

    }

}
