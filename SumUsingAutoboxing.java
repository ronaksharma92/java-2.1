import java.util.*;

public class SumUsingAutoboxing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("Enter integers separated by space:");
        String input = sc.nextLine();
        String[] parts = input.split(" ");

        // Autoboxing happens automatically here
        for (String s : parts) {
            Integer num = Integer.parseInt(s); // String → int → Integer (autoboxing)
            numbers.add(num);
        }

        int sum = 0;
        // Unboxing occurs automatically when retrieving Integer
        for (Integer n : numbers) {
            sum += n; // unboxing from Integer to int
        }

        System.out.println("Sum of all integers: " + sum);
        sc.close();
    }
}
