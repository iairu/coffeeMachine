
package machine;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        System.out.println("Write how many cups of coffee you will need: ");
        Scanner in = new Scanner(System.in);
        int cups = in.nextInt();
        in.close();
        System.out.println("For " + cups + " cups of coffee you will need:");
        System.out.println((200 * cups) + " ml of water");
        System.out.println((50 * cups) + " ml of milk");
        System.out.println((15 * cups) + " g of coffee beans");
    }
}