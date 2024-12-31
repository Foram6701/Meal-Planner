MEAL PLANNER:

This project is a Java-based Meal Planner that enables users to generate weekly meal plans, manage grocery lists, and get meal suggestions for breakfast, lunch, or dinner, all with an interactive system to check off grocery items. The project is a work-in-progress, and I plan to add more features as I learn and grow. I created this application to solve my personal challenge of spending too much time deciding what to eat, checking groceries, and making grocery lists. This program eliminates the hassle of manually planning meals, thinking of ideas, and preparing a weekly grocery list. Whenever I’m hungry, I can rely on the program to suggest meals, generate a grocery list, and help ensure I have all the necessary ingredients ready to cook.


OVERVIEW:

The Meal Planner Application is a Java-based program that helps users:

- Generate a weekly meal plan with random breakfast, lunch, and dinner options for each day.
- Create and manage a grocery list based on selected meals.
- Get suggestions for breakfast, lunch, or dinner ideas from a predefined list of meals.
- Interactively check off grocery list items as they are procured.

FEATURES:

1. **Weekly Meal Plan Generation**
   - Randomly generates a meal plan for seven days, including breakfast, lunch, and dinner.
   - Combines all meal ingredients into a comprehensive grocery list for the week.

2. **Meal Suggestions**
   - Provides predefined meal ideas for breakfast, lunch, and dinner.
   - Allows selection of a specific meal to generate its grocery list.

3. **Interactive Grocery List Management**
   - Automatically creates a grocery list based on selected meals.
   - Allows users to mark items as "checked off" until the list is complete.

HOW TO USE:

1. **Run the Application**
   - Compile and execute the `Main` class in a Java-supported environment.

2. **Main Menu Options**
   - **Option 1**: Generate a weekly meal plan and view a complete grocery list for all meals.
   - **Option 2**: View breakfast ideas and generate a grocery list for a selected meal.
   - **Option 3**: View lunch ideas and generate a grocery list for a selected meal.
   - **Option 4**: View dinner ideas and generate a grocery list for a selected meal.
   - **Option 5**: Exit the application.

3. **Interactive Grocery List**
   - After generating a grocery list, enter ingredient names to check them off.
   - Type `done` to exit the grocery list management.

EXAMPLE MENU FLOW:
```
Select an Option:
1. Prepare a weekly meal plan
2. Suggest breakfast ideas
3. Suggest lunch ideas
4. Suggest dinner ideas
5. Exit
```

- Choosing **1** generates a random weekly meal plan and displays the grocery list.
- Choosing **2**, **3**, or **4** provides meal suggestions and generates a grocery list for the selected meal.

PREDEFINED MEALS:

BREAKFAST:
- Idli with Sambar and Coconut Chutney
- Masala Dosa
- Upma
- Poha
- Aloo Paratha
- Vegetable Thepla
- Paneer Bhurji Toast
- Vegetable Uttapam Pizza

LUNCH/DINNER:

- Vegetable Biryani
- Paneer Butter Masala with Roti/Paratha
- Rajma Chawal
- Chole Puri
- Vegetable Pulao
- Khichadi Kadhi
- Potato Sabji and Roti
- Dal Fry and Jeera Rice

PROJECT STRUCTURE:

1. `Meal` Class
   - Represents a meal with its name, type, and ingredients.

2. `GroceryList` Class
   - Manages grocery items, including adding ingredients, marking items as checked off, and displaying the list.

3. `Main` Class
   - Provides the main menu and coordinates user interactions, meal planning, and grocery list management.
   - 
EXAMPLE WEEKLY PLAN OUTPUT:
```
Weekly Meal Plan:
Day 1:
  Breakfast: Idli with Sambar and Coconut Chutney
  Lunch: Vegetable Biryani
  Dinner: Paneer Butter Masala with Roti/Paratha

Day 2:
  Breakfast: Masala Dosa
  Lunch: Rajma Chawal
  Dinner: Dal Fry and Jeera Rice
...

Complete Grocery List for the Week:
- Rice (Pending)
- Urad Dal (Pending)
- Salt (Pending)
...
```

REQUIREMENTS:
- Java Development Kit (JDK)** version 8 or higher.

HOW TO RUN:
1. Clone the repository or copy the code.
2. Compile the `Main` class using the following command:
   ```
   javac Main.java
   ```
3. Run the program:
   ```
   java Main
   ```

FUTURE ENHANCEMENTS:
- Add user-defined meals and ingredients.
- Display recipes of selected meals
- Support for dietary preferences (e.g., vegan, gluten-free).
- History of last month's weekly meal plans
- Calorie based meal planning
- Integration with a graphical user interface (GUI).
- more as needed

