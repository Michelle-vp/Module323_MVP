package Chapter02;

import java.util.List;

public class main {

    public static void main(String[] args) {
        List<String> words = List.of(
                "banana",
                "hello",
                "declarative",
                "yes",
                "java"
        );

        System.out.println("Words sorted by score:");

        List<String> sortedWords = WordEvaluator.sortWordsByScore(words);

        for (String word : sortedWords) {
            System.out.println(word + " = " + WordEvaluator.calculateScore(word));
        }
    }
}
