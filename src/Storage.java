import java.util.ArrayDeque;
import java.util.Deque;

class Storage {
    private Field originator;
    private Deque<Field.Memento> history;

    Storage(Field origin) {
        originator = origin;
        history = new ArrayDeque<>();
        saveAct();
    }

    void saveAct() {
        history.push(originator.save());
    }

    void undo() throws IllegalAccessException {
        history.remove();
        if (history.size() == 0) throw new IllegalAccessException("No changes");
        originator.restore(history.remove());
    }

}
