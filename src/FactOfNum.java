/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

/**
 *
 * @author homeswararaokawarthapu
 */
public class FactOfNum {
    public static void main(String[] args) {
        int fac;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter Number to find the factorial");
            fac = sc.nextInt();
        }
        int res =1;
        for(int i =res;i<=fac;i++)
        {
            res = res*i;

        }
         System.out.println("Factorial of "+fac+" is "+res); 


        
    }
}
