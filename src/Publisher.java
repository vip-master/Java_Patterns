import java.util.ArrayList;

class Publisher {
    private ArrayList<Subscriber> subscribers = new ArrayList<>();

    void subscribe(Subscriber sub) {
        subscribers.add(sub);
    }

    void unsubscribe(Subscriber sub) {
        if (sub == null) throw new IllegalArgumentException("Error unsubscribe");

        if (subscribers.remove(sub)) return;
        throw new IllegalArgumentException("Subscriber absent");
    }

    void newMagaz(Magazine m) {
        for (Subscriber s :
                subscribers) {
            s.update(m);
        }
    }
}
