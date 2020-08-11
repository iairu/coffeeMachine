package machine;

import java.util.Scanner;

public class CoffeeMachine {
    int water = 400;
    int milk = 540;
    int beans = 120;
    int cups = 9;
    int money = 550;

    public static void main(String[] args) {
        CoffeeMachine cm = new CoffeeMachine();
        cm.printState();
        System.out.println();
        cm.initInteractiveInput();
        System.out.println();
        cm.printState();
    }
    public void initInteractiveInput() {
        Scanner in = new Scanner(System.in);
        System.out.println("Write action (buy, fill, take):");
        System.out.print("> ");
        String action = in.next();
        modifyState(action,in);
        in.close();
    }
    public void printState() {
        System.out.println("The coffee machine has:");
        System.out.println(this.water + " of water");
        System.out.println(this.milk + " of milk");
        System.out.println(this.beans + " of coffee beans");
        System.out.println(this.cups + " of disposable cups");
        System.out.println(this.money + " of money");
    }
    public void modifyState(String action, Scanner in) {
        switch (action) {
            case "buy":
                System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino:");
                System.out.print("> ");
                int kind = in.nextInt();
                switch (kind) {
                    case 1:
                        this.water -= 250;
                        this.beans -= 16;
                        this.cups--;
                        this.money += 4;
                        break;
                    case 2:
                        this.water -= 350;
                        this.milk -= 75;
                        this.beans -= 20;
                        this.cups--;
                        this.money += 7;
                        break;
                    case 3:
                        this.water -= 200;
                        this.milk -= 100;
                        this.beans -= 12;
                        this.cups--;
                        this.money += 6;
                        break;
                    default:
                        break;
                }
                break;
            case "fill":
                System.out.println("Write how many ml of water do you want to add:");
                System.out.print("> ");
                this.water += in.nextInt();

                System.out.println("Write how many ml of milk do you want to add:");
                System.out.print("> ");
                this.milk += in.nextInt();

                System.out.println("Write how many grams of coffee beans do you want to add:");
                System.out.print("> ");
                this.beans += in.nextInt();

                System.out.println("Write how many disposable cups of coffee do you want to add:");
                System.out.print("> ");
                this.cups += in.nextInt();
                break;
            case "take":
                System.out.println("I gave you $" + this.money);
                this.money = 0;
                break;
            default:
                break;
        }
    }
}
