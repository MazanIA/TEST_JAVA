package work_4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String word = scanner.nextLine();
        String[] words = text.split(" ");
        int counter = 0;
        word = word.trim();
        for (String s : words) {
            if (s.equalsIgnoreCase(word)) {
                counter++;
            }
        }

        System.out.println(counter);
    }
}

