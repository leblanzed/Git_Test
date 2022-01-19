package src.main.Dec6.DeepCloning;

public class Brand implements Cloneable {
     String brandName;
     String origin;

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
