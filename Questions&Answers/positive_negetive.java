import java.util.*;

// check the number is possitive or negative
public class positive_negetive {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        int number=sc.nextInt();
        if(number>0){
            System.out.println("The number is possitive");
        }else if(number<0){
            System.out.println("The number is negative");
        }else{
            System.out.print("Given number is 0");
        }
    }
}
