import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // All Breakfast Meals
        List<Meal> breakfastMeals = Arrays.asList(
                new Meal("Idli with Sambar and Coconut Chutney", "breakfast", Arrays.asList("Rice", "Urad Dal", "Salt", "Coconut", "Tamarind Paste")),
                new Meal("Masala Dosa", "breakfast", Arrays.asList("Rice", "Urad Dal", "Potatoes", "Spices", "Curry Leaves")),
                new Meal("Upma", "breakfast", Arrays.asList("Semolina", "Vegetables", "Mustard Seeds", "Curry Leaves")),
                new Meal("Poha", "breakfast", Arrays.asList("Poha", "Onions", "Green Chilies", "Curry Leaves")),
                new Meal("Aloo Paratha", "breakfast", Arrays.asList("Wheat Flour", "Potatoes", "Spices", "Ghee")),
                new Meal("Vegetable Thepla", "breakfast", Arrays.asList("Wheat Flour", "Fenugreek Leaves", "Spices", "Ghee")),
                new Meal("Paneer Bhurji Toast", "breakfast", Arrays.asList("Paneer", "Bread", "Spices")),
                new Meal("Vegetable Uttapam Pizza", "breakfast", Arrays.asList("Rice", "Urad Dal", "Vegetables", "Cheese"))
        );

        // All Lunch/Dinner Meals
        List<Meal> lunchDinnerMeals = Arrays.asList(
                new Meal("Vegetable Biryani", "lunch/dinner", Arrays.asList("Rice", "Vegetables", "Spices", "Yogurt")),
                new Meal("Paneer Butter Masala with Roti/Paratha", "lunch/dinner", Arrays.asList("Paneer", "Tomatoes", "Butter", "Cream", "Spices")),
                new Meal("Rajma Chawal", "lunch/dinner", Arrays.asList("Rajma", "Rice", "Spices", "Onions", "Tomatoes")),
                new Meal("Chole Puri", "lunch/dinner", Arrays.asList("Kabuli Chana", "Wheat Flour", "Spices", "Onions", "Tomatoes")),
                new Meal("Vegetable Pulao", "lunch/dinner", Arrays.asList("Rice", "Vegetables", "Spices")),
                new Meal("Khichadi Kadhi", "lunch/dinner", Arrays.asList("Rice", "Toor Dal", "Yogurt", "Spices")),
                new Meal("Potato Sabji and Roti", "lunch/dinner", Arrays.asList("Potatoes", "Wheat Flour", "Spices")),
                new Meal("Dal Fry and Jeera Rice", "lunch/dinner", Arrays.asList("Toor Dal", "Rice", "Spices"))
        );

        GroceryList groceryList = new GroceryList();
        boolean showMenu = true;

        while (true) {
            if (showMenu) {
                System.out.println("\nSelect an Option:");
                System.out.println("1. Prepare a weekly meal plan\n   a. Generate Grocery List");
                System.out.println("2. Suggest breakfast ideas\n   a. Select a meal and generate grocery list");
                System.out.println("3. Suggest lunch ideas\n   a. Select a meal and generate grocery list");
                System.out.println("4. Suggest dinner ideas\n   a. Select a meal and generate grocery list");
                System.out.println("5. Exit");
            }

            String choice = scanner.nextLine().trim();

            switch (choice) {
                case "1":
                    System.out.println("Generating a weekly meal plan...");
                    System.out.println("Weekly Meal Plan:");
                    Random random = new Random();

                    for (int day = 1; day <= 7; day++) {
                        Meal breakfast = breakfastMeals.get(random.nextInt(breakfastMeals.size()));
                        Meal lunch = lunchDinnerMeals.get(random.nextInt(lunchDinnerMeals.size()));
                        Meal dinner = lunchDinnerMeals.get(random.nextInt(lunchDinnerMeals.size()));

                        System.out.println("Day " + day + ":");
                        System.out.println("  Breakfast: " + breakfast.getName());
                        System.out.println("  Lunch: " + lunch.getName());
                        System.out.println("  Dinner: " + dinner.getName());

                        groceryList.addIngredients(breakfast.getIngredients());
                        groceryList.addIngredients(lunch.getIngredients());
                        groceryList.addIngredients(dinner.getIngredients());
                    }

                    System.out.println("\nComplete Grocery List for the Week:");
                    groceryList.displayList();

                    while (!groceryList.allItemsCheckedOff()) {
                        System.out.println("\nEnter an item to check off or type 'done' when finished:");
                        String item = scanner.nextLine().trim();
                        if (item.equalsIgnoreCase("done")) break;
                        groceryList.checkOffItem(item);
                        groceryList.displayList();
                    }

                    if (groceryList.allItemsCheckedOff()) {
                        System.out.println("All items checked off! You're ready for the week!");
                    }

                    showMenu = true;
                    break;
                case "2":
                    System.out.println("Breakfast Ideas:");
                    for (int i = 0; i < breakfastMeals.size(); i++) {
                        System.out.println((i + 1) + ". " + breakfastMeals.get(i).getName());
                    }
                    System.out.println("\nEnter the number to generate grocery list for a meal:");
                    int breakfastChoice = Integer.parseInt(scanner.nextLine());
                    if (breakfastChoice >= 1 && breakfastChoice <= breakfastMeals.size()) {
                        Meal selectedMeal = breakfastMeals.get(breakfastChoice - 1);
                        System.out.println("Grocery list for " + selectedMeal.getName() + ":");
                        groceryList.addIngredients(selectedMeal.getIngredients());
                        groceryList.displayList();
                        while (!groceryList.allItemsCheckedOff()) {
                            System.out.println("\nEnter an item to check off or type 'done' when finished:");
                            String item = scanner.nextLine().trim();
                            if (item.equalsIgnoreCase("done")) break;
                            groceryList.checkOffItem(item);
                            groceryList.displayList();
                        }

                        if (groceryList.allItemsCheckedOff()) {
                            System.out.println("All items checked off! You're ready to cook!");
                        }
                        showMenu = true;
                    } else {
                        System.out.println("Invalid choice.");
                        showMenu = true;
                    }
                    break;
                case "3":
                case "4":
                    List<Meal> selectedMeals = choice.equals("3") ? lunchDinnerMeals : lunchDinnerMeals;
                    String mealType = choice.equals("3") ? "Lunch" : "Dinner";

                    System.out.println(mealType + " Ideas:");
                    for (int i = 0; i < selectedMeals.size(); i++) {
                        System.out.println((i + 1) + ". " + selectedMeals.get(i).getName());
                    }
                    System.out.println("\nEnter the number to generate grocery list for a meal:");
                    int mealChoice = Integer.parseInt(scanner.nextLine());
                    if (mealChoice >= 1 && mealChoice <= selectedMeals.size()) {
                        Meal selectedMeal = selectedMeals.get(mealChoice - 1);
                        System.out.println("Grocery list for " + selectedMeal.getName() + ":");
                        groceryList.addIngredients(selectedMeal.getIngredients());
                        groceryList.displayList();
                        while (!groceryList.allItemsCheckedOff()) {
                            System.out.println("\nEnter an item to check off or type 'done' when finished:");
                            String item = scanner.nextLine().trim();
                            if (item.equalsIgnoreCase("done")) break;
                            groceryList.checkOffItem(item);
                            groceryList.displayList();
                        }

                        if (groceryList.allItemsCheckedOff()) {
                            System.out.println("All items checked off! You're ready to cook!");
                        }
                        showMenu = true;
                    } else {
                        System.out.println("Invalid choice.");
                        showMenu = true;
                    }
                    break;
                case "5":
                    System.out.println("Exiting program. Goodbye!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
                    showMenu = true;
            }
        }
    }
}
