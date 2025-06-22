package day10AbstarctandInterface;

import java.util.Scanner;

public class  ExceptionDemo {  // ✅ Class name should not be 'Execption' and should follow proper naming convention.

    void eligible() {  // ✅ Fixed spelling of method name 'eligible'
        try {
            Scanner scan = new Scanner(System.in);
            System.out.print("Enter your age: ");
            int age = scan.nextInt();
            
            if (age >= 18) {
                System.out.println("Eligible");
            } else {
                throw new Exception("You are not eligible");
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());  // ✅ Prefer printing e.getMessage() instead of entire exception
        }
    }

    public static void main(String[] args) {
        ExceptionDemo obj = new ExceptionDemo();  // ✅ Updated class name
        obj.eligible();
    }
}
