public interface IMenu {
    void addItem(String name, String desc, boolean veg, double price);
    IIterator createIterator();
}
