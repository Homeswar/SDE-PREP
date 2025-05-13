
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author homeswararaokawarthapu
 */
public class EvenOrOdd {

    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the Number to check EVEN / ODD");
            int num = sc.nextInt();
            if (num % 2 == 0) {
                System.out.println(num + " is EVEN");
            } else {
                System.out.println(num + " is ODD");
            }
        }

    }
}
