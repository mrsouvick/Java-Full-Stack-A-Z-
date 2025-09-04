import java.util.*;
public class grade {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Student name:");
        String name=sc.nextLine();
        System.out.print("Enter your marks:");
        double marks=sc.nextDouble();
        if(marks>=80){
            System.out.print("Congratulation..!" + name + "Your grade is A");
        }else if(marks>=60 && marks<80){
             System.out.print("Congratulation..!" + name + "Your grade is B");
        }else if(marks>=40 && marks<60){
             System.out.print("Congratulation..!" + name + "Your grade is C");
        }else{
             System.out.print("Better luck next time..!" + name + "Your grade is D");
        }
    }
}
