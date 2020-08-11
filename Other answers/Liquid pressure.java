import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        double g = 9.8;
        System.out.println(scanner.nextDouble() * scanner.nextDouble() * g);
    }
}