package work_2;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Main {
    static boolean symbol = true;

    private static boolean isInteger(float number) {
        int res = (int) number;

        return res == number;
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

    public static long NOD(long a, long b){
        long t;

        while(b != 0) {
            t = b;
            b = a % b;
            a = t;
        }

        return a;
    }


    public static void main(String[] args) {
        int first_number = 0, second_number = 0;

        System.out.print("Введите первое число : ");
        do { first_number = Secur_Enter(); } while (!symbol);


        System.out.print("Введите второе число : ");
        do { second_number = Secur_Enter(); } while (!symbol);


        System.out.println("НОД(" + first_number + "," + second_number + ") = " + NOD(first_number,second_number));
        System.out.println("НОК(" + first_number + "," + second_number + ") = " + (first_number * second_number) / NOD(first_number,second_number));
    }
}
