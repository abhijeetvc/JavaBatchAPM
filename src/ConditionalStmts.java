import java.util.Scanner;

public class ConditionalStmts {

    public static void main(String[] args) {

       // int marks=49;

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter marks: ");
        int marks=sc.nextInt();

        if(marks>=80) {
            System.out.println("Grade A");
            System.out.println("Inside if block");
        }else if(marks>=70){
            System.out.println("Grade B");
        }else if(marks>50){
            System.out.println("Grade C");
        }else{
            System.out.println("Grade D");
        }
        System.out.println("Other code");

    }
}
