// swap two numbers without temp variable

public class swap2number {
    public static void main(String args[]){
        int num1=5;
        int num2=6;

        System.out.println("Before swapping the value of num1="+num1);
        System.out.println("Before swapping the value of num2="+num2);
 
        num1=num1+num2; // 5+6=11 
        num2=num1-num2;//11-6=5
        num1=num1-num2;
        System.out.println("After swapping the value of num1 is:" +num1);
        System.out.println("After swapping the value of num2 is:" +num2);

    }
}
