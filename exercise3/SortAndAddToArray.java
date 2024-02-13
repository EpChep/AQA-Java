import java.util.*;

public class SortAndAddToArray {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("f10");
        strings.add("f15");
        strings.add("f2");
        strings.add("f4");
        strings.add("f4");

        Collections.sort(strings);

        String[] sortedArray = strings.toArray(new String[strings.size()]);

        System.out.println("Отсортированный массив строк:");
        System.out.println(Arrays.toString(sortedArray));
    }
}
