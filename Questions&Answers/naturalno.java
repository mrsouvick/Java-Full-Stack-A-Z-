// print the sum of first n natural numbers
import java.util.*;
public class naturalno {
    public static void main(String args[]){
        int sum=0;
        int i =1;
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the number:");
        int num=sc.nextInt();
        /*for(i=1;i<=num;i++){
            sum=sum+i;
        }*/
        do { 
            sum=sum+i;
            i++;
        } while (i<=num);
        
        System.out.println("Sum:" +sum);


    }
}
