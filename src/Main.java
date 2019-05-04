public class Main {
    public static void main(String[] args) {
        Order order = new Order(new Created());

        order.showState();
        order.nextState();
        order.showState();
        order.nextState();
        order.showState();
        order.nextState();
    }
}
