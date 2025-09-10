class Person{
    String Name;
    int Age;
    
    void input(String n, int a){
        Name=n;
        Age=a;
    }
    void output(){
        System.out.println("Name: "+ Name);
        System.out.println("Age: " + Age);

    }
}
public class main {
   public static void main(String args[]){
    Person person1=new Person();
    person1.input("Souvick", 20);
    person1.output();
   }

}
