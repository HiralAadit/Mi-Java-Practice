package methodpractice;

//i  want to enter three variable using scanner class
//one integer one double and one string//

import java.util.Scanner;

public class Pratik1 {
    public static void main(String[] args) {
        int a;
        double b;
        String c;

        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter String");
        c = scanner.nextLine();
        System.out.println(" Enter Integer ");
        a = scanner.nextInt();
        System.out.println("Enter double");
        b = scanner.nextDouble();

        System.out.println("Integer:" + a);
        System.out.println("Double : " + b);
        System.out.println("String : " + c);
        scanner.close();

    }
}
