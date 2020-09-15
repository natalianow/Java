package NewRepo;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String name;
        System.out.println("Podaj swoje imię: ");
        name = scanner.nextLine();
        System.out.println("Hello " + name);
    }
}
