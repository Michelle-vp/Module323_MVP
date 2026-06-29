package Chapter03;

import java.time.LocalDate;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        System.out.println("===== Task 2 =====");

        List<String> cart = List.of("Apple");
        List<String> newCart = PureFunctions.addToCart(cart, "Banana");

        System.out.println(cart);
        System.out.println(newCart);

        System.out.println(PureFunctions.multiplyWithRandom(10, 0.5));
        System.out.println(PureFunctions.returnString("Hello"));

        System.out.println("\n===== Task 3.1 =====");
        System.out.println(PureFunctions.sum(List.of(1, 2, 3, 4, 5)));

        System.out.println("\n===== Task 3.2 =====");
        System.out.println(PureFunctions.average(List.of(1, 2, 3, 4, 5)));

        System.out.println("\n===== Task 3.3 =====");
        System.out.println(PureFunctions.sortStrings(List.of("Banana", "Apple", "Orange", "Cherry")));

        System.out.println("\n===== Task 3.4 =====");

        List<PureFunctions.Todo> todos = List.of(
                new PureFunctions.Todo(LocalDate.of(2025, 5, 10), 2, "Study"),
                new PureFunctions.Todo(LocalDate.of(2025, 5, 9), 1, "Homework"),
                new PureFunctions.Todo(LocalDate.of(2025, 5, 10), 1, "Clean")
        );

        System.out.println(PureFunctions.sortTodos(todos));

        System.out.println("\n===== Task 3.5 =====");

        PureFunctions.TreeNode tree =
                new PureFunctions.TreeNode("root", List.of(
                        new PureFunctions.TreeNode("A", List.of()),
                        new PureFunctions.TreeNode("B", List.of(
                                new PureFunctions.TreeNode("B1", List.of()),
                                new PureFunctions.TreeNode("B2", List.of())
                        )),
                        new PureFunctions.TreeNode("C", List.of())
                ));

        System.out.println(PureFunctions.getLeaves(tree));
    }
}
