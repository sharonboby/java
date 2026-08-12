package tutorial5;
import java.util.Vector;
public class ColorVector {
    public static void main(String[] args) {
        Vector<String> colors = new Vector<String>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.remove("Green");
        System.out.println("Vector after removing Green:");
        for (String color : colors) {
            System.out.println(color);
        }
    }
}