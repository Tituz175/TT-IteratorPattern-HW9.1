public class Main {
    public static void main(String[] args) {
        WaiterBot waiterBot = new WaiterBot(new DinerMenu(), new PancakeHouseMenu());
        waiterBot.printMenu();
    }
}