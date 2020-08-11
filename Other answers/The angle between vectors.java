import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double xa = in.nextDouble();
        double ya = in.nextDouble();
        double xb = in.nextDouble();
        double yb = in.nextDouble();
        in.close();

        double phi = Math.acos((xa * xb + ya * yb) / (Math.hypot(xa, ya) * Math.hypot(xb, yb)));
        System.out.println(Math.toDegrees(phi));
    }
}