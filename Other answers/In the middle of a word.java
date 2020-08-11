import java.util.*;
import java.util.regex.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String part = scanner.nextLine();
        String line = scanner.nextLine();

        // in the middle -> \B matches non-boundary characters
        // sample input capitalization doesn't match sentences -> (?i) for case insensitivity
        // "part" is scanned as a line -> trim() to guarantee proper result
        String regex = "(?i)\\B" + part.trim() + "\\B";

        // regex is only used once -> one line solution or String.matches() works well enough
        // my regex is only a part of the line (no ".*" at the beginning and end) -> find() instead of matches()
        // sample output is similar to a boolean answer -> ternary operator will do
        System.out.println(Pattern.compile(regex).matcher(line).find() ? "YES" : "NO");
    }
}