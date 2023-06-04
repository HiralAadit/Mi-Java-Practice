package execeptiondemo;

import java.util.Scanner;
public class CheckedExceptionExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first value");
        int a = scanner.nextInt();
        System.out.println("Enter first value");
        int b = scanner.nextInt();
        scanner.close();
        try {
            int ans = a / b;
            System.out.println("Answer : " + ans);
        }catch (ArithmeticException e){
                   // String message =e.getmessage();
            //System.out.println(message);
            System.out.println("Epectetion happend here");
            e.printStackTrace();
            //System.out.println("catch block");
        }finally { // finally will be used if exception happened or not happened
            System.out.println("All good");
        }

    }
}
