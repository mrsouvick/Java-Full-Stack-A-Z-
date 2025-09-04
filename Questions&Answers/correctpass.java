import java.util.*;
public class correctpass {
    public static void main(String args[]){
        String originalPassword="admin123";
        Scanner sc=new Scanner(System.in);
        String userPassword;

        do { 
            System.out.println("Enter your password:");
            userPassword=sc.nextLine();
            if(originalPassword.equals(userPassword)){
                System.out.println("Correct Password");
                break;
            }else{
                System.out.println("Wrong Password");
            }
            
        } while (true);
    }
}
