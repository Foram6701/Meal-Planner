import java.util.*;

public class Meal {
    private String name;
    private String type; // breakfast, lunch, dinner
    private List<String> ingredients;

    public Meal(String name, String type, List<String> ingredients) {
        this.name = name;
        this.type = type;
        this.ingredients = new ArrayList<>(ingredients);
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    @Override
    public String toString() {
        return name + " (" + type + ")";
    }
}