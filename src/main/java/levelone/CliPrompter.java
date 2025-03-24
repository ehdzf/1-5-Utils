package levelone;

import java.util.Scanner;

public class CliPrompter {
    private static final Scanner scanner = new Scanner(System.in);

    public static String prompt(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine();
    }
}
