class Created extends State {
    @Override
    void showStatus() {
        System.out.println("Created");
    }

    @Override
    void nextStatus() {
        State state = new Active();
        order.changeState(state);
    }
}

class Active extends State {
    @Override
    void showStatus() {
        System.out.println("Activated");
    }

    @Override
    void nextStatus() {
        State state = new Accepted();
        order.changeState(state);
    }
}

class Accepted extends State {

    @Override
    void showStatus() {
        System.out.println("Accepted");
    }

    @Override
    void nextStatus() {
        throw new IllegalStateException("last status");
    }
}