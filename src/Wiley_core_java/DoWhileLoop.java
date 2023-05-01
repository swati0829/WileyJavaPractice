package Wiley_core_java;
import java.util.Scanner;

class DoWhileLoop {
    public static void main(String... args) {
        Scanner obj = new Scanner(System.in);

        int val;
        do{
            System.out.println("Enter a number between 1 to 10 :");
            val = obj.nextInt();
        }while(val < 1 || val > 10);

        System.out.println("The number entered by you is : " + val);
    }
}