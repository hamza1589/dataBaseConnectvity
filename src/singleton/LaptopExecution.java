package singleton;

public class LaptopExecution {
    public static void main(String[] args) {
        Laptop laptop=Laptop.getInstance();
        System.out.println(laptop.getModelOfLaptop());
    }

}
