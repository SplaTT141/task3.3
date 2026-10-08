package lt.vcd;

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner in = new Scanner(System.in);

        System.out.print("Iveskite skaiciu nuo 0 iki 12: ");
        int num = in.nextInt();
        int factorial = 1;

        for (int i = 1; i <= num; i++) {
            factorial *= i ;
        }

        System.out.print(factorial);
    }
}
