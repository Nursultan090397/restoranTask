public abstract class Menu {
    private String name;
    private int price;
    private String volume;

    public Menu(String name, int price, String volume) {
        this.name = name;
        this.price = price;
        this.volume = volume;
    }

    abstract void speedOfFoodCooking();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "name='" + name + '\'' +
                ", price='" + price + '\'' +
                ", volume='" + volume + '\'' +
                '}';
    }
}
