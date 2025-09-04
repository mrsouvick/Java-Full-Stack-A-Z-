//even odd checking
import java.util.*;
public class even_odd{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        int number=sc.nextInt();
        
        if(number%2==0){
            System.out.println("The given number is EVEN");
        }else{
            System.out.println("The number is ODD");
        }
    }
}