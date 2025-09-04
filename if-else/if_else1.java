
import java.util.*;
public class if_else1 {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int orginalpass=12345;
        System.out.print("Enter your password:");
        int password=sc.nextInt();
        if(orginalpass==password){
         System.out.println("Hello user..!");
         System.out.println("WellCome back!");
        }else{
            System.out.println("Sorry..! You've enterd wrong password. ");
        }

    }
}
