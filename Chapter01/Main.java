package Chapter01;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        // Task 1

        System.out.println("===== Task 1 =====");

        System.out.println(Task1.calculateScore("imperative")); // 9
        System.out.println(Task1.calculateScore("no")); // 2

        System.out.println(Task1.wordScore("declarative")); // 9
        System.out.println(Task1.wordScore("yes")); // 3


        // Task 2

        System.out.println("\n===== Task 2 =====");

        List<String> friends = List.of(
                "Fritz",
                "Franz",
                "Hugo",
                "Erwin",
                "Markus",
                "Martin",
                "Heiri"
        );

        System.out.println(TipCalculator.calculateTipPercentage(friends)); //20
        System.out.println(TipCalculator.calculateTipPercentage(List.of("Fritz"))); //10
        System.out.println(TipCalculator.calculateTipPercentage(List.of())); //0

        // Task 3A

        System.out.println("\n===== Task 3A =====");

        ShoppingCartA cartA = new ShoppingCartA();

        cartA.addItem("Buch");
        cartA.addItem("Apfel");

        System.out.println(cartA.getItems());
        System.out.println(cartA.getDiscount()); //5

        cartA.removeItem("Buch");

        System.out.println(cartA.getItems());
        System.out.println(cartA.getDiscount()); //0


        // Task 3B

        System.out.println("\n===== Task 3B =====");

        ShoppingCartB cartB = new ShoppingCartB();

        cartB.addItem("Buch");
        cartB.addItem("Milch");

        System.out.println(cartB.getItems());
        System.out.println(cartB.getDiscount()); //5

        cartB.removeItem("Buch");

        System.out.println(cartB.getItems());
        System.out.println(cartB.getDiscount()); //0


        // Task 3C

        System.out.println("\n===== Task 3C =====");

        ShoppingCartC cart1 = new ShoppingCartC();

        ShoppingCartC cart2 = cart1.addItem("Buch");
        ShoppingCartC cart3 = cart2.addItem("Stift");

        System.out.println("Cart1: " + cart1.getItems());
        System.out.println("Cart2: " + cart2.getItems());
        System.out.println("Cart3: " + cart3.getItems());

        System.out.println("Discount Cart3: " + cart3.getDiscount());
    }
}
