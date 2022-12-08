public class Salad extends Menu {
    public Salad(String name, int price, String volume) {
        super(name, price, volume);
    }

    @Override
    void speedOfFoodCooking() {
        System.out.println("10 minutes");
    }
}
