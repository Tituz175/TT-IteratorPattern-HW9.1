import java.util.ArrayList;

public class PancakeHouseMenu implements IMenu {
    ArrayList menuItems;

    public PancakeHouseMenu() {
        menuItems = new ArrayList();
        addItem("ET Pancakes", "Eggs, Toast, Pancakes", true, 2.09);
        addItem("Pancakes", "Pancakes", true, 2.09);
        addItem("ET", "Eggs & Toast", true, 2.09);
        addItem("Waffles", "Lumpy Pancakes", true, 2.09);
    }

    public void addItem(String name, String desc, boolean veg, double price) {
        MenuItem menuItem = new MenuItem(name, desc, veg, price);
        menuItems.add(menuItem);
    }

    @Override
    public IIterator createIterator() {
        return new PancakeHouseMenuIterator(menuItems);
    }
}
