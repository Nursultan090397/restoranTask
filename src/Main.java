import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Menu> menu = new ArrayList<>();
        menu.add(new Dushes("Lagman", 225, "1"));
        menu.add(new Dushes("Pasta", 300, "0,7"));
        menu.add(new Dushes("Pizza", 250, "30 cm"));

        menu.add(new Drinks("Coca-cola", 70, "0.3 l"));
        menu.add(new Drinks("Tea", 30, "1 l"));
        menu.add(new Drinks("Coffee", 150, "0.4 l"));

        menu.add(new Salad("Cesar", 120, "0.4"));
        menu.add(new Salad("Shakarap", 100, "0.4"));
        menu.add(new Salad("Olivie", 130, "0.4"));

        menu.add(new Desert("Bliny", 80,"2 pieces"));
        menu.add(new Desert("Ice Cream", 50,"1 pieces"));
        menu.add(new Desert("Krasnyi barhat", 100,"1 pieces"));



        Scanner scanner = new Scanner(System.in);

        String number = "null";
        while (!number.equals("x")){
            commands();
            System.out.println("Choose a command: ");
            number = scanner.nextLine();
            try{
                if (Character.isDigit(number.charAt(0))){
                    switch (number){
                        case "1" -> create(menu);
                        case "2" -> remove(menu, scanner.nextLine());
                        case "3" -> getAll(menu);
                        case "4" -> sortByPrice(menu);
                        case "5" -> getByName(menu, scanner.nextLine());
                    }
                }else {
                    throw new RuntimeException();
                }
            } catch (RuntimeException e) {
                System.out.println("It is not a button");
            }
        }


    }
    public static void create(ArrayList<Menu>menu){
        User officiant = new User("officiant");
        Scanner sc = new Scanner(System.in);
        System.out.println("Dishes: ");
        String dishes = sc.nextLine();
        System.out.println("Drinks: ");
        String drinks = sc.nextLine();

        System.out.println("Salad: ");
        String salad = sc.nextLine();
        System.out.println("Desert: ");
        String desert = sc.nextLine();
        for (int i = 0; i < menu.size(); i++) {
            if(menu.get(i).getName().equals(dishes) || drinks.equals(menu.get(i).getName()) || salad.equals(menu.get(i).getName()) || desert.equals(menu.get(i).getName())){
            }
            System.out.println("the ordering food successfully added" + menu.get(i));
        }
    }
    public static void remove(ArrayList<Menu>menu, String name){
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < menu.size(); i++) {
            if(menu.remove(menu.get(i).getName().equals(name))){
            }
            System.out.println(menu.get(i));
        }
    }
    public static void getByName(ArrayList<Menu>menu,String name){
        for (int i = 0; i < menu.size(); i++) {
            if(menu.get(i).getName().equals(name)){
                System.out.println(menu.get(i));
            }
        }
    }
    public static void getAll(ArrayList<Menu>menu){
        for (int i = 0; i < menu.size(); i++) {
            System.out.println("All products of our restaurant");
            System.out.println(menu.get(i));
        }
    }
    public static void sortByPrice(ArrayList<Menu>menu){
        menu.sort(Comparator.comparing(Menu::getPrice));
        System.out.println("Sorting by price: ");
        menu.forEach(System.out::println);
    }



    static void commands() {
        System.out.println("--------------Commands-----------------------");
        System.out.println("Press 1 to create");
        System.out.println("Press 2 to remove");
        System.out.println("Press 3 to getAll");
        System.out.println("Press 4 to sort by price");
        System.out.println("Press 5 to get by name");
        System.out.println("---------------------------------------------");
    }
}
