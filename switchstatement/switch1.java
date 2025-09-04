import java.util.*;
public class switch1 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter an alphabate:");
        char value=sc.next().charAt(0);

        switch(value){
            case 'a':
            System.out.println("You enterd vowel");
            break;
            case 'e':
            System.out.println("Vowel");
            break;
            case 'i':
            System.out.println("Vowel");
            break;
            case 'o':
            System.out.println("Vowel");
            break;
            case 'u':
            System.out.println("Vowel");
             break;
            default:
            System.out.println("You've enterd consonent!");
        }

    }
}
