import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static List<Bacteria> colony = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.next();
        do {
            colony.add(new Bacteria(scanner.nextInt(), text));
            text = scanner.next();
        } while (!text.equalsIgnoreCase("show"));

        for (Bacteria b : colony) {
            b.show();
        }
    }
}