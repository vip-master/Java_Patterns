class Field {
    private int[] cell = {0, 0, 0, 0, 0, 0, 0, 0, 0};
    private boolean sign = false;

    class Memento {
        private int[] state;
        private boolean signState;

        Memento(int[] array, boolean sign) {
            if (array.length != 9) throw new IllegalArgumentException("Illegal state");
            state = new int[9];
            System.arraycopy(array, 0, state, 0, 9);
            signState = sign;
        }

        void getState() {
            System.arraycopy(state, 0, cell, 0, 9);
            sign = signState;
        }
    }

    Memento save() {
        return new Memento(cell, sign);
    }

    void restore(Memento memento) {
        memento.getState();
    }

    void show() {
        for (int i = 0; i < 3; i++) {
            for (int j = i * 3; j < 3 + i * 3; j++) {
                char c = '0';
                switch (cell[j]) {
                    case 0:
                        c = '#';
                        break;
                    case 1:
                        c = 'X';
                        break;
                    case 2:
                        c = 'O';
                }
                System.out.printf("%c ", c);
            }
            System.out.println();
        }
    }

    void setSign(int index) {
        if (index < 0 || index >= 9) throw new IllegalArgumentException("No such cell");

        if (cell[index] != 0) {
            show();
            return;
        }

        if (sign) cell[index] = 2;
        else cell[index] = 1;

        sign = !sign;
        show();
    }
}
