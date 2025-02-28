import java.util.*;

public class UserInputOutput{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your age: ");
        int age = sc.nextInt();

        sc.nextLine();

        System.out.println("enter your name: ");
        String name = sc.nextLine();

        System.out.println("Your name is " + name + " and you are " + age + " years old.");

        sc.close();
    }
}