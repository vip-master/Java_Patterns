public class Main {
    public static void main(String[] args) {
        Publisher pub = new Publisher();
        for (int i = 0; i < 4; i++) pub.subscribe(new Subscribers());

        pub.newMagaz((new Gazeta()).createMagaz("Some interesting"));
        pub.newMagaz((new Gazeta()).createMagaz("Some not interesting"));
    }
}
