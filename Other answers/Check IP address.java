import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner in = new Scanner(System.in);
        String ip = in.nextLine().trim();
        in.close();
        System.out.println(ip.matches("^(?:(?:[0-1][0-9]{0,2}|[2-9][0-9]?|2[0-5][0-5])\\.){3}(?:[0-1][0-9]{0,2}|[2-9][0-9]?|2[0-5][0-5])$") ? "YES" : "NO");
    }
}