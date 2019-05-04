abstract class State {
    Order order;

    void setOrder(Order o) {
        order = o;
    }

    abstract void showStatus();

    abstract void nextStatus();
}
