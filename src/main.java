import java.util.Scanner;

public class main {
    public static void main(String[] args) {
    pay();
    }

    static void pay() {
        System.out.println("Welcome to our store!");

        Scanner sc = new Scanner(System.in);
        System.out.print("Input the value of your shoppings: ");
        float shoppingValue = sc.nextFloat();

        System.out.print("Input the money: ");
        float insertedMoney = sc.nextFloat();

        float change = insertedMoney - shoppingValue;

        System.out.printf("Your change is: %.2f\n", change);
        while (change >= 200) {
            System.out.println("You received: 200 lei");
            change -= 200;
        }
        while (change >= 100) {
            System.out.println("You received: 100 lei");
            change -= 100;
        }
        while (change >= 50) {
            System.out.println("You received: 50 lei");
            change -= 50;
        }
        while (change >= 20) {
            System.out.println("You received: 20 lei");
            change -= 20;
        }
        while (change >= 10) {
            System.out.println("You received: 10 lei");
            change -= 10;
        }
        while (change >= 5) {
            System.out.println("You received: 5 lei");
            change -= 5;
        }
        while (change >= 1) {
            System.out.println("You received: 1 lei");
            change -= 1;
        }
        while (change >= 0.50) {
            System.out.println("You received: 0.5 lei");
            change -= 0.50;
        }
        while (change >= 0.1) {
            System.out.println("You received: 0.10 lei");
            change -= 0.1;
        }
        while (change >= 0.05) {
            System.out.println("You received: 0.05 lei");
            change -= 0.05;
        }
        while (change >= 0.01) {
            System.out.println("You received: 0.01 lei");
            change -= 0.01;
        }
    }

}

