import java.util.*;

public class UniqueWords {
    public static void main(String[] args) {
        String[] countriesArray = { "Russia", "USA", "England", "France", "USA",
                "Spain", "Italia", "Greece", "Armenia", "Georgia",
                "France", "USA", "Armenia", "Poland", "Belarus", "Iran", "Germany", "Ukraine"};


        Set<String> uniqueCountries = new HashSet<>();
        Map<String, Integer> wordCounts = new HashMap<>();


        for (String word : countriesArray) {
            uniqueCountries.add(word);
            wordCounts.put(word, wordCounts.getOrDefault(word, 0) + 1);
        }


        System.out.println("Список уникальных слов и количество их повторений:");
        for (String word : uniqueCountries) {
            System.out.println(word + " - " + wordCounts.get(word));
        }
    }
}
