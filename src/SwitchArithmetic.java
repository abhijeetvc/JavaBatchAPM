import java.util.Scanner;

public class SwitchArithmetic {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value1: ");
        int value1=sc.nextInt();

        System.out.println("Enter value2: ");
        int value2=sc.nextInt();

        System.out.println("Enter choice: ");
        int choice=sc.nextInt();

        int result=0;

        switch(choice){
            case 1:
                result=value1+value2;
                System.out.println("Addition result: "+result);
                break;

            case 2:
                result=value1-value2;
                System.out.println("Subtraction result: "+result);
                break;

            case 3:
                result=value1*value2;
                System.out.println("Multiplication result: "+result);
                break;

            case 4:
                result=value1/value2;
                System.out.println("Division result: "+result);
                break;

            default:
                System.out.println("Incorrect choice...");
                break;
        }
    }
}
