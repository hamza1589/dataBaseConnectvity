package singleton;

public class Laptop {
    private static Laptop laptop=null;


    private Laptop(){

    }

    public static Laptop getInstance(){
        if(laptop == null){
           laptop=new Laptop();

        }
        return laptop;


    }
    public String getModelOfLaptop(){
        return "HP";
    }













}
