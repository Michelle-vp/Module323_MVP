package Chapter02;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class WordEvaluator {

    public static int calculateScore(String word) {
        return word.replace("a", "").length();
    }

    public static List<String> sortWordsByScore(List<String> words) {
        List<String> sortedWords = new ArrayList<>(words);

        sortedWords.sort(Comparator.comparingInt(WordEvaluator::calculateScore).reversed());

        return sortedWords;
    }
}
