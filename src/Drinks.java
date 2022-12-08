import java.awt.*;

public class Drinks extends Menu {
    public Drinks(String name, int price, String volume) {
        super(name, price, volume);
    }

    @Override
    void speedOfFoodCooking() {
        System.out.println("5 minutes");
    }
}
