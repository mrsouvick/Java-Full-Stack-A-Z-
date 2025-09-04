// find thye sum of odd numbers in 20 by using while loop
public class oddsum {
    public static void main(String args[]){
        int sum=0;
        int i=1;
        while(i<=20){
            sum=sum+i;
            i=i+2;
        }
        System.out.println("The sum of odd number is= "+sum);

    }
}
