import java.util.*;
public class calculatorusingmethods {

    static int sum (int a, int b){
        int sum=a+b;
        return sum;
    }
    static int sub(int a, int b){
        int div=a-b;
        return div;
    }
    static int multi(int a, int b){
        int multi=a*b;
        return multi;
    }
    static int div(int a, int b){
        int div=a/b;
        return div;
    }
    public static void main(String agrs[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("WellCome Dear User!");
        System.out.print("Enter your first number:");
        int a=sc.nextInt();
        System.out.print("Enter your second number: ");
        int b=sc.nextInt();
        System.out.print("Enter your operation[EG:+,-,/,*]: ");
        char operator=sc.next().charAt(0);

        if(operator=='+'){
            System.out.println("The sum of two number is: " + sum(a,b));
        }else if(operator=='-'){
            System.out.println("The sub of two number is: " + sub(a,b));
        }else if(operator=='*'){
            System.out.println("The multi of two number is: " + multi(a,b));
        }else if(operator=='/'){
            System.out.println("The div of two number is: " + div(a,b));
        }else{
            System.out.println("Enter valid operator");
        }
    }
}
