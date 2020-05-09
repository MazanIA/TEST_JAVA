package work_1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    static boolean symbol = true;

    private static boolean Number_Divide(int number) {
        for (int i = 2; i <= Math.round(Math.sqrt(number)); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    private static int Secur_Enter()
    {
        Scanner in = new Scanner(System.in);
        float n = 0;
        try {
            do {
                n = in.nextFloat();
                if (!isInteger(n)) {
                    System.out.println("Неверный тип данных !");
                    System.out.print("Введите целое число : ");
                }
                symbol = true;
            } while (!isInteger(n));
        } catch (InputMismatchException e) {
            System.out.println("Неверный тип данных !");
            System.out.print("Введите целое число : ");
            symbol = false;
            return 0;
        }
        return (int) n;
    }

    private static boolean isInteger(float number) {
        int res = (int) number;
        return res == number;
    }

    public static void main(String[] args) {
        System.out.println("-----------Программа определения свойств числа------------ ");


        System.out.print("Введите целое число : ");

        int int_number = 0;
        do {
            int_number = Secur_Enter();
        } while (!symbol);



        if (int_number % 2 == 0)
            System.out.print("Число -" + int_number + "- четное ");
        else
            System.out.print("Число -" + int_number + "- нечетное ");

        if (Number_Divide(int_number))
            System.out.println("и простое.");
        else
            System.out.println("и составное.");

    }
}

