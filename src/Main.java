import java.util.ArrayList;

public class Main {
    final static int index = 1;

    public static void main(String[] args) {
        ArrayList<Article> wiki = new ArrayList<>();

        wiki.add(new Wikitopic("Some very interesting text."));
        wiki.add(new Wikitopic("Some not very interesting text. "));

        Article topic = wiki.get(index).clone();
        System.out.println(topic.getContent());
        topic.setContent("AAAAAAAAAAAAAAAAAAAAAAAAAAA");
        System.out.println(topic.getContent());
        System.out.println(wiki.get(index).clone().getContent());

    }
}
