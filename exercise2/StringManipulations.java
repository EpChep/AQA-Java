import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StringManipulations {
    public static void main(String[] args) {

        List<String> strings = new ArrayList<>();
        strings.add("Highload");
        strings.add("High");
        strings.add("Load");
        strings.add("Highload");


        int countHigh = Collections.frequency(strings, "High");
        System.out.println("Количество встреч объекта \"High\": " + countHigh);


        String firstElement = strings.isEmpty() ? "0" : strings.get(0);
        System.out.println("Первый элемент коллекции: " + firstElement);

        String lastElement = strings.isEmpty() ? "0" : strings.get(strings.size() - 1);
        System.out.println("Последний элемент коллекции: " + lastElement);
    }
}
