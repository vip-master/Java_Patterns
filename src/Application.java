public class Application {
    public static void main(String[] args) {
        Model model = Model.getInstance();

        model.addNewRec(13, 2, 2021, "sergsergefdger");
        model.addNewRec(25, 3, 2022, "rthertgwrt");
        model.addNewRec(29, 5, 2023, "sergsergerthyertwregfdger");
        model.addNewRec(9, 12, 2024, "etujyrdtgsert44");

        change(2, 1, 1, 1979, "yyyyyyyyy");
        change(1, 10, 8, 2100, "piuytfvbnjuytgh");
    }

    private static void change(int index, int day, int month, int year, String recipe) {
        Model model = Model.getInstance();
        System.out.println("Previous state:");
        model.showRec(index);
        model.addRec(index, day, month, year, recipe);
        System.out.println("Next state:");
        model.showRec(index);
    }
}
