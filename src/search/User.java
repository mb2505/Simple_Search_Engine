package search;

import java.util.Scanner;

public class User {
    final static Scanner scanner = new Scanner(System.in);
    final static Data data = new Data();

    public static void start(String input) {
        data.readFile(input);
        menu();
    }

    public static void menu() {
        System.out.println("\n=== Menu ===\n" +
                "1. Find a person\n" +
                "2. Print all people\n" +
                "0. Exit\n");

        String select = scanner.nextLine();
        switch (select) {
            case "1":
                selectStrategy();
                scanner.nextLine();
                System.out.println("\nEnter a name or email to search all suitable records.");
                data.search(scanner.nextLine().toLowerCase());
                menu();
                break;
            case "2":
                data.print();
                menu();
                break;
            case "0":
                System.out.println("Bye!");
                System.exit(0);
            default:
                System.out.println("Incorrect option! Try again.");
                menu();
                break;
        }
    }

    public static void selectStrategy() {
        System.out.println("\nSelect a matching strategy: ALL, ANY, NONE");
        String strategy = scanner.next();

        if (strategy.equalsIgnoreCase("All")) {
            System.out.println("Selected strategy : ALL");
            data.setStrategy(Strategy.ALL);
        } else if (strategy.equalsIgnoreCase("ANY")) {
            System.out.println("Selected strategy : ANY");
            data.setStrategy(Strategy.ANY);
        } else if ((strategy.equalsIgnoreCase("NONE"))){
            System.out.println("Selected strategy : NONE");
            data.setStrategy(Strategy.NONE);
        } else {
            selectStrategy();
        }
    }
}
