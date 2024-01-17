import java.util.Scanner;
public class Method {
    public static void main(String[] args) {
        firstMethod();
        //checkSumSign();
        //printColor();
        //compareNumbers();
    }

    public static void firstMethod() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое целое число: ");
        int number1 = scanner.nextInt();
        System.out.println("Введите второе целое число: ");
        int number2 = scanner.nextInt();
        boolean result = trueOrFalse(number1, number2);
        System.out.println(result);
    }
        public static boolean trueOrFalse(int number1, int number2) {
            int sum = number1 + number2;
            if (sum > 10 && sum <= 20) {
                return true;
            } else {
                return false;
            }
        }

}
