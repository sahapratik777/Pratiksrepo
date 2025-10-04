import java.util.ArrayList;
import java.util.Scanner;

public class PartA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("Enter integers (type 'done' to finish):");
        while (true) {
            String input = sc.next();
            if (input.equalsIgnoreCase("done")) break;
            numbers.add(Integer.parseInt(input)); // Autoboxing
        }

        int sum = 0;
        for (Integer num : numbers) { // Unboxing
            sum += num;
        }

        System.out.println("Sum of integers: " + sum);
        sc.close();
    }
}
