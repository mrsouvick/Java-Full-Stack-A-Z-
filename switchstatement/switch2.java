import java.util.*;
public class switch2 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int fees=0;
        System.out.println("Enter vechile tye(Car/cycle/bike):");
        String name=sc.nextLine();
        switch(name){
            case "cycle":
            fees=10;
            break;
            case "bike":
            fees=20;
            break;
            case "car":
            fees=30;
            break;
            default:
            System.out.println("Choose from the list!");
        }
        System.out.println("Your parking fees for "+name +" is: "+fees);
    }
}
