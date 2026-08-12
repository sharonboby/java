package tutorial5;
import java.util.Vector;
public class FruitVector {
    public static void main(String[] args) {
        Vector<String> fruits = new Vector<String>();
        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Grapes");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}