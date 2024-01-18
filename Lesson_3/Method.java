import java.util.Scanner;
public class Method {
    public static void main(String[] args) {
        firstMethod();
        secondMethod();
        thirdMethod();
        fourthMethod();
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
    public static void secondMethod() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите положительное или отрицательное число: ");
        int numeric = scanner.nextInt();
        if (numeric < 0) {
            System.out.println("Введенно отрицательное число.");
        } else {
            System.out.println("Введенно положительное число.");
        }
    }
    public static void thirdMethod() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число: ");
        int num = scanner.nextInt();
        boolean res = minusOrPlus(num);
        System.out.println(res);
    }
    public static boolean minusOrPlus(int num) {
        return num < 0;
        }
    public static void fourthMethod(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сообщение: ");
        String string = scanner.nextLine();
        System.out.println("Введите число: ");
        int number = scanner.nextInt();

    }

}

