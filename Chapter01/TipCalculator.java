package Chapter01;
import java.util.List;

public class TipCalculator {

    public static int calculateTipPercentage(List<String> names) {
        if (names == null || names.isEmpty()) {
            return 0;
        }

        if (names.size() > 5) {
            return 20;
        }

        return 10;
    }

    public static void main(String[] args) {
        List<String> friends = List.of(
                "Fritz", "Franz", "Hugo", "Erwin", "Markus", "Martin", "Heiri"
        );

        System.out.println(calculateTipPercentage(friends)); // 20
        System.out.println(calculateTipPercentage(List.of("Fritz"))); // 10
        System.out.println(calculateTipPercentage(List.of())); // 0
    }
}
