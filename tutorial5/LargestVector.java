package tutorial5;
import java.util.Vector;
public class LargestVector {
    public static void main(String[] args) {
        Vector<Integer> numbers = new Vector<Integer>();
        numbers.add(25);
        numbers.add(60);
        numbers.add(15);
        numbers.add(80);
        numbers.add(45);
        int largest = numbers.get(0);
        for (int n : numbers) {
            if (n > largest) {
                largest = n;
            }
        }
        System.out.println("Largest number = " + largest);
    }
}