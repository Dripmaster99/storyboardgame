import RefrigeratorJava.Refrigerator;

public class App {

    public static void main(String[] args) throws Exception {
        Refrigerator Fridge = new Refrigerator("White", "Apple", "50", true, 10, 10);
        System.out.println("Hello, World111!");
        System.out.println(Fridge.getColor());
    }
}