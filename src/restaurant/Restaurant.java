package restaurant;

import java.time.LocalDate;

public class Restaurant {

    private static Menu menu = new Menu();

    public static void main(String[] args) {

        MenuItem cheesecake = new MenuItem("cheesecake","delicious and low-calorie", 4.99, "dessert", false);
        menu.addMenuItem(cheesecake);
        MenuItem spaghetti = new MenuItem("spaghetti", "classic Italian", 8.99, "main course", false);
        menu.addMenuItem(spaghetti);
        MenuItem salad = new MenuItem("Caesar salad","green and crispy", 4.99, "appetizer", false);
        menu.addMenuItem(salad);
        MenuItem friedMushrooms = new MenuItem("fried mushrooms", "crunchy", 2.99, "appetizer", false);
        menu.addMenuItem(friedMushrooms);
        MenuItem breadsticks = new MenuItem("breadsticks","warm and tasty", 3.99, "appetizer", true);
        menu.addMenuItem(breadsticks);
        menu.setLastUpdated();
        menu.printMenu();
        System.out.println("**********");
        System.out.println("Menu Item to Print: cheesecake");
        menu.printMenuItem("cheesecake");
        System.out.println("----------------");
        System.out.println("Menu Item to Print: Caesar salad");
        menu.printMenuItem("Caesar salad");
        System.out.println("****************");
        System.out.println("Menu Item to Remove: fried mushrooms");
        menu.removeMenuItem("fried mushrooms");
        menu.printMenu();
        System.out.println("----------------");
        MenuItem moreSpaghetti = new MenuItem("spaghetti", "covered with marinara sauce", 8.99, "main course", true);
        menu.addMenuItem(spaghetti);
        menu.printMenu();
    }
}
