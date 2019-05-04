import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Field game = new Field();
        Scanner scanner = new Scanner(System.in);
        Storage storage = new Storage(game);

        for (int i = 0; i < 9; i++) {
            String step = scanner.next();
            switch (step) {
                case "step":
                    try {
                        game.setSign(scanner.nextInt());
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                        i--;
                    }
                    storage.saveAct();
                    break;
                case "undo":
                    i--;
                    try {
                        storage.undo();
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    }
                    game.show();
                    break;
                case "END":
                    System.out.println("The End!");
                    System.exit(0);
                default:
                    i--;
                    System.out.println("it's not command");
            }
        }
        System.out.println("This End");
    }
}
