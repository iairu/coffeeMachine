import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // write your code here
        int n = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.close();

        Random random = new Random(a + b);

        int sum = 0;
        for (int i = 0; i < n; i++) { // sum up n numbers
            sum += random.nextInt(b - a + 1) + a; // upper - lower + 1
        }

        System.out.println(sum);
    }
}
