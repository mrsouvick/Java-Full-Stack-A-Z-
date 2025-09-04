
import java.util.Scanner;

public class calculator {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first number:");
        int num1=sc.nextInt();
        System.out.print("Enter seccond number:");
        int num2=sc.nextInt();
        System.out.print("Enter the operation(+,-,*,/):");
        char op=sc.next().charAt(0);
        if(op=='+'){
            int sum=num1+num2;
            System.out.println(num1 + "+" + num2 + "=" + sum);
        }else if(op=='-'){
            int sub=num1-num2;
           System.out.println(num1 + "-" + num2 + "=" + sub);
        }else if(op=='*'){
            int multi=num1*num2;
            System.out.println(num1 + "*" + num2 + "=" + multi);
        }else if(op=='/'){
            int div=num1/num2;
           System.out.println(num1 + "/" + num2 + "=" + div);
        }else{
            System.out.println("Enter valid operatio please!");
        }
    }
}
