import java.util.ArrayList;
import java.util.List;

class Bacteria {
    private static int index = 0;
    private BacteriaType type;

    Bacteria(int index, String nameType) {
        Bacteria.index = index;
        type = BacteriaFactory.getType(nameType);
    }

    void show() {
        System.out.printf("My index is %d", index);
        type.show();
    }
}

class BacteriaFactory {
    private static List<BacteriaType> cache = new ArrayList<>();

    static BacteriaType getType(String name) {
        for (BacteriaType type : cache) if (type.getName().equals(name)) return type;
        BacteriaType type = new BacteriaType(name);
        cache.add(type);
        return type;
    }
}

class BacteriaType {
    private String name;

    BacteriaType(String name) {
        this.name = name;
    }

    void show() {
        System.out.printf(" my type %s\n", name);
    }

    String getName() {
        return name;
    }
}
