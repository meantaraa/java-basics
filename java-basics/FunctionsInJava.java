import java.util.Scanner;

public class Functions {
    public static int addition(int a, int b){
        return a + b;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        int result = addition(num1, num2);
        
        System.out.println("The result of addition is: " + result);

        scanner.close();
    }
}

