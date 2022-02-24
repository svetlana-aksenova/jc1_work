public class Hello {


    public static void main(String[] args) {
        System.out.println();
        System.out.println("Hello World " + args[0]);

        Car myCar;
        myCar=new Car();
        new Car();
        myCar.setPrice(20_000_000);
        System.out.println(myCar.price);
        System.out.println(myCar.model);
        System.out.println(myCar.getModel().length());

    }
}
	class Car{
        int price;
        String model = "BMW X6";
    public int getPrice(){
        return price;

    }
    public void setPrice(int newPrice){
        price = newPrice;
    }
    public String getModel(){
        return model;
    }

    }
