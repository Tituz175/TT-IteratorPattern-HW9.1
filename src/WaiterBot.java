import java.util.ArrayList;

public class WaiterBot {

    IMenu dinerMenu;
    IMenu pancakeHouseMenu;

    public WaiterBot(IMenu dinerMenu, IMenu pancakeHouseMenu) {
        this.dinerMenu = dinerMenu;
        this.pancakeHouseMenu = pancakeHouseMenu;
    }

    public void printMenu() {
        printBreakfastMenu();
        printLunchMenu();
        vegetarianMenu();
    }

    public void printBreakfastMenu() {
        System.out.println("==========Breakfast Menu==========");
        IIterator pancakeIterator = pancakeHouseMenu.createIterator();
        while (pancakeIterator.hasNext()) {
            MenuItem currentItem = (MenuItem) pancakeIterator.next();
            System.out.println("Name: " + currentItem.getName() + ", Description: " + currentItem.getDescription() + ", Cost: $" + currentItem.getPrice() + ", Vegetarian: " + currentItem.isVegetarian() + ".");
        }
    }

    public void printLunchMenu() {
        System.out.println("\n==========Lunch Menu==========");
        IIterator dinerIterator = dinerMenu.createIterator();
        while (dinerIterator.hasNext()) {
            MenuItem currentItem = (MenuItem) dinerIterator.next();
            System.out.println("Name: " + currentItem.getName() + ", Description: " + currentItem.getDescription() + ", Cost: $" + currentItem.getPrice() + ", Vegetarian: " + currentItem.isVegetarian() + ".");
        }
    }

    public boolean isVegetarian(MenuItem menuItem) {
        return menuItem.isVegetarian();
    }

    public void vegetarianMenu() {
        System.out.println("\n==========Vegetarian Menu==========");
        IIterator pancakeIterator = pancakeHouseMenu.createIterator();
        while (pancakeIterator.hasNext()) {
            MenuItem currentItem = (MenuItem) pancakeIterator.next();
            if (currentItem.isVegetarian()) {
                System.out.println("Name: " + currentItem.getName() + ", Description: " + currentItem.getDescription() + ", Cost: $" + currentItem.getPrice() + ".");
            }
        }
        IIterator dinerIterator = dinerMenu.createIterator();
        while (dinerIterator.hasNext()) {
            MenuItem currentItem = (MenuItem) dinerIterator.next();
            if (currentItem.isVegetarian()) {
                System.out.println("Name: " + currentItem.getName() + ", Description: " + currentItem.getDescription() + ", Cost: $" + currentItem.getPrice() + ".");
            }
        }
    }
}
