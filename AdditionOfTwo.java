import java.util.Scanner;

public class AdditionOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the print Number");
        int a = sc.nextInt();
        System.out.println("Enter the print Number");

        int b = sc.nextInt();
        int sum = a+b;
        System.out.println("Sum of two numbers is: "+sum);
    }
}
