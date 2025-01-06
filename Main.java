import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // All Breakfast Meals
// All Breakfast Meals
        List<Meal> breakfastMeals = Arrays.asList(
                new Meal("Idli with Sambar and Coconut Chutney", "breakfast", Arrays.asList("Rice", "Urad Dal", "Salt", "Coconut", "Tamarind Paste", "Curry Leaves", "Mustard Seeds", "Green Chilies", "Sambar Powder")),
                new Meal("Masala Dosa", "breakfast", Arrays.asList("Rice", "Urad Dal", "Potatoes", "Onions", "Green Chilies", "Curry Leaves", "Turmeric", "Red Chili Powder", "Ghee")),
                new Meal("Upma", "breakfast", Arrays.asList("Semolina", "Carrots", "Beans", "Peas", "Mustard Seeds", "Curry Leaves", "Green Chilies", "Ginger", "Ghee")),
                new Meal("Poha", "breakfast", Arrays.asList("Poha", "Onions", "Green Chilies", "Curry Leaves", "Mustard Seeds", "Turmeric", "Lemon", "Peanuts")),
                new Meal("Aloo Paratha", "breakfast", Arrays.asList("Wheat Flour", "Potatoes", "Green Chilies", "Onions", "Coriander Leaves", "Garam Masala", "Red Chili Powder", "Ghee")),
                new Meal("Vegetable Thepla", "breakfast", Arrays.asList("Wheat Flour", "Fenugreek Leaves", "Green Chilies", "Yogurt", "Turmeric", "Red Chili Powder", "Ghee")),
                new Meal("Paneer Bhurji Toast", "breakfast", Arrays.asList("Paneer", "Bread", "Onions", "Green Chilies", "Tomatoes", "Coriander Leaves", "Turmeric", "Red Chili Powder")),
                new Meal("Vegetable Uttapam Pizza", "breakfast", Arrays.asList("Rice", "Urad Dal", "Onions", "Tomatoes", "Capsicum", "Cheese", "Salt")),
                new Meal("Avocado Toast with Toppings", "breakfast", Arrays.asList("Bread", "Avocado", "Lemon", "Salt", "Pepper", "Olive Oil")),
                new Meal("Burrito Bowl", "breakfast", Arrays.asList("Rice", "Black Beans", "Corn", "Avocado", "Salsa", "Sour Cream", "Cheese", "Tortilla Chips")),
                new Meal("Vegetable Sandwich", "breakfast", Arrays.asList("Bread", "Butter", "Tomatoes", "Onions", "Cucumber", "Lettuce", "Cheese")),
                new Meal("Vegetarian Bagel Sandwich", "breakfast", Arrays.asList("Bagel", "Cream Cheese", "Tomatoes", "Onions", "Lettuce")),
                new Meal("Boiled Egg", "breakfast", Arrays.asList("Eggs", "Salt")),
                new Meal("Bread and Omelette", "breakfast", Arrays.asList("Eggs", "Bread", "Onions", "Green Chilies", "Coriander Leaves", "Salt", "Pepper")),
                new Meal("Banana Smoothie", "breakfast", Arrays.asList("Bananas", "Milk", "Yogurt", "Honey (Optional)"))
        );

