class Elf extends Creature {
    void move() {
        System.out.println("I'm Elf");
        m = new Walking();
        super.move();
    }
}

class Gnome extends Creature {
    void move() {
        System.out.println("I'm Gnome");
        m = new Walking();
        super.move();
    }
}

class Pegasus extends Creature {
    void move() {
        System.out.println("I'm Pegasus");
        m = new WalkFly();
        super.move();
    }
}

class Dragon extends Creature {
    void move() {
        System.out.println("I'm Dragon");
        m = new WalkFly();
        super.move();
    }
}

class Eagle extends Creature {
    void move() {
        System.out.println("I'm Eagle");
        m = new Flying();
        super.move();
    }
}
