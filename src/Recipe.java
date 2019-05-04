class Recipe {
    private final int day;
    private final int month;
    private final int year;

    private final String recipe;

    Recipe(int day, int month, int year, String recipe) {
        this.day = day;
        this.month = month;
        this.year = year;
        this.recipe = recipe;
    }

    int getDay() {
        return day;
    }

    int getMonth() {
        return month;
    }

    int getYear() {
        return year;
    }

    String getRecipe() {
        return recipe;
    }
}
