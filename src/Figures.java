class SimpleFigure extends Figure {

    SimpleFigure(int index) {
        super(index);
    }

    @Override
    void show() {
        System.out.println("I'm Figure." + index);
    }
}

class SuperFigure extends Figure {

    SuperFigure(int index) {
        super(index);
    }

    @Override
    void show() {
        System.out.println("I'm Superfigure" + index);
    }
}

