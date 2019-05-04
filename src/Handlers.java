class ShowAmount extends Handler {
    ShowAmount(Handler next) {
        super(next);
    }

    @Override
    void handle(int money) {
        System.out.printf("You want to remit %d dollars\n", money);
        next.handle(money);
    }
}

class GiveBank extends Handler {
    GiveBank(Handler next) {
        super(next);
    }

    @Override
    void handle(int money) {
        money *= 0.9;
        System.out.printf("You pay for bank 10%% keeps %d dollars\n", money);
        next.handle(money);
    }
}

class GiveGov extends Handler {
    GiveGov(Handler next) {
        super(next);
    }

    @Override
    void handle(int money) {
        money *= 0.8;
        System.out.printf("You pay tax for government 20%% keeps %d dollars\n", money);
        next.handle(money);
    }
}

class ShowEnd extends Handler {

    @Override
    void handle(int money) {
        System.out.println("!!! CONGRATULATION !!!");
        System.out.printf("You remitted %d dollars\n", money);
    }
}