// All Lunch/Dinner Meals
        List<Meal> lunchDinnerMeals = Arrays.asList(
                new Meal("Vegetable Biryani", "lunch/dinner", Arrays.asList("Basmati Rice", "Carrots", "Beans", "Peas", "Yogurt", "Biryani Masala", "Turmeric", "Red Chili Powder", "Fried Onions")),
                new Meal("Paneer Butter Masala with Roti/Paratha", "lunch/dinner", Arrays.asList("Paneer", "Butter", "Tomatoes", "Cream", "Garam Masala", "Red Chili Powder", "Wheat Flour")),
                new Meal("Rajma Chawal", "lunch/dinner", Arrays.asList("Kidney Beans (Rajma)", "Rice", "Onions", "Tomatoes", "Cumin", "Turmeric", "Red Chili Powder", "Ginger")),
                new Meal("Chole Puri", "lunch/dinner", Arrays.asList("Chickpeas", "Wheat Flour", "Onions", "Tomatoes", "Chole Masala", "Turmeric", "Red Chili Powder")),
                new Meal("Vegetable Pulao", "lunch/dinner", Arrays.asList("Basmati Rice", "Carrots", "Beans", "Peas", "Cumin", "Cloves", "Bay Leaf")),
                new Meal("Khichadi Kadhi", "lunch/dinner", Arrays.asList("Rice", "Moong Dal", "Yogurt", "Curry Leaves", "Mustard Seeds", "Green Chilies")),
                new Meal("Potato Sabji and Roti", "lunch/dinner", Arrays.asList("Potatoes", "Onions", "Tomatoes", "Cumin", "Turmeric", "Red Chili Powder", "Wheat Flour")),
                new Meal("Dal Fry and Jeera Rice", "lunch/dinner", Arrays.asList("Toor Dal", "Rice", "Ghee", "Cumin Seeds", "Garlic", "Green Chilies")),
                new Meal("Chana Masala and Roti", "lunch/dinner", Arrays.asList("Chickpeas", "Onions", "Tomatoes", "Ginger", "Chana Masala", "Cumin", "Red Chili Powder", "Wheat Flour")),
                new Meal("Fried Rice", "lunch/dinner", Arrays.asList("Rice", "Carrots", "Beans", "Capsicum", "Soy Sauce", "Vinegar", "Garlic")),
                new Meal("Chole Chaat", "lunch/dinner", Arrays.asList("Chickpeas", "Onions", "Tomatoes", "Tamarind Chutney", "Sev", "Chaat Masala", "Red Chili Powder")),
                new Meal("Chana Chaat", "lunch/dinner", Arrays.asList("Chickpeas", "Onions", "Tomatoes", "Green Chilies", "Lemon", "Chaat Masala", "Black Salt")),
                new Meal("Pizza", "lunch/dinner", Arrays.asList("Pizza Base", "Pizza Sauce", "Cheese", "Capsicum", "Tomatoes", "Olives", "Oregano")),
                new Meal("White Sauce Pasta", "lunch/dinner", Arrays.asList("Pasta", "Milk", "Butter", "Flour", "Cheese", "Carrots", "Beans (Optional)")),
                new Meal("Red Sauce Pasta", "lunch/dinner", Arrays.asList("Pasta", "Tomatoes", "Garlic", "Olive Oil", "Carrots", "Capsicum (Optional)")),
                new Meal("Handvo", "lunch/dinner", Arrays.asList("Rice", "Lentils", "Yogurt", "Curry Leaves", "Mustard Seeds", "Green Chilies")),
                new Meal("Dhokla", "lunch/dinner", Arrays.asList("Gram Flour (Besan)", "Yogurt", "Curry Leaves", "Mustard Seeds", "Green Chilies")),
                new Meal("Palak Paneer and Roti/Paratha", "lunch/dinner", Arrays.asList("Spinach", "Paneer", "Butter", "Onions", "Tomatoes", "Wheat Flour")),
                new Meal("Veg Hakka Noodles", "lunch/dinner", Arrays.asList("Noodles", "Carrots", "Beans", "Capsicum", "Soy Sauce", "Vinegar", "Garlic")),
                new Meal("Pani Puri", "lunch/dinner", Arrays.asList("Semolina", "Wheat Flour", "Tamarind Chutney", "Mint Leaves", "Potatoes", "Chickpeas")),
                new Meal("Moong Daal Chilla", "lunch/dinner", Arrays.asList("Moong Dal", "Green Chilies", "Onions", "Coriander Leaves")),
                new Meal("Sandwiches", "lunch/dinner", Arrays.asList("Bread", "Butter", "Tomatoes", "Onions", "Cucumber", "Cheese"))
        );


        GroceryList groceryList = new GroceryList();
        boolean showMenu = true;

        while (true) {
            if (showMenu) {
                System.out.println("\nSelect an Option:");
                System.out.println("1. Prepare a weekly meal plan");
                System.out.println("2. Suggest breakfast ideas");
                System.out.println("3. Suggest lunch ideas");
                System.out.println("4. Suggest dinner ideas");
                System.out.println("5. Exit");
            }

            String choice = scanner.nextLine().trim();

            switch (choice) {
                case "1":
                    System.out.println("Generating a weekly meal plan...");
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

                    while (true) {
                        System.out.println("\nSelect an Option:");
                        System.out.println("1. Generate Grocery List");
                        System.out.println("2. Return to Main Menu");
                        String subChoice = scanner.nextLine().trim();

                        if (subChoice.equals("1")) {
                            System.out.println("\nComplete Grocery List for the Week:");
                            groceryList.displayList();

                            while (!groceryList.allItemsCheckedOff()) {
                                System.out.println("\nEnter an item to check off, type 'all' to check off all items, or type 'done' when finished:");
                                String item = scanner.nextLine().trim();
                                if (item.equalsIgnoreCase("done")) break;
                                if (item.equalsIgnoreCase("all")) {
                                    groceryList.checkOffAllItems(); // Check off all items
                                    break; // Exit the loop as all items are now checked off
                                }
                                groceryList.checkOffItem(item);
                                groceryList.displayList();
                            }

                            if (groceryList.allItemsCheckedOff()) {
                                System.out.println("All items checked off! You're ready for the week!");
                            }
                        } else if (subChoice.equals("2")) {
                            showMenu = true;
                            break;
                        } else {
                            System.out.println("Invalid choice. Please try again.");
                        }
                    }
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
                        while (true) {
                            System.out.println("\nSelect an Option:");
                            System.out.println("1. Generate Grocery List");
                            System.out.println("2. Return to Main Menu");
                            String subChoice = scanner.nextLine().trim();

                            if (subChoice.equals("1")) {
                                System.out.println("\nComplete Grocery List for the Week:");
                                groceryList.displayList();

                                while (!groceryList.allItemsCheckedOff()) {
                                    System.out.println("\nEnter an item to check off, type 'all' to check off all items, or type 'done' when finished:");
                                    String item = scanner.nextLine().trim();
                                    if (item.equalsIgnoreCase("done")) break;
                                    if (item.equalsIgnoreCase("all")) {
                                        groceryList.checkOffAllItems(); // Check off all items
                                        break; // Exit the loop as all items are now checked off
                                    }
                                    groceryList.checkOffItem(item);
                                    groceryList.displayList();
                                }

                                if (groceryList.allItemsCheckedOff()) {
                                    System.out.println("All items checked off! You're ready for the week!");
                                }
                            } else if (subChoice.equals("2")) {
                                showMenu = true;
                                break;
                            } else {
                                System.out.println("Invalid choice. Please try again.");
                            }
                        }
                        break;
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
