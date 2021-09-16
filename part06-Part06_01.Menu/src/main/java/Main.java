
public class Main {

    public static void main(String[] args) {
        Menu exactum = new Menu();
        Menu menu = new Menu();
        menu.addMeal("Tofu ratatouille");
        menu.addMeal("Chilli coconut chicken");
        menu.addMeal("Chilli coconut chicken01");
        menu.addMeal("Meatballs with mustard sauce");
        menu.addMeal("Chilli coconut chicken02");
        menu.addMeal("Chilli coconut chicken");
        

        menu.printMeals();
        menu.clearMenu();

      
        menu.addMeal("Tomato and mozzarella salad");
        menu.printMeals();
    }
}
