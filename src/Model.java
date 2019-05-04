import java.util.ArrayList;
import java.util.List;

class Model {
    private static final Model instance = new Model();

    private List<Recipe> list = new ArrayList<>();

    private Model() {
    }

    static Model getInstance() {
        return instance;
    }

    void addNewRec(int day, int month, int year, String recipe) {
        list.add(new Recipe(day, month, year, recipe));
    }

    void addRec(int index, int day, int month, int year, String recipe) {
        list.add(index, new Recipe(day, month, year, recipe));
    }

    void delRec(int index) {
        list.remove(index);
    }

    void showRec(int index) {
        Recipe recipe = list.get(index);
        System.out.printf("Recipe: %s ; Expires: %d.%d.%d\n",
                recipe.getRecipe(), recipe.getDay(), recipe.getMonth(), recipe.getYear());
    }
}
