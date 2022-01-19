package src.main.Dec6.DeepCloning;
import  src.main.Dec6.DeepCloning.Brand.*;

public class Car implements Cloneable {
    private String model;
    private int cylinderNum;
    private Brand brand;

    Car(String  model, int cylinderNum, Brand brand) {
        this.model = model;
        this.cylinderNum = cylinderNum;
        this.brand = brand;
    }

    public Object clone() throws CloneNotSupportedException {
        Car car = (Car) super.clone();
        Brand brand = (Brand) this.brand.clone();
        car.brand = brand;
        return car;
    }

    public static void main(String[] a) throws CloneNotSupportedException {
        Brand brand1 = new Brand();
        brand1.origin = "German";
        brand1.brandName = "Audi";

        Car car1 = new Car("SUV",6,brand1);
        Car car2 = (Car) car1.clone();
        System.out.println(car2.model);
        System.out.println(car2.cylinderNum);
        System.out.println(car2.brand.brandName);

        System.out.println(car1.toString());//address of car1 point to in heap
        System.out.println(car1.brand);
        System.out.println(car2.toString());//address of car2 point to in heap
        System.out.println(car2.brand);

    }
}
