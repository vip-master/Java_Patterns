import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Handler simpleTransaction = new ShowAmount(new GiveBank(new GiveGov(new ShowEnd())));
        Handler govTransaction = new ShowAmount(new GiveBank(new ShowEnd()));
        Handler bankTransaction = new ShowAmount(new ShowEnd());

        int money = (new Scanner(System.in)).nextInt();
        simpleTransaction.handle(money);
        System.out.println();
        govTransaction.handle(money);
        System.out.println();
        bankTransaction.handle(money);

    }
}
