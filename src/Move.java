class Walking implements Moving {
    @Override
    public void move() {
        System.out.println("I walk.");
    }
}

class Flying implements Moving {
    @Override
    public void move() {
        System.out.println("I fly.");
    }
}

class WalkFly implements Moving {

    @Override
    public void move() {
        System.out.println("I walk and fly");
    }
}
