import java.util.Scanner;
public class Method {
    public static void main(String[] args) {
        firstMethod();
        secondMethod();
        thirdMethod();
        fourthMethod();
        fifthMethod();
        sixthMethod();
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
            System.out.println("Введено отрицательное число.");
        } else {
            System.out.println("Введено положительное число.");
        }
    }
    public static boolean thirdMethod() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число: ");
        int num = scanner.nextInt();
        if (num < 0) {
            return true;
        }
        return false;
    }

    public static void fourthMethod () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сообщение: " );
        String message = scanner.nextLine();
        System.out.println("Введите число: ");
        int num = scanner.nextInt();
        String repeated = message.repeat(num);
        System.out.println(repeated);
    }
    public static void fifthMethod() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Напишите год: ");
        int year = scanner.nextInt();
        boolean visokos = yesOrNo(year);
        System.out.println(visokos);

    }
    public static boolean yesOrNo(int year) {
        if (year%400 == 0 || year%4==0 && year%100 != 0){
            return true;
        } else {
            return false;
        }
    }
    public static void sixthMethod(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длину массива: ");
        int len = scanner.nextInt();
        System.out.println("Введите значения ячеек: ");
        int initialValue = scanner.nextInt();
        int[] array = new int[len];
        for (int i = 0; i < len; i++) {
            array[i] = initialValue;
        }
        for (int value : array) {
            System.out.print(value + " ");
        }
    }
}
