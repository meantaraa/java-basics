import java.util.Scanner;

public class ArraysandStrings {

    public static void main(String[] args){

    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the size of the array: ");
    int n = sc.nextInt();
    int[] a = new int[n];

    System.out.print("Enter the elements of the array: ");
    for(int i = 0; i < n; i++){
        a[i] = sc.nextInt();
    }

    System.out.println("The elements of the array are: ");
    for(int num: a){
        System.out.println(num);
    }

    String greeting = "Hello World";
    System.out.println(greeting.toUpperCase());
    
 }
}

