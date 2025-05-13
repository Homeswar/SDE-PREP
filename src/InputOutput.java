
import java.util.Scanner;

public class InputOutput {

    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Name");
        String name = sc.next();
        System.out.println("Enter your Age");
        int age = sc.nextInt();
        sc.close();
        System.out.println("Your Name is - " + name);
        System.out.println("Your Age - " + age);

    }

}
