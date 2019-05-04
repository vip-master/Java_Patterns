class Subscribers implements Subscriber {
    private static int index;
    private int myindex;

    Subscribers() {
        myindex = ++index;
    }

    @Override
    public void update(Magazine magazine) {
        System.out.println("Subscriber " + myindex);
        magazine.content();
    }
}

