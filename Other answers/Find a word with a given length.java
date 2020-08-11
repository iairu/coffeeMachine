import java.util.*;
import java.util.regex.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = Integer.parseInt(scanner.nextLine());
        String line = scanner.nextLine();

        // If boundary + engWordCharacter * size + boundary is found anywhere in line
        boolean found = Pattern.compile("\\b[a-zA-Z]{" + size + "}\\b").matcher(line).find();
        System.out.println(found ? "YES" : "NO");
    }
}