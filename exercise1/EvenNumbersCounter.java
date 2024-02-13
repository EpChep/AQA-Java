import java.util.Random;

public class EvenNumbersCounter {
    public static void main(String[] args) {
        int size = 10;

        Random random = new Random();

        int[] numbers = new int[size];

        for (int i = 0; i < size; i++) {
            numbers[i] = random.nextInt(100);
        }
        System.out.print("Сгенерированный массив чисел: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();

        int evenCount = 0;
        for (int number : numbers) {
            if (number % 2 == 0) {
                evenCount++;
            }
        }

        System.out.println("Количество чётных чисел: " + evenCount);
    }
}
