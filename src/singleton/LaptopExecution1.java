package singleton;

public class LaptopExecution1 {
    public static void main(String[] args) {
        Laptop laptop=Laptop.getInstance();
        System.out.println(laptop.getModelOfLaptop());
    }
}
