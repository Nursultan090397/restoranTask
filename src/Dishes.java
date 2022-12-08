public class Dishes extends Menu {
    public Dishes(String name, int price, String volume) {
        super(name, price, volume);
    }

    @Override
    void speedOfFoodCooking() {
        System.out.println("15 minutes");
    }
}
