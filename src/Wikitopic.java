public class Wikitopic implements Article {
    private String smt;

    Wikitopic(String source) {
        smt = source;
    }

    private Wikitopic(Wikitopic copy) {
        smt = copy.smt;
    }

    void setTopic(String input) {
        smt = input;
    }

    String getTopic() {
        return smt;
    }

    @Override
    public Article clone() {
        return new Wikitopic(this);
    }

    @Override
    public String getContent() {
        return smt;
    }

    @Override
    public void setContent(String source) {
        smt = source;
    }
}
