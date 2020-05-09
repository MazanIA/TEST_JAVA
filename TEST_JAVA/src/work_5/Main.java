package work_5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        do {
            n = scanner.nextInt();
        } while (n > 100);

        for (int i = 0; i < n; i++) {
            if (isPalindrome(i)) {
                System.out.println(i);
            }
        }
    }

    private static boolean isPalindrome(int number) {
        int rev = 0;
        int sum = number;
        while (number != 0) {
            rev = rev * 10 + number % 10;
            number /= 10;
        }
        return rev == sum;
    }
}
