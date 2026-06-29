package Chapter03;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class PureFunctions {

    // Task 2 - Pure version of addToCart
    public static List<String> addToCart(List<String> cartItems, String item) {
        List<String> newCart = new ArrayList<>(cartItems);
        newCart.add(item);
        return newCart;
    }

    // Task 2 - Pure version of multiplyWithRandom
    public static double multiplyWithRandom(double number, double randomValue) {
        return number * randomValue;
    }

    // Task 2 - Pure version of printAndReturnString
    public static String returnString(String str) {
        return str;
    }

    // Task 3.1 - Recursive sum
    public static int sum(List<Integer> numbers) {
        if (numbers.isEmpty()) {
            return 0;
        }

        return numbers.get(0) + sum(numbers.subList(1, numbers.size()));
    }

    // Task 3.2 - Recursive average
    public static double average(List<Integer> numbers) {
        if (numbers.isEmpty()) {
            return 0;
        }

        return (double) sum(numbers) / numbers.size();
    }

    // Task 3.3 - Recursive alphabetical sort
    public static List<String> sortStrings(List<String> words) {
        if (words.size() <= 1) {
            return words;
        }

        String first = words.get(0);
        List<String> rest = sortStrings(words.subList(1, words.size()));

        return insertString(first, rest);
    }

    private static List<String> insertString(String word, List<String> sortedWords) {
        if (sortedWords.isEmpty()) {
            return List.of(word);
        }

        String first = sortedWords.get(0);

        if (word.compareToIgnoreCase(first) <= 0) {
            List<String> result = new ArrayList<>();
            result.add(word);
            result.addAll(sortedWords);
            return result;
        }

        List<String> result = new ArrayList<>();
        result.add(first);
        result.addAll(insertString(word, sortedWords.subList(1, sortedWords.size())));
        return result;
    }

    // Task 3.4
    public record Todo(LocalDate date, int priority, String title) {}

    public static List<Todo> sortTodos(List<Todo> todos) {
        if (todos.size() <= 1) {
            return todos;
        }

        Todo first = todos.get(0);
        List<Todo> rest = sortTodos(todos.subList(1, todos.size()));

        return insertTodo(first, rest);
    }

    private static List<Todo> insertTodo(Todo todo, List<Todo> sortedTodos) {
        if (sortedTodos.isEmpty()) {
            return List.of(todo);
        }

        Todo first = sortedTodos.get(0);

        if (compareTodos(todo, first) <= 0) {
            List<Todo> result = new ArrayList<>();
            result.add(todo);
            result.addAll(sortedTodos);
            return result;
        }

        List<Todo> result = new ArrayList<>();
        result.add(first);
        result.addAll(insertTodo(todo, sortedTodos.subList(1, sortedTodos.size())));
        return result;
    }

    private static int compareTodos(Todo a, Todo b) {
        int dateCompare = a.date().compareTo(b.date());
        if (dateCompare != 0) {
            return dateCompare;
        }

        int priorityCompare = Integer.compare(a.priority(), b.priority());
        if (priorityCompare != 0) {
            return priorityCompare;
        }

        return a.title().compareToIgnoreCase(b.title());
    }

    // Task 3.5
    public record TreeNode(String value, List<TreeNode> children) {}

    public static List<String> getLeaves(TreeNode node) {
        if (node.children().isEmpty()) {
            return List.of(node.value());
        }

        return getLeavesFromChildren(node.children());
    }

    private static List<String> getLeavesFromChildren(List<TreeNode> children) {
        if (children.isEmpty()) {
            return List.of();
        }

        List<String> result = new ArrayList<>();
        result.addAll(getLeaves(children.get(0)));
        result.addAll(getLeavesFromChildren(children.subList(1, children.size())));

        return result;
    }
}
