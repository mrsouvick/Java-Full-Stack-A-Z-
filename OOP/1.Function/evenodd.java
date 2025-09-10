import java.util.*;
public class evenodd {

    public static boolean ifEven(int a){
        if(a%2==0){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your number: ");
        int a=sc.nextInt();
        System.out.println("The number is EVEN:" + ifEven(a));
 
    }
}
