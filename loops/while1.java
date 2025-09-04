import java.util.*;

public class while1 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int i=1;
    
        System.out.println("Enter value:");
        int value=sc.nextInt();
        while(i<=10){
            System.out.println(value +"x"+i+"="+value*i);
            i++;
        }
    }
}
