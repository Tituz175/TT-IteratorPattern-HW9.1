public class DinerMenu implements IMenu {

    static final int MAX_ITEMS = 6;
    int numberOfItems = 0;
    MenuItem[] menuItems;

    public DinerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];

        addItem("VBLT", "Beets, Lemon, Tots", true, 2.09);
        addItem("BLT", "Bacon, Lettuce, Tomato", false, 3.09);
        addItem("Soup", "Soup of the day", true, 2.99);
        addItem("Hot Dog", "Hot dog sandwich", true, 0.99);
    }

    public void addItem(String name, String desc, boolean veg, double price) {
        MenuItem menuItem = new MenuItem(name, desc, veg, price);
        if (numberOfItems > MAX_ITEMS) {
            System.err.println("Sorry menu is full");
        } else {
            menuItems[numberOfItems] = menuItem;
            numberOfItems++;
        }
    }

    public IIterator createIterator() {
        return new DinerMenuIterator(menuItems);
    }
}

