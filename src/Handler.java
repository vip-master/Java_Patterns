abstract class Handler {
    Handler next;

    Handler() {
    }

    Handler(Handler next) {
        this.next = next;
    }

    void setNext(Handler next) {
        this.next = next;
    }

    abstract void handle(int money);
}
