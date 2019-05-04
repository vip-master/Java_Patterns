class Order {
    private State state;

    Order(State s) {
        state = s;
        state.setOrder(this);
    }

    void changeState(State s) {
        state = s;
        state.setOrder(this);
    }

    void showState() {
        state.showStatus();
    }

    void nextState() {
        state.nextStatus();
    }
}
